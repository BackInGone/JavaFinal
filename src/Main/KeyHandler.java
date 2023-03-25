package Main;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class KeyHandler implements KeyListener {


public boolean upPressed, downPressed, leftPressed, rightPressed;
    public void keyTyped(KeyEvent e){

    }
    public void keyPressed(KeyEvent e){
        int code = e.getKeyCode();
        if(code == KeyEvent.VK_UP){
            upPressed = true;
//            System.out.println("w press");
        }
        if (code == KeyEvent.VK_DOWN){
            downPressed = true;
//            System.out.println("s press");
        }
        if(code == KeyEvent.VK_LEFT){
            leftPressed = true;
//            System.out.println("a press");
        }
        if(code == KeyEvent.VK_RIGHT){
            rightPressed = true;
//            System.out.println("d press");
        }
    }
    public void keyReleased(KeyEvent e){
        int code = e.getKeyCode();
        if(code == KeyEvent.VK_UP){
             upPressed = false;
//            System.out.println("w release ");
        }
        if(code == KeyEvent.VK_DOWN){
             downPressed = false;
//            System.out.println("s release");
        }
        if(code == KeyEvent.VK_LEFT){
             leftPressed = false;
//            System.out.println("a release");
        }
        if(code == KeyEvent.VK_RIGHT){
             rightPressed = false;
//            System.out.println("d release");
        }

    }

}
