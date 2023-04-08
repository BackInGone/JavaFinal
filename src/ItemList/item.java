package ItemList;

import pocketmon.Pocketmon;

public class item {

    int hpnum;
    static int portion;
    static int superportion;
    static int monsterball;
    static int superball;
    static int antidode;
    static int cleaner;
    static int stragecandy;

    static int redfruit;
    static int bluefruit;
    static int greenfruit;

//    public setHPup(int hpnum){
//        this.hpnum = hpnum;
//    }

    public void setHpnum(){
        Pocketmon charmender = new Pocketmon();
        charmender.hp = 30;
        this.hpnum += 30;
    }


}
