package Main;

import javax.swing.*;
import java.awt.*;

public class GamePanel extends JPanel implements Runnable{


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
        int playerSpeed = 10;

        public static int dispose1 = 0;


    public GamePanel() {
        this.setPreferredSize(new Dimension(screenWidth, screenHeight));
        this.setBackground(Color.black);
//        this.setDoubleBuffered(true);
        this.addKeyListener(keyH);
        this.setFocusable(true);
    }

        public void startGameThread () {
        gameThread = new Thread(this);
        gameThread.start();
    }
        int cnt = 0;
        public void run () {
        while (gameThread != null) {

            try {
                gameThread.sleep(50);
                update();
//            System.out.println("update"+ cnt);
                repaint();
//            System.out.println("repaint"+ cnt);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

        private void update () throws InterruptedException {
        // 화면 밖으로 벗어났을때 메시지와 함께 제자리로 돌리는 else if 문
        // upPressed, downPressed, leftPressed, rightPressed 마다 플레이어 필셀의 위치 업데이트 (플레이어픽셀크기 48*48)
        if (playerX < 0) {
            synchronized (this){
                getThreadState();
            playerX = 30;
//            new ShopPanel(); //Shop 윈도우에 진입하는 goShop(); 실행[객체 생성없이 다른 클래스의 메서드 실행법?] [생성자는 실행되는데, goShop()은 Static 아니면 실행이 안되네?
            new ShopPanel2();
            System.out.println("XXX1");
//               wait();
            System.out.println("XXX2");
//            notify();
                System.out.println("XXX3");

//            gameThread.wait(); //gamePanel.wait(); 하면 illegalMonitorStateExceptionerror 남
            keyH.upPressed = false;
            keyH.downPressed = false;
            keyH.leftPressed = false;
            keyH.rightPressed = false;
            setVisible(true);
                System.out.println("여기는?");
            }
        } else if (playerY < 0) {
            System.out.println("XXX");
            playerY = 0;
        } else if (playerX > 720) {
            System.out.println("XXX");
            playerX = 720;
        } else if (playerY > 528) {
            System.out.println("XXX");
            playerY = 528;
        } else if (keyH.upPressed) {
            System.out.println("uppressed");
            playerY -= playerSpeed;
        } else if (keyH.downPressed) {
            System.out.println("downpressed");
            playerY += playerSpeed;
        } else if (keyH.leftPressed) {
            System.out.println("leftpressed");
            playerX -= playerSpeed;
        } else if (keyH.rightPressed) {
            System.out.println("rightpressed");
            playerX += playerSpeed;
        }
    }
        public void getThreadState(){
        Thread.State a = gameThread.getState();
        }

        public void awakeThread(){
            synchronized (this) {
                gameThread.notify();
            }
        }



        public void paintComponent (Graphics g){
        super.paintComponent(g);

        Graphics2D g2 = (Graphics2D) g;
        g2.setColor(Color.MAGENTA);
        g2.fillRect(playerX, playerY, tileSize, tileSize);
        g2.drawOval(150, 150, 50, 50);
        g2.dispose();
    }

    }

