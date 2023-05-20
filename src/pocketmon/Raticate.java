package pocketmon;

public class Raticate extends Rattata{
    public Raticate(int level) {
        super(level);
        this.hp = 200;
        this.level = level;
        this.attack = 1.2F;
        this.defence = 1.1F;
        this.accuracy = 100;
        this.type = "Normal";
        this.name = "레트라";
        this.hpgrow = 1.015F;
        this.attackgrow = 1.015F;
        this.defencegrow = 1.015F;
        this.maxPP = maxPP;
        this.PP = PP;
        this.skill = skill;
    }
}
