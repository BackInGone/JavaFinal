package pocketmon;

public class Pikachu extends Pocketmon{
    Pikachu(int level) {

        this.hp = 159;
        this.level = level;
        this.attack = 1F;
        this.defence = 1F;
        this.accuracy = 100;
        this.type = "Electric";
        this.name = "피카츄";
        this.hpgrow = 1.01F;
        this.attackgrow = 1.01F;
        this.defencegrow = 1.01F;
        this.maxPP = maxPP;
        this.PP = PP;
        this.skill = skill;
    }


}
