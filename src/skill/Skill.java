package skill;

import pocketmon.Pikachu;
import pocketmon.Pocketmon;

public class Skill extends Thread{

    int damage=0;
    boolean speical;
            //paralyze, poison, accuracy+-, defend+-
    String type;
    boolean feature;
    int skillnum;
    int depth;

    Thread poisonthread = new Thread();


    public void nothing(Pocketmon opponent){ //0
        opponent.takeDamage(20);
    }
    public void tackle(Pocketmon opponent){ //1
        opponent.takeDamage(damage);
    }

    public void hardening(Pocketmon opponent){    //2
        opponent.defence*=2;
    }
    public void sandwind(Pocketmon opponent){   //3
        opponent.accuracy*=0.8;
    }
    public void electricshock(Pocketmon opponent){     //4
        opponent.takeDamage(60);
        opponent.setParalyzed();
        opponent.ParalyzeDepth(30);
    }
    public void electromagnetic(Pocketmon opponent){
        opponent.setParalyzed();
        opponent.ParalyzeDepth(100);
    }     //5
    public void ember(Pocketmon opponent){
        opponent.takeDamage(60);

    }               //6
    public void fireball(Pocketmon opponent){
        opponent.takeDamage(80);
    }            //7
    public void fireblast(Pocketmon opponent){
        opponent.takeDamage(100);
    }           //8
    public void watergun(Pocketmon opponent){
        opponent.takeDamage(60);
    }            //9
    public void bubblebeam(Pocketmon opponent){
        opponent.takeDamage(80);
    }          //10
    public void hydropump(Pocketmon opponent){
        opponent.takeDamage(100);
    }           //11
    public void vinewhip(Pocketmon opponent){
        opponent.takeDamage(60);
    }            //12
    public void petaldance(Pocketmon opponent){
        opponent.takeDamage(80);
    }          //13
    public void solarbeam(Pocketmon opponent){
        opponent.takeDamage(100);
    }           //14

    public void useSkill(int skillNum) {
        switch (skillNum) {
            case 0:
            case 1:
            case 2:
.....
            case 14:
        }




            public void paralyze () {

            }
            public void poison () {
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

            }

        }
    }