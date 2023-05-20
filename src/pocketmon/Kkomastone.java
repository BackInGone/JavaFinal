package pocketmon;

public class Kkomastone extends Pocketmon {
    public Kkomastone(int level) {
        this.hp = 100;
        this.level = level;
        this.attack = 1.1F;
        this.defence = 1.3F;
        this.accuracy = 100;
        this.type = "Stone";
        this.name = "딱구리";
        this.hpgrow = 1.01F;
        this.attackgrow = 1.01F;
        this.defencegrow = 1.01F;
        this.maxPP = maxPP;
        this.PP = PP;
        this.skill = skill;
    }
}