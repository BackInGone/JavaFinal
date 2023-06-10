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
        switch (skillNum) {
            case 0: {
                nothing(t);
                System.out.println("발버둥치기!");
                break;}
            case 1: {
                tackle(t);
                System.out.println("몸통박치기");
                break;}
            case 2: {hardening(t);
                System.out.println("단단해지기!"); break;}
            case 3: {sandwind(t);
                System.out.println("모래바람!");break;}
            case 4: {electricshock(t);
                System.out.println("전기충격!");break;}
            case 5: {electromagnetic(t);
                System.out.println("전자기파!");break; }
            case 6: {ember(t);
                System.out.println("불꽃!");break;}
            case 7: {fireball(t);
                System.out.println("파이어볼!");break;}
            case 8: {fireblast(t);
                System.out.println("화염방사!");break;}
            case 9: {watergun(t);
                System.out.println("물대포!");break;}
            case 10: {bubblebeam(t);
                System.out.println("거품광선!");;}
            case 11: {hydropump(t);
                System.out.println("하이드로펌프!");break;}
            case 12: {vinewhip(t);
                System.out.println("덩쿨채찍!");;}
            case 13: {petaldance(t);
                System.out.println("꽃입 댄스!");break;}
            case 14: {solarbeam(t);
                System.out.println("솔라빔!");break;}
            case 15: {thunder(t);
                System.out.println("번개~!");break;}
            case 16: {wingattack(t);
                System.out.println("날개치기!");break;}
            case 17: {torando(t);
                System.out.println("회오리공격!");break;}
            case 18: {bite(t);
                System.out.println("물기!");break;}
            case 19: {crush(t);
                System.out.println("깨물어부수기!");break;}
            case 20: {rockslice(t);
                System.out.println("락슬라이스!");break;}
            case 21: {stoneshower(t);
                System.out.println("스톤샤워!");break;}

            }
        }




    //Skilllist
    public void nothing(Pocketmon opponent) { //0
        skillInBattlePoke.takeDamage(20);
        opponent.takeDamage(30);
    } //0
    public void tackle(Pocketmon opponent) { //1
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