package Main;

import ItemList.Item;

import javax.swing.*;

public class Pocketmongame {
    public static void main(String[] args) throws InterruptedException{

        JFrame window = new JFrame();
        GamePanel gamePanel = new GamePanel();
        window.setTitle("Pocketmon Adventure");
        window.setResizable(false);
        window.add(gamePanel);
        window.pack();
        window.setVisible(true);
        gamePanel.setVisible(true);
        gamePanel.startGameThread();


        }



}


