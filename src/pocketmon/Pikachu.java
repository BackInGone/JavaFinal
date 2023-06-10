package pocketmon;

public class Pikachu extends Pocketmon{
    public Pikachu(int level) {

        this.hp = 150;
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
        this.maxPP[1] = 20;
        this.maxPP[2] = 15;


        this.PP = PP;
        this.PP[1] = maxPP[1];
        this.PP[2] = maxPP[2];
        this.PP[3] = maxPP[3];
        this.PP[4] = maxPP[4];


        this.skill = skill;
        this.skill[1] = 1;
        this.skill[2] = 4;
    }


}
