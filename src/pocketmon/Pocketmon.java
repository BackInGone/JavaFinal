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
        Skill battleSkill = new Skill();
//        battleSkill.useSkill();

//    public int move(int inputMove){
//        //Trainer의 포켓몬은 여기가 스태틱 값들로 다름.
//        switch(inputMove){
//            case0:
//            battleSkill.useSkill(tmp1, 0);
//            case1:
//            battleSkill.useSkill(skill[1]);
//            case2:
//            useSkill(skill[2]);
//            case3:
//            useSkill(skill[3]);
//            case4:
//            useSkill(skill[4]);
//        }
//    }

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

    public void useSkill(Pocketmon opponent, int skillNum) {
        switch (skillNum) {
            case 0: {nothing(opponent);}
            case 1: {tackle(opponent);}
            case 2: {hardening(opponent);}
            case 3: {sandwind(opponent);}
            case 4: {electricshock(opponent);}
            case 5: {electromagnetic(opponent);}
            case 6: {ember(opponent);}
            case 7: {fireball(opponent);}
            case 8: {fireblast(opponent);}
            case 9: {watergun(opponent);}
            case 10: {bubblebeam(opponent);}
            case 11: {hydropump(opponent);}
            case 12: {vinewhip(opponent);}
            case 13: {petaldance(opponent);}
            case 14: {solarbeam(opponent);}

            }
        }


    public void nothing(Pocketmon opponent) { //0
        opponent.takeDamage(20);
    }

    public void tackle(Pocketmon opponent) { //1
        opponent.takeDamage(40);
    }

    public void hardening(Pocketmon opponent) {    //2
        opponent.defence *= 2;
    }

    public void sandwind(Pocketmon opponent) {   //3
        opponent.accuracy *= 0.8;
    }

    public void electricshock(Pocketmon opponent) {     //4
        opponent.takeDamage(60);
        opponent.setParalyzed();
        opponent.ParalyzeDepth(30);
    }

    public void electromagnetic(Pocketmon opponent) {
        opponent.setParalyzed();
        opponent.ParalyzeDepth(100);
    }     //5

    public void ember(Pocketmon opponent) {
        opponent.takeDamage(60);

    }               //6

    public void fireball(Pocketmon opponent) {
        opponent.takeDamage(80);
    }            //7

    public void fireblast(Pocketmon opponent) {
        opponent.takeDamage(100);
    }           //8

    public void watergun(Pocketmon opponent) {
        opponent.takeDamage(60);
    }            //9

    public void bubblebeam(Pocketmon opponent) {
        opponent.takeDamage(80);
    }          //10

    public void hydropump(Pocketmon opponent) {
        opponent.takeDamage(100);
    }           //11

    public void vinewhip(Pocketmon opponent) {
        opponent.takeDamage(60);
    }            //12

    public void petaldance(Pocketmon opponent) {
        opponent.takeDamage(80);
    }          //13

    public void solarbeam(Pocketmon opponent) {
        opponent.takeDamage(100);
    }

    }

