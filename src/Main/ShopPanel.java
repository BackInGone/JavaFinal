package Main;

import javax.swing.*;
import java.awt.*;

public class ShopPanel extends JFrame{


    public ShopPanel(){
        goShop();
    }
        JFrame Shop1 = new JFrame();
        public Image background = new ImageIcon(ShopPanel.class.getResource("/image/상점.png")).getImage();


        public void goShop(){
        JFrame window2 = new JFrame();
        GamePanel gamePanel2 = new GamePanel();
        window2.pack();
        window2.add(gamePanel2);
        window2.setVisible(true);
        setSize(400,600);
        setVisible(true);
        window2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                }
        public void paint(Graphics g3){
//            super.paint(g3);
            g3.drawImage(background,0,0,null);
    }

}
