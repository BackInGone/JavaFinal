package pocketmon;

public class Esangkkot extends Esangpool {

    Esangkkot(int level) {
        super(level);
        this.hp = 500;
        this.level = level;
        this.attack = 1.3F;
        this.defence = 1.3F;
        this.accuracy = 100;
        this.type = "Grass";
        this.name = "이상해꽃";
        this.hpgrow = 1.03F;
        this.attackgrow = 1.025F;
        this.defencegrow = 1.025F;
        this.maxPP = maxPP;
        this.PP = PP;
        this.skill = skill;
    }
}
