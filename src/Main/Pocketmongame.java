package Main;

import javax.swing.*;

public class Pocketmongame {
    public static void main(String[] args) throws InterruptedException{

        JFrame window = new JFrame();
        GamePanel gamePanel = new GamePanel();
//        window.setDefaultCloseOperation(JFraame.);
        window.setTitle("Pocketmon Adventure");
        window.setResizable(false);
        window.add(gamePanel);
        window.pack();
        //윈도우 창
        // 중앙 출력
//        gamePanel.setLocationRelativeTo(null);
        window.setVisible(true);
        gamePanel.setVisible(true);
//        Runnable r = new GamePanel();
//        Thread gameThread = new
//        Thread(r);
//        gameThread.start();
//        new ShopPnel();
//        window.add(new JLabel("Pocketmon Adventure"));
        gamePanel.startGameThread();
        }



}


