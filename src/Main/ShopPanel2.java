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
    JPanel btnPanel = new JPanel(){
    Image background = new ImageIcon(ShopPanel2.class.getResource("../image/상점.png")).getImage();
    public void paint(Graphics g){
        g.drawImage(background,0,0,null);
    }};

    JButton btn1 = new JButton("나가기"){
        @Override
        public void setBounds(int x, int y, int width, int height) {
            super.setBounds(200, 300, 100, 300);
        }
    };
    JButton btn2 = new JButton("해독제");
    JButton btn3 = new JButton("회복약");
    JButton btn4 = new JButton("회복");
    JButton btn5 = new JButton("두개");



    GamePanel gamepanel = new GamePanel();



    public ShopPanel2() throws InterruptedException{
        Shop2.setSize(400,600);
    goshop2();

}
    public synchronized void goshop2() throws InterruptedException {
        System.out.println("상점에 들어온 후 gameThread 의 상태는 = " + gameThread.getState());

        setBtnPanel();
        setPanel();
        btnPanel.setVisible(true);
        Shop2.getContentPane().setLayout(null);
        Shop2.setVisible(true);




//        GamePanel test1 = new GamePanel();
//        test1.awakeThread();
    }
    public void setPanel(){
        Shop2.add(btnPanel);
        btnPanel.setSize(400,600);
        btnPanel.add(btn1);
//        btnPanel.add(btn2);
    }

    public void setBtnPanel(){
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
//                awakeThread();

            }
        });


    }


}

