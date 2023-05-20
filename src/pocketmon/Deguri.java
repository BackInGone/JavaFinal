package pocketmon;

public class Deguri extends Kkomastone {
    Deguri(int level) {
        super(level);
        this.hp = 300;
        this.level = level;
        this.attack = 1.1F;
        this.defence = 1.3F;
        this.accuracy = 100;
        this.type = "Stone";
        this.name = "데구리";
        this.hpgrow = 1.015F;
        this.attackgrow = 1.015F;
        this.defencegrow = 1.015F;
        this.maxPP = maxPP;
        this.PP = PP;
        this.skill = skill;
    }
}
