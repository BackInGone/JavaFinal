package pocketmon;

public class Ddakguri extends Deguri{

        Ddakguri(int level) {
            super(level);
            this.hp = 600;
            this.level = level;
            this.attack = 1.2F;
            this.defence = 1.5F;
            this.accuracy = 100;
            this.type = "Stone";
            this.name = "딱구리";
            this.hpgrow = 1.02F;
            this.attackgrow = 1.02F;
            this.defencegrow = 1.02F;
            this.maxPP = maxPP;
            this.PP = PP;
            this.skill = skill;
        }
}
