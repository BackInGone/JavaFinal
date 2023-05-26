package pocketmon;

public class Kkobook extends Pocketmon{

    public Kkobook(int level) {
        this.hp = 150;
        this.level = level;
        this.attack = 1.1F;
        this.defence = 1.1F;
        this.accuracy = 100;
        this.type = "water";
        this.name = "꼬부기";
        this.hpgrow = 1.01F;
        this.attackgrow = 1.01F;
        this.defencegrow = 1.01F;
        this.maxPP = maxPP;
        this.maxPP[1] = 20;
        this.maxPP[2] = 10;
        this.maxPP[3] = 8;
        this.PP = PP;
        this.skill = skill;
        this.skill[1] = 1;
        this.skill[2] = 6;
        this.skill[3] = 7;
    }
}
