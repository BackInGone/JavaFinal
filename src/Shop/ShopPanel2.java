package Shop;

import ItemList.Item;
import Main.GamePanel;
import pocketmon.Charmender;
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

    JButton btn1 = new JButton("구매"){
        @Override
        public void setBounds(int x, int y, int width, int height) {
            super.setBounds(100, 500, 100, 50);
        }
    };

    JButton btn2 = new JButton("판매") {
        public void setBounds(int x, int y, int width, int height) {
            super.setBounds(50, 200, 100, 50);
        }};


    JButton btn3 = new JButton("나가기"){
            public void setBounds(int x, int y, int width, int height){
                super.setBounds(200,200,100,50);
            }
        };

   JButton btn4 = new JButton("회복약"){
       @Override
       public void setBounds(int x, int y, int width, int height) {
           super.setBounds(50, 400, 100, 50);
       }
   };

    JButton btn5 = new JButton("좋은회복약"){
        @Override
        public void setBounds(int x, int y, int width, int height) {
            super.setBounds(250, 400, 100, 50);
        }
    };

    JButton btn6 = new JButton("상태이상회복제"){
        @Override
        public void setBounds(int x, int y, int width, int height) {
            super.setBounds(300, 400, 100, 50);
        }
    };
    JButton btn7 = new JButton("해독제"){
        @Override
        public void setBounds(int x, int y, int width, int height) {
            super.setBounds(350, 400, 100, 50);
        }
    };
    JButton btn8 = new JButton("몬스터볼"){
        @Override
        public void setBounds(int x, int y, int width, int height) {
            super.setBounds(400, 400, 100, 50);
        }
    };
    JButton btn9 = new JButton("슈퍼볼"){
        @Override
        public void setBounds(int x, int y, int width, int height) {
            super.setBounds(250, 500, 100, 50);
        }
    };

    JButton btn10 = new JButton("이상한사탕"){
        @Override
        public void setBounds(int x, int y, int width, int height) {
            super.setBounds(350, 500, 100, 50);
        }
    };

    JButton btn11 = new JButton("뒤로가기"){
        @Override
        public void setBounds(int x, int y, int width, int height) {
            super.setBounds(100, 500, 100, 50);
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
            setBuypanel();

            btnPanel.setVisible(true);
            buypanel.setVisible(false);
            Shop2.getContentPane().setLayout(null);
            Shop2.setVisible(true);
            Pocketmon charmender = new Pocketmon();
            System.out.println("처음 HP = " + charmender.hp);


//        GamePanel test1 = new GamePanel();
//        test1.awakeThread();
        }

        public void setPanel() {
            Shop2.add(btnPanel);
            Shop2.add(buypanel);
            btnPanel.setSize(400, 600);
            buypanel.setSize(400,600);
            btnPanel.add(btn1);
            btnPanel.add(btn2);
            btnPanel.add(btn3);
            buypanel.add(btn4);
            buypanel.add(btn5);
            buypanel.add(btn6);
            buypanel.add(btn7);
            buypanel.add(btn8);
            buypanel.add(btn9);
            buypanel.add(btn10);
            buypanel.add(btn11);
        }

        JPanel buypanel = new JPanel();

        public void setBuypanel(){

            btn1.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {

            btnPanel.setVisible(false);
            buypanel.setVisible(true);
                }
            });

        }

        public void setBtnPanel() {

                    Pocketmon charmendershop = new Pocketmon();

            btn2.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
//                    charmender.hp = Pocketmon.tmp;
                    charmendershop.hp = charmendershop.setHp(charmendershop.hp);
                   System.out.println("누른 후 HP = " + charmendershop.hp);
                    System.out.println(Pocketmon.tmp);
                }
            });



            btn3.addActionListener(new ActionListener() {
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

            btn11.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    Charmender charmender = new Charmender();
                    charmender.tmp +=3;
                    System.out.println("처음 HP = " + charmender.tmp);

                    buypanel.setVisible(false);
                    btnPanel.setVisible(true);
                }
            });


            //회복약 구매 버튼
        }


    }


