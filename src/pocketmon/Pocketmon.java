package pocketmon;

import Battle.Battle;
import ItemList.Item;
import person.Trainer;
import skill.Skill;

import java.awt.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Pocketmon {

    public static int tmp;

    public int index;
    public int exp;
    public int hp;
    public int attack;
    public int depend;
    public int accuracy;
    public String type;
    public boolean faintcheck;
    public float hpgrow;
    public float attackgrow;
    public float dependgrow;
    public int pp1;
    public int pp2;
    public int pp3;
    public int pp4;

    static Pocketmon tmp1 = new Pocketmon();
//    Item pokeitem = new Item();
    Scanner itemscan = new Scanner(System.in);
    
    public int setHp(int hp) {
        System.out.println("메소드 안에서 값 =" + this.hp);
        this.hp = hp;
        this.hp += 40;
        return this.hp;
    }
    public void takeDamage(){}
    public void isFainted(){}
    public void catchPokemon(){
       new = tmp1;
    }


    int[] skill = new int[3];
        
    public void useItem(Pocketmon){
        if(itemscan.equals("potion")){
             this.hp +=30;
            }
        else if (itemscan.equals("superpotion")) {
            this.hp += 50;
            }
        else if (itemscan.equals("monsterball")) {
            if(this instanceof Trainer){

            }
        }

        }


    }
