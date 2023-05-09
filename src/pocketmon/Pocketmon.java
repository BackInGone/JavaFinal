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
    public int defence;
    public int accuracy;
    public String type;
    public int depth;

    public float hpgrow;
    public float attackgrow;
    public float dependgrow;
    public boolean isParalyzed;

    int[] maxPP = new int[4];
    int[] PP = new int[4];
    int[] skill = new int[4];


    static Pocketmon tmp1 = new Pocketmon();

    public int move(int inputMove){
        Skill battleSkill = new Skill();
        //Trainer의 포켓몬은 여기가 스태틱 값들로 다름.
        switch(inputMove){
            case0:
            battleSkill.useSkill(0);
            case1:
            battleSkill.useSkill(skill[1]);
            case2:
            battleSkill.useSkill(skill[2]);
            case3:
            battleSkill.useSkill(skill[3]);
            case4:
            battleSkill.useSkill(skill[4]);
        }
    }

    public void takeDamage ( int damage){
        hp -= damage;
        if (hp < 0) {
            hp = 0;
        }
    }
    public boolean setParalyzed(){
        isParalyzed=true;
        return isParalyzed;
    }
    public int ParalyzeDepth(int depth){
        return depth;
    }



    }
