package ItemList;

import Main.BattlePanel;
import Main.PocketmoncenterPanel;
import pocketmon.*;

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

    PocketmoncenterPanel itemCenter = new PocketmoncenterPanel();
    Pocketmon itemPoke = new Pocketmon();
    BattlePanel itemBattle = new BattlePanel();

//    String[] itemlist = new String[20];
    String itemlist2[] = {"potion", "superpotion", "monsterball", "superball", "antidod", "cleaner", "strangecandy"
            , "redfruit" , "bluefruit", "greenfruit","","","","","","","","","",""};

       public static HashMap<String, Integer> itemlist = new HashMap<String, Integer>();

    public Item() throws InterruptedException {
    }

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
            if(itemlist.containsKey(itemNum)){
//                this.name = name;
//                this.quantity = itemNum;
        switch (itemNum){
            case 0: {potion(my);
                break;}
            case 1: {superpotion(my); break;}
            case 2: {monsterball(my, oppos); break;}
            case 3: {superball(my, oppos); break;}
            case 4: {antidode(my); break;}
            case 5: {cleaner(my); break;}
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



    public void potion(Pocketmon t){
        t.hp += 30;
    }
    public void superpotion(Pocketmon t){
        t.hp += 50;
    }
    public void monsterball(Pocketmon my, Pocketmon oppos){

            int possiblity = (int)(Math.random()*10);
            if(possiblity>5) {


                int count = 0;
                for (count = 0; count < 6; count++) {
                    if (count == 0) {
                        if (FirstPocketmon.exist) {
                            continue;
                        } else {
                            break;
                        }
                    } else if (count == 1) {
                        if (SecondPocketmon.exist) {
                            continue;
                        } else {
                            break;
                        }
                    } else if (count == 2) {
                        if (ThirdPocketmon.exist) {
                            continue;
                        } else {
                            break;
                        }
                    } else if (count == 3) {
                        if (FourthPocketmon.exist) {
                            continue;
                        } else {
                            break;
                        }
                    } else if (count == 4) {
                        if (FifthPocketmon.exist) {
                            continue;
                        } else {
                            break;
                        }
                    } else if (count == 5) {
                        if (SixthPocketmon.exist) {
                            continue;
                        } else {
                            break;
                        }
                    }
                }

                if (count == 6) { //내 리스트가 꽉차있다면 PC로
                    itemCenter.storePoketmon(oppos);
                } else { //안곽차있다면 내 리스트로
                }
            } else {
                System.out.println("볼에서 탈출했다.");
            }
    }


    public void superball(Pocketmon my, Pocketmon oppos){
        int possiblity = (int)(Math.random()*10);
        if(possiblity>3) {

            int count = 0;
            for (count = 0; count < 6; count++) {
                if (count == 0) {
                    if (FirstPocketmon.exist) {
                        continue;
                    } else {
                        break;
                    }
                } else if (count == 1) {
                    if (SecondPocketmon.exist) {
                        continue;
                    } else {
                        break;
                    }
                } else if (count == 2) {
                    if (ThirdPocketmon.exist) {
                        continue;
                    } else {
                        break;
                    }
                } else if (count == 3) {
                    if (FourthPocketmon.exist) {
                        continue;
                    } else {
                        break;
                    }
                } else if (count == 4) {
                    if (FifthPocketmon.exist) {
                        continue;
                    } else {
                        break;
                    }
                } else if (count == 5) {
                    if (SixthPocketmon.exist) {
                        continue;
                    } else {
                        break;
                    }
                }
            }

            if (count == 6) { //내 리스트가 꽉차있다면 PC로
                itemCenter.storePoketmon(oppos);
            } else { //안곽차있다면 내 리스트로
            }
        } else {
            System.out.println("볼에서 탈출했다. ");
        }
    }

    public void antidode(Pocketmon t){
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
