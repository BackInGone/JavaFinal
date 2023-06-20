package Shop;

import ItemList.Item;
import person.Trainer;
import pocketmon.Charmender;
import pocketmon.Pikachu;
import pocketmon.Pocketmon;
import skill.Skill;

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


            btn2.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    System.out.println(Pocketmon.tmp);
                }
            });


            btn3.addActionListener(new ActionListener() {
                @Override
                public synchronized void actionPerformed(ActionEvent e) {
                    Shop2.dispose();
                    System.out.println("상점에서 나왔다.");
                    System.out.println(Item.itemlist);

                        System.out.println(Item.itemlist.values());
//
                }
            });

            btn11.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {

                    buypanel.setVisible(false);
                    btnPanel.setVisible(true);
                }
            });


                    Pocketmon[] oppos = new Pocketmon[6];
                    for (int i = 0; i <= 5; i++) {
                        oppos[i] = new Pocketmon();
                    }

                    int pokenum = 0;
                    for (int i = 0; i <= 4; i++) {
                        for (int j = 0; j <= 3; j++) {
                        oppos[i].skill[j] = j;
                        }
                    }
                    oppos[0].hp =400;

            btn4.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {



                    Trainer my = new Trainer();
                    double num = 0;
                    while (true) {
                            num = (Math.random() * 20);
                        System.out.println(num);
                        if(num<=6 && num>=0) {
                            System.out.println("(int)num = " + (int) num);
//                        double ranNum = (int) (Math.random() * 10);
//                    System.out.println("랜덤 숫자 = " + ranNum);
                            break;
                        }
                    }


//                    Item itemtest = new Item();     //여기서 thread 관련 오류가 나네
//                    System.out.println(itemlist3);
//                    itemtest.makeitemlist();
                    System.out.println(Item.itemlist);
                    System.out.println("after makeitelist() =" + Item.itemlist);

                    Item.itemlist.remove("potion");
                    System.out.println("after remove potion = " + Item.itemlist);
                    int potionnum = (int)(Math.random()*100);
                    Item.itemlist.put("potion", potionnum);

                    System.out.println("after put potion = " + Item.itemlist);

                }
            });


        }


    }


