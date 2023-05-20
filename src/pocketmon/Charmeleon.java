package pocketmon;

public class Charmeleon extends Charizard {



    public Charmeleon(int level){
        super(level);
        this.hp = 250;
        this.level = level;
        this.attack = 1.2F;
        this.defence = 1.1F;
        this.accuracy = 100;
        this.type = "fire";
        this.name = "리자드";
        this.hpgrow = 1.015F;
        this.attackgrow = 1.02F;
        this.defencegrow = 1.015F;
        this.maxPP = maxPP;
        this.PP = PP;
        this.skill = skill;

    }
}
