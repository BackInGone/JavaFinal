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
        this.maxPP[3] = 0;
        this.maxPP[4] = 0;

        this.PP = PP;
        this.PP[1] = maxPP[1];
        this.PP[2] = maxPP[2];
        this.PP[3] = maxPP[3];
        this.PP[4] = maxPP[4];

        this.skill = skill;
        this.skill[1] = 1;
        this.skill[2] = 6;
    }

}
