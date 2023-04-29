package Battle;

import Shop.ShopPanel2;
import person.Trainer;

import javax.swing.*;
import java.awt.*;

public class Battlepanel extends JFrame {

    JFrame BattlePanel1 = new JFrame();
    JPanel BtnPanel = new JPanel();
//    Image oppo = new ImageIcon(ShopPanel2.class.getResource());
//    Image me = new ImageIcon(ShopPanel2.class.getResource());

    Battle battle1 = new Battle();
    Thread battleThread = new Thread(battle1);
//    battleThread.start();


}
