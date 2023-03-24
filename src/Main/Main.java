package Main;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        JFrame window = new JFrame();
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setTitle("Pocketmon Adventure");
        window.setResizable(false);

        GamePanel gamePanel = new GamePanel();
        window.add(gamePanel);
        window.pack();


        window.setLocationRelativeTo(null);
        window.setVisible(true);

//        Runnable r = new GamePanel();
//        Thread gameThread = new Thread(r);
//        gameThread.start();
        gamePanel.startGameThread();
    }
}