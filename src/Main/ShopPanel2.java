package Main;

import javax.swing.*;
import javax.swing.plaf.basic.BasicInternalFrameTitlePane;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static Main.GamePanel.awakeThread;
import static Main.GamePanel.gameThread;

public class ShopPanel2 {
    JFrame Shop2 = new JFrame();
    JPanel btnPanel = new JPanel();
    JButton btn1 = new JButton("짜증");
    JButton btn2 = new JButton("두개");

                GamePanel gamepanel = new GamePanel();



    public ShopPanel2() throws InterruptedException{
    goshop2();

}
    public synchronized void goshop2() throws InterruptedException {
        System.out.println("상점에 들어온 후 gameThread 의 상태는 = " + gameThread.getState());

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
            public synchronized void actionPerformed(ActionEvent e) {
                Shop2.dispose();
                gamepanel.dispose1 = 1;
                // 스태틱 변수 테스트
                System.out.println("상점에서 나왔다.");
        System.out.println("나오기 전 dispose1=" + gamepanel.dispose1);
//                synchronized (gameThread){
//                    notifyAll();
//                    System.out.println("클릭안에 노티파이");
//                };
//                System.out.println("gamePanel awake호출한다!");

                awakeThread();

            }
        });
//        GamePanel test1 = new GamePanel();
//        test1.awakeThread();
    }
    /*public synchronized void waitm() throws InterruptedException {
        wait();
    }
    public synchronized void notifym() throws InterruptedException{
        notifyAll();
    }*/

    public void paint(Graphics g){
//        g.drawImage(img,0,0,null);
    }
}

