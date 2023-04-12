package pocketmon;

import skill.Skill;

import java.awt.*;
import java.util.ArrayList;

public class Pocketmon {

    public static int tmp;


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

    Pocketmon tmp1 = new Pocketmon();

    public int setHp(int hp) {
        System.out.println("메소드 안에서 값 =" + this.hp);
        this.hp = hp;
        this.hp += 40;
        return this.hp;
    }
    public void takeDamage(){}
    public void isFainted(){}


    int[] skill = new int[3];
//
//    public static move(new Skill){
//
//    }


}
