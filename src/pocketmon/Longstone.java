package pocketmon;

public class Longstone extends Pocketmon{
    public Longstone(int level) {
        super(level);
        this.hp = 500;
        this.level = level;
        this.attack = 1.2F;
        this.defence = 1.5F;
        this.accuracy = 100;
        this.type = "Normal";
        this.name = "꼬렛";
        this.hpgrow = 1.02F;
        this.attackgrow = 1.02F;
        this.defencegrow = 1.02F;
        this.maxPP = maxPP;
        this.PP = PP;
        this.skill = skill;
    }
}
