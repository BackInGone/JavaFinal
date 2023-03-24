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

    Thread gameThread = new Thread();
    KeyHandler keyH = new KeyHandler();
    int playerX = 100;
    int playerY = 100;
    int playerSpeed=100;



    public GamePanel() {

        this.setPreferredSize(new Dimension(screenWidth, screenHeight));
        this.setBackground(Color.black);
        this.setDoubleBuffered(true);
        this.addKeyListener(keyH);
        this.setFocusable(true);

    }


    public void startGameThread() {
        gameThread = new Thread(this);
        gameThread.start();
    }


    int cnt = 0;
    public void run() {

//        System.out.println("run?");
//        Scanner scan = new Scanner(System.in);
//        int a = scan.nextInt();


        while (gameThread != null) {

            //                System.out.println("Loop is running" + cnt + "times");
                cnt += 1;
            try {
                Thread.sleep(1000);
            update();
//            System.out.println("update"+ cnt);
            repaint();
//            System.out.println("repaint"+ cnt);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
//                paintComponent(Graphics g);
        }
    }

    private void update() {
        System.out.println("여긴 update...");
        if(keyH.upPressed==true){
            System.out.println("uppressed");
            playerY -= playerSpeed;
        }
        else if(keyH.downPressed==true){
            playerY += playerSpeed;
            System.out.println("downpressed");
        }
        else if(keyH.leftPressed==true){
            playerX -= playerSpeed;
            System.out.println("leftpressed");
        }
        else if(keyH.rightPressed==true){
            playerX += playerSpeed;
            System.out.println("rightpressed");
        }
    }


//    public void update(Graphics g2){
//        super.update(g2);
////    if(keyH.upPressed){
////        playerY -= playerSpeed;
////        System.out.println("uppressed");
////    }
////    else if(keyH.downPressed){
////        playerY += playerSpeed;
////        System.out.println("downpressed");
////    }
////    else if(keyH.leftPressed){
////        playerX -= playerSpeed;
////        System.out.println("leftpressed");
////    }
////    else if(keyH.rightPressed){
////        playerX += playerSpeed;
////        System.out.println("rightpressed");
////    }
//    }

    public void paintComponent(Graphics g){
        super.paintComponent(g);

        Graphics2D g2 = (Graphics2D)g;
        g2.setColor(Color.MAGENTA);
        g2.fillRect( playerX, playerY,tileSize,tileSize);
        g2.dispose();

    }




}