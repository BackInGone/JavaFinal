package pocketmon;

public class Pidgeontwo extends Pidgeon{
    public Pidgeontwo(int level) {
        super(level);
        this.hp = 400;
        this.level = level;
        this.attack = 1.3F;
        this.defence = 1.2F;
        this.accuracy = 100;
        this.type = "fly";
        this.name = "피죤투";
        this.hpgrow = 1.02F;
        this.attackgrow = 1.02F;
        this.defencegrow = 1.02F;
        this.maxPP = maxPP;
        this.PP = PP;
        this.skill = skill;
    }
}
