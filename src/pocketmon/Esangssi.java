package pocketmon;

public class Esangssi extends Pocketmon{
    public Esangssi(int level) {
        this.hp = 150;
        this.level = level;
        this.attack = 1F;
        this.defence = 1F;
        this.accuracy = 100;
        this.type = "Grass";
        this.name = "이상해씨";
        this.hpgrow = 1.01F;
        this.attackgrow = 1.01F;
        this.defencegrow = 1.01F;
        this.maxPP = maxPP;
        this.PP = PP;
        this.skill = skill;
    }
}
