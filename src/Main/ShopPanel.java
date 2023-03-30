package Main;

import javax.swing.*;
import java.awt.*;


public class ShopPanel extends JFrame{
    public Image img;
    public ShopPanel(){
        ShopPanel shopPanel1 = new ShopPanel();
        shopPanel1.img = img;
        goshop();
    }
    public ShopPanel(Image img){
        this.img = img;
        setSize(new Dimension(img.getWidth(null), img.getHeight(null)));
        setPreferredSize(new Dimension(img.getWidth(null), img.getHeight(null)));
        setLayout(null);
        goshop();
    }

    public void goshop(){
    JFrame Shop = new JFrame();
    Shop.setSize(400,600);
    Shop.setLocationRelativeTo(null);
    Shop.setVisible(true);
    ShopPanel ShopPanel1 = new ShopPanel(new ImageIcon("/image/상점.png").getImage());
    Shop.add(ShopPanel1);



    }

    public void paintComponent(Graphics g){
        g.drawImage(img, 0, 0, null);
        setSize(new Dimension(img.getWidth(null), img.getHeight(null)));
        setPreferredSize(new Dimension(img.getWidth(null), img.getHeight(null)));
        setLayout(null);

    }


}
/*
//        JFrame ShopPanel1 = new JFrame();
        JButton btn1 = new JButton();
        JButton btn2 = new JButton();
        JButton btn3 = new JButton();
        JButton btn4 = new JButton();

//        getContentPane().add(display1);
//        ShopPanel1.add(display1);
        JPanel Shop1 = new JPanel();
//        public Image background = new ImageIcon(getClass().getResource("/image/상점.png")).getImage();
        JLabel display1 = new JLabel();
        ImageIcon icon = new ImageIcon(
            ShopPanel.class.getResource("/image/상점.png")
        );
        setSize(400,600);

//        JPanel gamePanel2 = new JPanel();
//        JPanel btnPanel = new JPanel();



        public void goShop(){
            synchronized (this){
//        gamePanel2.add(btn1);
//        gamePanel2.add(btn2);
//        gamePanel2.add(btn3);
//        gamePanel2.add(btn4);
//        Shop1.add(gamePanel2, BorderLayout.SOUTH);
//        gamePanel2.add(btnPanel, BorderLayout.NORTH);
//        btnPanel.setSize(100,300);
//        gamePanel2.setSize(100, 400);
//        Shop1.pack();

        //window2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    Shop1.pack();
    Shop1.setVisible(true);
                }}
        public void paint(Graphics g3){
//            super.paint(g3);
            g3.drawImage(display1,0,0,null);
    }
    public ShopPanel() {
        goShop();
    }
}
*/
