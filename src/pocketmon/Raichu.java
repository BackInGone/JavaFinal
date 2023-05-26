package pocketmon;

public class Raichu extends Pikachu{
    public Raichu(int level) {
        super(level);
        this.hp = 400;
        this.level = level;
        this.attack = 1.3F;
        this.defence = 1.1F;
        this.accuracy = 100;
        this.type = "Electric";
        this.name = "라이츄";
        this.hpgrow = 1.015F;
        this.attackgrow = 1.02F;
        this.defencegrow = 1.015F;
        this.maxPP[1] = 20;
        this.maxPP[2] = 15;
        this.maxPP[3] = 10;
        this.PP = PP;
        this.skill = skill;
        this.skill[1] = 1;
        this.skill[2] = 4;
        this.skill[3] = 5;
    }
}
