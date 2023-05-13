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
    String itemlist2[] = {"potion", "superpotion", "monsterball", "superball", "antidod", "cleaner", "strangecandy"
            , "redfruit" , "bluefruit", "greenfruit","","","","","","","","","",""};

    public static HashMap<String,Integer> itemlist3 = new HashMap<String,Integer>();

    public static void makeitemlist() {
            itemlist3.put("potion",1);
            itemlist3.put("superpotion",2);
            itemlist3.put("monsterball",3);
            itemlist3.put("superball",4);
            itemlist3.put("antidode",5);
            itemlist3.put("cleaner",6);
            itemlist3.put("strabgecandy",7);
            itemlist3.put("redfruit",8);
            itemlist3.put("bluefruit",9);
            itemlist3.put("greenfruit",10);
            itemlist3.put("firestone",11);
            itemlist3.put("waterstone",12);
            itemlist3.put("grassstone",13);
            itemlist3.put("electrictone",14);
    }






}
