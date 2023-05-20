package pocketmon;

public class Esangpool extends Esangssi {
    public Esangpool(int level) {
        super(level);
        this.hp = 250;
        this.level = level;
        this.attack = 1.2F;
        this.defence = 1.2F;
        this.accuracy = 100;
        this.type = "Grass";
        this.name = "이상해풀";
        this.hpgrow = 1.02F;
        this.attackgrow = 1.02F;
        this.defencegrow = 1.02F;
        this.maxPP = maxPP;
        this.PP = PP;
        this.skill = skill;
    }
}
