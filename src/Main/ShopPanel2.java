package Main;

import pocketmon.Pocketmon;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

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

    JButton btn2 = new JButton("회복약") {
        public void setBounds(int x, int y, int width, int height) {
            super.setBounds(100, 400, 100, 100);
        }};


        JButton btn3 = new JButton("해독제");
        JButton btn4 = new JButton("회복");
        JButton btn5 = new JButton("두개");


        GamePanel gamepanel = new GamePanel();


        public ShopPanel2() throws InterruptedException {
            Shop2.setSize(400, 600);
            goshop2();

        }

        public synchronized void goshop2() throws InterruptedException {
            System.out.println("상점에 들어온 후 gameThread 의 상태는 = " + gameThread.getState());

            setBtnPanel();
            setPanel();
            btnPanel.setVisible(true);
            Shop2.getContentPane().setLayout(null);
            Shop2.setVisible(true);
            Pocketmon charmender = new Pocketmon();
            System.out.println("처음 HP = " + charmender.hp);


//        GamePanel test1 = new GamePanel();
//        test1.awakeThread();
        }

        public void setPanel() {
            Shop2.add(btnPanel);
            btnPanel.setSize(400, 600);
            btnPanel.add(btn1);
            btnPanel.add(btn2);
        }

        public void setBtnPanel() {

                    Pocketmon charmender = new Pocketmon();
            //나가기 버튼
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


            //회복약 구매 버튼
            btn2.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    charmender.hp = Pocketmon.tmp;
                    charmender.hp = charmender.setHp(charmender.hp);
                   System.out.println("누른 후 HP = " + charmender.hp);
                    System.out.println("gethp = " + charmender.getHP());
                    Pocketmon.tmp = charmender.getHP();
                    System.out.println(Pocketmon.tmp);
                }
            });
        }


    }


