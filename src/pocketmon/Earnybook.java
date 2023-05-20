package pocketmon;

public class Earnybook extends Kkobook {
    Earnybook(int level) {
        super(level);
        this.hp = 250;
        this.level = level;
        this.attack = 1.1F;
        this.defence = 1.2F;
        this.accuracy = 100;
        this.type = "water";
        this.name = "어니부기";
        this.hpgrow = 1.02F;
        this.attackgrow = 1.015F;
        this.defencegrow = 1.02F;
        this.maxPP = maxPP;
        this.PP = PP;
        this.skill = skill;
    }
}
