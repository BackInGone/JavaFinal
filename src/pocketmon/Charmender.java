package pocketmon;

public class Charmender extends Pocketmon{

    public Charmender(int level) {

        this.hp = (int)(150 + (this.level)*hpgrow);
        this.level = level;
        this.attack = 1F + (this.level)*attackgrow;
        this.defence = 1F + (this.level)*defencegrow;
        this.accuracy = 100;
        this.type = "fire";
        this.name = "파이리";
        this.hpgrow = 1.01F;
        this.attackgrow = 1.01F;
        this.defencegrow = 1.01F;
        this.maxPP = maxPP;
        this.maxPP[1] = 20;
        this.maxPP[2] = 10;
        this.PP = PP;
        this.skill = skill;
        this.skill[1] = 1;
        this.skill[2] = 6;
    }

}
