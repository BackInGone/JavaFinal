package Shop;

import ItemList.Item;
import Main.GamePanel;
import pocketmon.Pikachu;
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
            super.setBounds(100, 500, 200, 50);
        }
    };

    JButton btn2 = new JButton("회복약") {
        public void setBounds(int x, int y, int width, int height) {
            super.setBounds(50, 200, 100, 50);
        }};


    JButton btn3 = new JButton("해독제"){
            public void setBounds(int x, int y, int width, int height){
                super.setBounds(200,200,100,50);
            }
        };

   JButton btn4 = new JButton("몬스터볼"){
       @Override
       public void setBounds(int x, int y, int width, int height) {
           super.setBounds(50, 400, 100, 50);
       }
   };
    JButton btn5 = new JButton("이상한사탕"){
        @Override
        public void setBounds(int x, int y, int width, int height) {
            super.setBounds(200, 400, 100, 50);
        }
    };




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
            btnPanel.add(btn3);
            btnPanel.add(btn4);
            btnPanel.add(btn5);
        }

        public void setBtnPanel() {

                    Pocketmon charmendershop = new Pocketmon();
            //나가기 버튼
            btn1.addActionListener(new ActionListener() {
                @Override
                public synchronized void actionPerformed(ActionEvent e) {
                    Shop2.dispose();
                    System.out.println("상점에서 나왔다.");
                    Pikachu pika1 = new Pikachu();
                    System.out.println(Item.itemlist3);

//                    for (int i = 0; i < 13;i++){
                        System.out.println(Item.itemlist3.values());
//                    }
                    // 스태틱 변수 테스트
                    System.out.println("shoppanel hp =" + pika1.hp + "////exp" + pika1.exp);

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
//                    charmender.hp = Pocketmon.tmp;
                    charmendershop.hp = charmendershop.setHp(charmendershop.hp);
                   System.out.println("누른 후 HP = " + charmendershop.hp);
                    System.out.println("gethp = " + charmendershop.getHP());
                    System.out.println(Pocketmon.tmp);
                }
            });
        }


    }


