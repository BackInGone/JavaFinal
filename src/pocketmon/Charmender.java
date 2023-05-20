package pocketmon;

public class Charmender extends Pocketmon{

    public Charmender(int level) {

        this.hp = 150;
        this.level = level;
        this.attack = 1F;
        this.defence = 1F;
        this.accuracy = 100;
        this.type = "fire";
        this.name = "파이리";
        this.hpgrow = 1.01F;
        this.attackgrow = 1.01F;
        this.defencegrow = 1.01F;
        this.maxPP = maxPP;
        this.PP = PP;
        this.skill = skill;
    }

}
