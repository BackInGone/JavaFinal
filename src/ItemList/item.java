package ItemList;

import pocketmon.Pocketmon;

public class item {

    int hpnum;

//    public setHPup(int hpnum){
//        this.hpnum = hpnum;
//    }

    public void setHpnum(){
        Pocketmon charmender = new Pocketmon();
        charmender.hp = 30;
        this.hpnum += 30;
    }


}
