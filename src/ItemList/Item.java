package ItemList;

import pocketmon.Pocketmon;

import java.util.HashMap;

public class Item {

    int hpnum;
    static int portion;
    static int superportion;
    static int monsterball;
    static int superball;
    static int antidode;
    static int cleaner;
    static int strabgecandy;

    static int redfruit;
    static int bluefruit;
    static int greenfruit;


    String[] itemlist = new String[20];
    String itemlist2[] = {"portion", "superportion", "monsterball", "superball", "antidod", "cleaner", "strangecandy"
            , "redfruit" , "bluefruit", "greenfruit","","","","","","","","","",""};

    public static HashMap<String,Integer> itemlist3 = new HashMap<String,Integer>();

    public static void makeitemlist() {
            itemlist3.put("portion",1);
            itemlist3.put("superportion",2);
            itemlist3.put("monsterball",3);
            itemlist3.put("superball",4);
            itemlist3.put("antidode",5);
            itemlist3.put("cleaner",6);
            itemlist3.put("strabgecandy",7);
            itemlist3.put("redfruit",8);
            itemlist3.put("bluefruit",9);
            itemlist3.put("greenfruit",10);

    }
    public void setHpnum(){
        Pocketmon charmender = new Pocketmon();
        charmender.hp = 30;
        this.hpnum += 30;
    }


}
