package skill;

import pocketmon.Pocketmon;

public class Skill {

    int damage = 0;
    boolean speical;
    //paralyze, poison, accuracy+-, defend+-
    String type;
    boolean feature;
    int skillnum;
    int depth;

    Thread poisonthread = new Thread();

    public void useSkill(Pocketmon t, int skillnum){
        System.out.println("useSkill 들어오고 t.hp = " + t.hp);
        nothing(t);
    }

     public void doSkill(Pocketmon t, int skillNum) {
         System.out.println("doskill 들어오고 t.hp = " + t.hp);
        switch (skillNum) {
            case 0: {
                System.out.println("case0 들어오고 t.hp = " + t.hp);
                nothing(t);
                break;}
            case 1: {
                System.out.println("case1 들어오고 t.hp = " + t.hp);
                tackle(t);
                break;}
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

            }
        }




    //Skilllist
    public void nothing(Pocketmon opponent) { //0
        System.out.println("nothing 들어오고 t.hp = " + opponent.hp);
        opponent.takeDamage(20);
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
        opponent.setParalyzed();
        opponent.ParalyzeDepth(30);
    }   //4
    public void electromagnetic(Pocketmon opponent) {
        opponent.setParalyzed();
        opponent.ParalyzeDepth(100);
    }     //5
    public void ember(Pocketmon opponent) {
        opponent.takeDamage(60);

    }               //6
    public void fireball(Pocketmon opponent) {
        opponent.takeDamage(80);
    }            //7
    public void fireblast(Pocketmon opponent) {
        opponent.takeDamage(100);
    }           //8
    public void watergun(Pocketmon opponent) {
        opponent.takeDamage(60);
    }            //9
    public void bubblebeam(Pocketmon opponent) {
        opponent.takeDamage(80);
    }          //10
    public void hydropump(Pocketmon opponent) {
        opponent.takeDamage(100);
    }           //11
    public void vinewhip(Pocketmon opponent) {
        opponent.takeDamage(60);
    }            //12
    public void petaldance(Pocketmon opponent) {
        opponent.takeDamage(80);
    }          //13
    public void solarbeam(Pocketmon opponent) {
        opponent.takeDamage(100);
    }       //14


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