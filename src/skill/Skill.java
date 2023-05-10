package skill;

import pocketmon.Pikachu;
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


   /* public void nothing(Pocketmon opponent) { //0
        opponent.takeDamage(20);
    }

    public void tackle(Pocketmon opponent) { //1
        opponent.takeDamage(40);
    }

    public void hardening(Pocketmon opponent) {    //2
        opponent.defence *= 2;
    }

    public void sandwind(Pocketmon opponent) {   //3
        opponent.accuracy *= 0.8;
    }

    public void electricshock(Pocketmon opponent) {     //4
        opponent.takeDamage(60);
        opponent.setParalyzed();
        opponent.ParalyzeDepth(30);
    }

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
    } */          //14

//    public void useSkill(Pocketmon opponent, int skillNum) {
//        switch (skillNum) {
//            case 0: {nothing(opponent);}
//            case 1: {tackle(opponent);}
//            case 2: {hardening(opponent);}
//            case 3: {sandwind(opponent);}
//            case 4: {electricshock(opponent);}
//            case 5: {electromagnetic(opponent);}
//            case 6: {ember(opponent);}
//            case 7: {fireball(opponent);}
//            case 8: {fireblast(opponent);}
//            case 9: {watergun(opponent);}
//            case 10: {bubblebeam(opponent);}
//            case 11: {hydropump(opponent);}
//            case 12: {vinewhip(opponent);}
//            case 13: {petaldance(opponent);}
//            case 14: {solarbeam(opponent);}
//        }

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