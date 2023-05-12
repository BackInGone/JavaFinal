package Battle;

import person.Trainer;
import pocketmon.Pocketmon;
import skill.Skill;

import javax.swing.*;

public class BattlePanel {


    JFrame Battle1 = new JFrame();
    JPanel battlepanel = new JPanel();

    Pocketmon[]  oppos = new Pocketmon[5];
    Skill battleSkill = new Skill();

    Trainer battle = new Trainer();

    public void goBattle() {
        for (int i = 0; i <= 4; i++) {
            for (int j = 0; j < 3; j++) {
                oppos[i].skill[j] = j;
            }
        }
        oppos[0].hp = 400;

    }
}
