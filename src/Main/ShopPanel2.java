package Main;

import javax.swing.*;
import java.awt.*;

public class ShopPanel2 {
    JFrame Shop2 = new JFrame();
    JPanel btnPanel = new JPanel();

//    Image img = new Image();
    JButton btn1 = new JButton();
    JButton btn2 = new JButton();


    public ShopPanel2() {
    goshop2();
}
    public void goshop2() {
        Shop2.setSize(400,600);
        btnPanel.setSize(200,200);
        btn1.setSize(330,50);
        btn2.setSize(50,100);
        Shop2.add(btnPanel);
        btnPanel.add(btn1);
        btnPanel.add(btn2);
        Shop2.setVisible(true);
        GamePanel test1 = new GamePanel();

    }
    public void paint(Graphics g){
//        g.drawImage(img,0,0,null);
    }
}


