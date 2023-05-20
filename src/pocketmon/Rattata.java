package pocketmon;

public class Rattata extends Pocketmon{
    public Rattata(int level) {
        super(level);
        this.hp = 200;
        this.level = level;
        this.attack = 1.1F;
        this.defence = 1.1F;
        this.accuracy = 100;
        this.type = "Normal";
        this.name = "꼬렛";
        this.hpgrow = 1.01F;
        this.attackgrow = 1.01F;
        this.defencegrow = 1.01F;
        this.maxPP = maxPP;
        this.PP = PP;
        this.skill = skill;
    }
}
