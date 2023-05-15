package ItemList;

import pocketmon.Pocketmon;

import java.util.HashMap;
import java.util.Scanner;

public class Item {

    int name;
    int quantity;

    int hpnum;
    static int potion;
    static int superpotion;
    static int monsterball;
    static int superball;
    static int antidode;
    static int cleaner;
    static int strangecandy;

    static int redfruit;
    static int bluefruit;
    static int greenfruit;


    String[] itemlist = new String[20];
    String itemlist2[] = {"potion", "superpotion", "monsterball", "superball", "antidod", "cleaner", "strangecandy"
            , "redfruit" , "bluefruit", "greenfruit","","","","","","","","","",""};

       public static HashMap<String, Integer> itemlist3 = new HashMap<String, Integer>();

        public void makeitemlist (HashMap<String, Integer> list, int key) {
            list.put("potion", 1);
            list.put("superpotion", 2);
            list.put("monsterball", 3);
            list.put("superball", 4);
            list.put("antidode", 5);
            list.put("cleaner", 6);
            list.put("strangeCandy", 7);
            list.put("redfruit", 8);
            list.put("bluefruit", 9);
            list.put("greenfruit", 10);
            list.put("firestone", 11);
            list.put("waterstone", 12);
            list.put("grassstone", 13);
            list.put("electricstone", 14);
        }

    public void useItem(Pocketmon my, Pocketmon oppos){
        Scanner scan = new Scanner(System.in);
        int itemNum = scan.nextInt();
            if(itemlist3.containsKey(itemNum)){
//                this.name = name;
//                this.quantity = itemNum;
        switch (itemNum){
            case 0: {potion();
                break;}
            case 1: {superpotion(); break;}
            case 2: {monsterball(); break;}
            case 3: {superball(); break;}
            case 4: {antidode(); break;}
            case 5: {cleaner(); break;}
            case 6: {strangeCandy(my); break;}
            case 7: //{redfruit(); break;}
            case 8: //{bluefruit(); break;}
            case 9: //{greenfruit(); break;}
            case 10://{firestone(); break;}
            case 11://{waterstssssssssssssssssssss
            case 12:
            case 13:
            case 14:
        }
            }

    }



    public void potion(Pocketmon t, int tmpHP){
        t.hp += 30;
    }
    public void superportion(Pocketmon t, int tmpHP){
        t.hp += 50;
    }
    public void monsterball(Pocketmon t){
        
    }
    public void superball(Pocketmon t){

    }public void antidode(Pocketmon t){
        if(t.isPoisoned){
            t.isPoisoned=false;
        }
    }public void cleaner(Pocketmon t){
        if(t.isParalyzed||t.isPoisoned){
            t.isParalyzed = false;
            t.isPoisoned = false;
        }
    }public void strangeCandy(Pocketmon t){
        t.level ++;
    }
    public void redfrudit(){

    }
    public void greenfruit(){

    }
    public void bluefruit(){

    }
    public void firestone(Pocketmon t){
//        파이리 >> 리자드
//                리자드 >> 리자몽

    }
    public void waterstone(Pocketmon t){
//        꼬부기 >> 어니부기
//                어니부기 >> 거북왕

    }public void grassstone(Pocketmon t){
//        이상해씨 >> 이상해풀
//                이상해풀 >> 이상해꽃
    }public void electricstone(Pocketmon t){
//        피카츄 >> 라이츄
    }




}
