package Main;

import javax.swing.*;

public class Pocketmongame {
    public static void main(String[] args) throws InterruptedException{

        JFrame window = new JFrame();
//        window.setDefaultCloseOperation(JFraame.);
        window.setTitle("Pocketmon Adventure");
        window.setResizable(false);
        GamePanel gamePanel = new GamePanel();
        window.add(gamePanel);
        window.pack();
        //윈도우 창
        // 중앙 출력
        window.setLocationRelativeTo(null);

        window.setVisible(true);
//        Runnable r = new GamePanel();
//        Thread gameThread = new Thread(r);
//        gameThread.start();
//        new ShopPnel();
//        window.add(new JLabel("Pocketmon Adventure"));
        gamePanel.startGameThread();



        }







    }


