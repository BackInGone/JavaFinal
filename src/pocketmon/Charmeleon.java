package pocketmon;

public class Charmeleon extends Charizard {



    public Charmeleon(int level){
        super(level);
        this.hp = (int)(550 + (this.level)*hpgrow);
        this.level = level;
        this.attack = 1.4F + (this.level)*attackgrow;
        this.defence = 1.2F+ (this.level)*defencegrow;
        this.accuracy = 100;
        this.type = "fire";
        this.name = "리자몽";
        this.hpgrow = 1.02F;
        this.attackgrow = 1.03F;
        this.defencegrow = 1.02F;
        this.maxPP = maxPP;
        this.maxPP[1] = 20;
        this.maxPP[2] = 10;
        this.maxPP[3] = 8;
        this.PP = PP;
        this.skill = skill;
        this.skill[1] = 1;
        this.skill[2] = 6;
        this.skill[3] = 7;
        //20에 진화
        //22 에 스킬8

    }
}
