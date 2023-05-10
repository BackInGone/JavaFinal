package Battle;

import pocketmon.Pocketmon;
import skill.Skill;

import javax.swing.*;

public class Battlepanel extends JFrame {

    JFrame BattlePanel1 = new JFrame();
    JPanel BtnPanel = new JPanel();
//    Image oppo = new ImageIcon(ShopPanel2.class.getResource());
//    Image me = new ImageIcon(ShopPanel2.class.getResource());
//
//    Battle battle1 = new Battle();
//    Thread battleThread = new Thread(battle1);
////    battleThread.start();

    int b=1;
    int skillNum;
    Pocketmon[] oppos = new Pocketmon[4];

    Skill battleSkill = new Skill();

    Pocketmon test = new Pocketmon();
    test.tackle();

    /*public void useSkill(Pocketmon tool, int skillNum) {
        switch (skillNum) {
            case 0: {tool.nothing(opponent);}
            case 1: {tackle(opponent);}
            case 2: {hardening(opponent);}
            case 3: {sandwind(opponent);}
            case 4: {electricshock(opponent);}
            case 5: {electromagnetic(opponent);}
            case 6: {ember(opponent);}
            case 7: {fireball(opponent);}
            case 8: {fireblast(opponent);}
            case 9: {watergun(opponent);}
            case 10: {bubblebeam(opponent);}
            case 11: {hydropump(opponent);}
            case 12: {vinewhip(opponent);}
            case 13: {petaldance(opponent);}
            case 14: {solarbeam(opponent);}
        }
    }*/




}
