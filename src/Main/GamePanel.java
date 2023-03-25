package Main;

import javax.swing.*;
import java.awt.*;

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
    int playerSpeed=10;


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
        while (gameThread != null) {

            try {
                gameThread.sleep(50);
            cnt += 1;
            update();
//            System.out.println("update"+ cnt);
            repaint();
//            System.out.println("repaint"+ cnt);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
                        }
            }
    }

    private void update() {
        // 화면 밖으로 벗어났을때 메시지와 함께 제자리로 돌리는 else if 문
        // upPerssed, downPressed, leftPressed, rightPressed 마다 플레이어 필셀의 위치 업데이트 (플레이어픽셀크기 48*48)
        if(keyH.upPressed){
        System.out.println("uppressed");
            if(playerX<0)
            {System.out.println("XXX");
                playerX = 0;
                JFrame window2 = new JFrame();
                GamePanel gamePanel2 = new GamePanel();
                window2.add(gamePanel2);
                window2.pack();
                window2.setVisible(true);
            }else if(playerY<0) {
                System.out.println("XXX");
                playerY = 0;
            }else if(playerX>720){
                System.out.println("XXX");
                playerX=720;
            }else if(playerY>528){
                System.out.println("XXX");
                playerY=528;
            }else {
            playerY -= playerSpeed;}
        }
        else if(keyH.downPressed){
            System.out.println("downpressed");
            if(playerX<0)
            {System.out.println("XXX");
                playerX = 0;
            }else if(playerY<0) {
                System.out.println("XXX");
                playerY = 0;
            }else if(playerX>720){
                System.out.println("XXX");
                playerX=720;
            }else if(playerY>528){
                System.out.println("XXX");
                playerY=528;
            }else {playerY += playerSpeed;}
        }
        else if(keyH.leftPressed){
            System.out.println("leftpressed");
            if(playerX<0)
            {System.out.println("XXX");
                playerX = 0;
            }else if(playerY<0) {
                System.out.println("XXX");
                playerY = 0;
            }else if(playerX>720){
                System.out.println("XXX");
                playerX=720;
            }else if(playerY>528){
                System.out.println("XXX");
                playerY=528;
            }else {playerX -= playerSpeed;}
        }
        else if(keyH.rightPressed){
            if(playerX<0)
            {System.out.println("XXX");
                playerX = 0;
            }else if(playerY<0) {
                System.out.println("XXX");
                playerY = 0;
            }else if(playerX>720){
                System.out.println("XXX");
                playerX=720;
            }else if(playerY>528){
                System.out.println("XXX");
                playerY=528;
            }else {System.out.println("rightpressed");
            playerX += playerSpeed;}
        }
    }

    public void paintComponent(Graphics g){
        super.paintComponent(g);

        Graphics2D g2 = (Graphics2D)g;
        g2.setColor(Color.MAGENTA);
        g2.fillRect( playerX, playerY,tileSize,tileSize);
        g2.dispose();

    }




}