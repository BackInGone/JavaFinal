package Main;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class KeyHandler implements KeyListener {


boolean upPressed;
boolean downPressed;
boolean leftPressed;
boolean rightPressed;

    public void keyTyped(KeyEvent e){

    }
    public void keyPressed(KeyEvent e){
        int code = e.getKeyCode();
        if(code == KeyEvent.VK_W);{
            boolean upPressed = true;
            System.out.println("w press");
        }
        if(code == KeyEvent.VK_S);{
            boolean downPressed = true;
            System.out.println("s press");
        }
        if(code == KeyEvent.VK_A);{
            boolean leftPressed = true;
            System.out.println("a press");
        }
        if(code == KeyEvent.VK_D);{
            boolean rightPressed = true;
            System.out.println("d press");
        }
    }
    public void keyReleased(KeyEvent e){
        int code = e.getKeyCode();

        if(code == KeyEvent.VK_W);{
            boolean upPressed = false;
            System.out.println("w release ");
        }
        if(code == KeyEvent.VK_S);{
            boolean downPressed = false;
            System.out.println("s release");
        }
        if(code == KeyEvent.VK_A);{
            boolean leftPressed = false;
            System.out.println("a release");
        }
        if(code == KeyEvent.VK_D);{
            boolean rightPressed = false;
            System.out.println("d release");
        }

    }

}
