package pocketmon;

public class Pidgeon extends Googoo{
    public Pidgeon(int level) {
        super(level);
        this.hp = 200;
        this.level = level;
        this.attack = 1.1F;
        this.defence = 1.1F;
        this.accuracy = 100;
        this.type = "fly";
        this.name = "피죤";
        this.hpgrow = 1.015F;
        this.attackgrow = 1.015F;
        this.defencegrow = 1.015F;
        this.maxPP = maxPP;
        this.PP = PP;
        this.skill = skill;
    }
}
