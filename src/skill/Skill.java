package skill;

import pocketmon.Pikachu;
import pocketmon.Pocketmon;

public class Skill extends Thread{

    int damage;
    boolean speical;
            //paralyze, poison, accuracy+-, defend+-
    String type;
    boolean feature;
    int skillnum;

    Pocketmon me = new Pocketmon();
    Pocketmon oppo = new Pocketmon();
    Thread poisonthread = new Thread();

    public void tackle(){}              //1
    public void hardening(){}           //2
    public void sandwind(){}            //3
    public void electricshock(){}       //4
    public void electromagnetic(){}     //5
    public void ember(){}               //6
    public void fireball(){}            //7
    public void fireblast(){}           //8
    public void watergun(){}            //9
    public void bubblebeam(){}          //10
    public void hydropump(){}           //11
    public void vinewhip(){}            //12
    public void petaldance(){}          //13
    public void solarbeam(){}           //14


    public void paralyze(){

    }
    public void poison(){
        poisonthread.start();
    }
    public void accuracydown(int x){
        oppo.accuracy += x;
    }
        public void run() {
                oppo.hp -= 1;
            try {
                poisonthread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

        }

}
