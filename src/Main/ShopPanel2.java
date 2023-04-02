package Main;

import javax.swing.*;
import javax.swing.plaf.basic.BasicInternalFrameTitlePane;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ShopPanel2 {
    JFrame Shop2 = new JFrame();
    JPanel btnPanel = new JPanel();
    JButton btn1 = new JButton("짜증");
    JButton btn2 = new JButton("두개");




    public ShopPanel2() throws InterruptedException{
    goshop2();

}
    public synchronized void goshop2() throws InterruptedException {
        wait();
        Shop2.setSize(600,1000);
//        btnPanel.setSize(200,300);
        Shop2.add(btnPanel);
        btnPanel.add(btn1);
        btnPanel.setSize(200,300);
        btn1.setSize(500,300);
        btn2.setSize(200,300);
        btnPanel.add(btn2);
        Shop2.setVisible(true);

        btnPanel.setVisible(true);
        btn1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Shop2.dispose();
                System.out.println("dispose");
                notifyAll();
                System.out.println("notifyall");
            }
        });
        System.out.println("dispose1=" + GamePanel.dispose1);
//        GamePanel test1 = new GamePanel();
//        test1.awakeThread();
    }
    public void paint(Graphics g){
//        g.drawImage(img,0,0,null);
    }
}

