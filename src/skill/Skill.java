package skill;

import Battle.Battle;
import Main.BattlePanel;
import pocketmon.BattlePoke;
import pocketmon.Pocketmon;

public class Skill {

    int damage = 0;
    boolean speical;
    //paralyze, poison, accuracy+-, defend+-
    String type;
    boolean feature;
    int skillnum;
    int depth;
    BattlePoke skillInBattlePoke = new BattlePoke();

    Thread poisonthread = new Thread();

    public Skill() throws InterruptedException {
    }

    public void useSkill(Pocketmon t, int skillnum){
        System.out.println("useSkill 들어오고 t.hp = " + t.hp);
        nothing(t);
    }

     public void doSkill(Pocketmon t, int skillNum) {
         System.out.println("doskill 들어오고 상대방 hp = " + t.hp);
        switch (skillNum) {
            case 0: {
                System.out.println("case0 들어오고 상대방 hp = " + t.hp);
                nothing(t);
                System.out.println("case0사용 후 상대방 hp =" + t.hp);
                break;}
            case 1: {
                System.out.println("case1 들어오고 상대방.hp = " + t.hp);
                tackle(t);
                System.out.println("case1사용 후 상대방 hp =" + t.hp);

                }
            case 2: {hardening(t); break;}
            case 3: {sandwind(t); break;}
            case 4: {electricshock(t); break;}
            case 5: {electromagnetic(t);break; }
            case 6: {ember(t);break;}
            case 7: {fireball(t);break;}
            case 8: {fireblast(t);break;}
            case 9: {watergun(t);break;}
            case 10: {bubblebeam(t);break;}
            case 11: {hydropump(t);break;}
            case 12: {vinewhip(t);break;}
            case 13: {petaldance(t);break;}
            case 14: {solarbeam(t);break;}
            case 15: {thunder(t);break;}
            case 16: {wingattack(t);break;}
            case 17: {torando(t);break;}
            case 18: {bite(t);break;}
            case 19: {crush(t);break;}
            case 20: {rockslice(t);break;}
            case 21: {stoneshower(t);break;}

            }
        }




    //Skilllist
    public void nothing(Pocketmon opponent) { //0
        System.out.println("nothing 들어오고 t.hp = " + opponent.hp);
        skillInBattlePoke.takeDamage(20);
        opponent.takeDamage(30);
    } //0
    public void tackle(Pocketmon opponent) { //1
        System.out.println("tackle 들어오고 t.hp = " + opponent.hp);
        opponent.takeDamage(40);
    }   //1
    public void hardening(Pocketmon opponent) {    //2
        opponent.defence *= 2;
    }   //2
    public void sandwind(Pocketmon opponent) {   //3
        opponent.accuracy *= 0.8;
    }   //3
    public void electricshock(Pocketmon opponent) {     //4
        opponent.takeDamage(60);
        opponent.setParalyzed(30);
    }   //4
    public void electromagnetic(Pocketmon opponent) {
        opponent.setParalyzed(100);
    }     //5
    public void ember(Pocketmon opponent) {
        opponent.takeDamage(60);

    }               //6
    public void fireball(Pocketmon opponent) {
        opponent.takeDamage(80);
    }     //7
    public void fireblast(Pocketmon opponent) {
        opponent.takeDamage(100);
    }   //8
    public void watergun(Pocketmon opponent) {
        opponent.takeDamage(60);
    }     //9
    public void bubblebeam(Pocketmon opponent) {
        opponent.takeDamage(80);
    }   //10
    public void hydropump(Pocketmon opponent) {
        opponent.takeDamage(100);
    }   //11
    public void vinewhip(Pocketmon opponent) {
        opponent.takeDamage(60);
    }     //12
    public void petaldance(Pocketmon opponent) {
        opponent.takeDamage(80);
    }   //13
    public void solarbeam(Pocketmon opponent) {
        opponent.takeDamage(100);
    }   //14
    public void thunder(Pocketmon opponent) {
        opponent.takeDamage(100);
    }   //15
    public void wingattack(Pocketmon opponent) {
        opponent.takeDamage(50);
    }   //16
    public void torando(Pocketmon opponent) {
        opponent.takeDamage(80);
    }   //17
    public void bite(Pocketmon opponent) {
        opponent.takeDamage(50);
    }   //18
    public void crush(Pocketmon opponent) {
        opponent.takeDamage(70);
    }   //19
    public void rockslice(Pocketmon opponent) {
        opponent.takeDamage(60);
    }   //20
    public void stoneshower(Pocketmon opponent) {
        opponent.takeDamage(90);
    }   //21


 /*           public void paralyze() {

            }
            public void poison() {
                poisonthread.start();
            }
            public void accuracydown ( int x){
                accuracy += x;
            }
            public void run () {
                hp -= 1;
                try {
                    poisonthread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }

            }*/
    }