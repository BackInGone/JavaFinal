package pocketmon;

public class Charizard extends Charmender {

    public Charizard(int level){
        super(level);
        this.hp = (int)(250 + (this.level)*hpgrow);
        this.level = level;
        this.attack = 1.2F + (this.level)*attackgrow;
        this.defence = 1.1F + (this.level)*defencegrow;
        this.accuracy = 100;
        this.type = "fire";
        this.name = "리자드";
        this.hpgrow = 1.015F;
        this.attackgrow = 1.02F;
        this.defencegrow = 1.015F;
        this.maxPP = maxPP;
        this.maxPP[1] = 20;
        this.maxPP[2] = 15;
        this.PP = PP;
        this.skill = skill;
        this.skill[1] = 1;
        this.skill[2] = 6;
        //10에 진화
        //12 에 스킬7
    }
}
