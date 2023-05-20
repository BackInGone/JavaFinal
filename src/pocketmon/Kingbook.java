package pocketmon;

public class Kingbook extends Earnybook{

    public Kingbook(int level) {
        super(level);
        this.hp = 500;
        this.level = level;
        this.attack = 1.2F;
        this.defence = 1.4F;
        this.accuracy = 100;
        this.type = "water";
        this.name = "거북왕";
        this.hpgrow = 1.025F;
        this.attackgrow = 1.012F;
        this.defencegrow = 1.03F;
        this.maxPP = maxPP;
        this.PP = PP;
        this.skill = skill;
    }
}
