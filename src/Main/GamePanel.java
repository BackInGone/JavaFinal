package Main;

import java.awt.*;
import java.util.Scanner;
import javax.swing.JPanel;

public class GamePanel extends JPanel implements Runnable {

    final int originalTileSize = 16;
    final int scale = 3;
    final int tileSize = originalTileSize * scale;
    final int maxScreenCol = 16;
    final int getMaxScreenRow = 12;
    final int screenWidth = tileSize * maxScreenCol;
    final int screenHeight = tileSize * getMaxScreenRow;
//    Thread gameThread;
    public GamePanel() {

        this.setPreferredSize(new Dimension(screenWidth, screenHeight));
        this.setBackground(Color.black);
        this.setDoubleBuffered(true);

    }


    public void startGameThread() {
        Thread gameThread = new Thread(this);
        gameThread.start();
    }


    int cnt = 0;


    public void run() {

        System.out.println("run?");
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();


        while (true) { //gameThread != null

            try {
                System.out.println("Loop is running" + cnt + "times");
                cnt += 1;
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }


            update();
            repaint();


        }
    }



    public void update(){

    }
    public void paintComponent(Graphics g){
        super.paintComponent(g);

        Graphics2D g2 = (Graphics2D)g;
        g2.setColor(Color.MAGENTA);
        g2.fillRect(50,50,tileSize,tileSize);
        g2.dispose();

    }




}