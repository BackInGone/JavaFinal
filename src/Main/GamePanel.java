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

        static Thread gameThread = new Thread();
        KeyHandler keyH = new KeyHandler();
        int playerX = 100;
        int playerY = 100;
        int playerSpeed = 10;

        public int dispose1 = 0;
//        GamePanel gamePanel = new GamePanel();


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

        public void update () throws InterruptedException {
        // 화면 밖으로 벗어났을때 메시지와 함께 제자리로 돌리는 else if 문
        // upPressed, downPressed, leftPressed, rightPressed 마다 플레이어 필셀의 위치 업데이트 (플레이어픽셀크기 48*48)

            moveCharacter();
//            System.out.println("dispose 변화 = " +  gamepanel.dispose1);

        if (playerX < 0) {
            System.out.println("왼쪽으로 이탈");
            synchronized (this){
                getThreadState();
//            new ShopPanel(); //Shop 윈도우에 진입하는 goShop(); 실행[객체 생성없이 다른 클래스의 메서드 실행법?] [생성자는 실행되는데, goShop()은 Static 아니면 실행이 안되네?
                                // 아직도 얘는 막혀있음
                System.out.println("상점에 들어오기전 gameThread 의 상태는 = " + gameThread.getState());
            new ShopPanel2(); //상점 윈도우 객체 생성
            System.out.println("상점에 들어왔다");
            playerX = 30;
//               wait(); //으유!!!!!!! (구조문제인지, 이거 여기에 불러놓고, 다른 JFRAME 갔다가 dispose()로 돌아올때, 
                // 쓰레드 소유권 다시 얻는 방법을 아직 못찾았다... 기본기가 너무 부족함
//            gameThread.wait(); //gamePanel.wait(); 하면 illegalMonitorStateExceptionerror 남
            keyH.upPressed = false;
            keyH.downPressed = false;
            keyH.leftPressed = false;
            keyH.rightPressed = false;
                System.out.println("벗어난 if문 끝자락");
                //창이 2개 생셩할수도 있는 case아직 미헤결
            }
        } else if (playerY < 0) {

            System.out.println("아래로 이탈");
            playerY = 0;
        } else if (playerX > 720) {
            System.out.println("오른쪽으로 이탈");
            playerX = 720;
        } else if (playerY > 528) {
            System.out.println("위로 이탈");
            playerY = 528;
        }
    }

        public void moveCharacter(){
            if (keyH.upPressed) {
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




        public static void getThreadState(){
        Thread.State a = gameThread.getState();
        }
        public static void awakeThread(){
            synchronized (gameThread) {
                GamePanel gamepanel = new GamePanel();
//                gamepanel.playerX = 30;
                System.out.println(gameThread.getState());
                GamePanel.gameThread.notifyAll();
                System.out.println(gameThread.getState());
                System.out.println("awakeThread () 호출");
                System.out.println(gameThread.getState());
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

