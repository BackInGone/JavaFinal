package Battle;

import person.Trainer;
import pocketmon.Pocketmon;

import java.awt.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Battle extends Thread{

    Battle game = new Battle();
    public boolean running;
    Trainer player;
    Trainer opponent;
    Pocketmon opponentPocketmon;
            int actionnum;
    public boolean isTrainter;
    public boolean isPlayerTurn;
    Scanner scanner = new Scanner(System.in);

    public void run(){
/*        running = true;
        while(running){

            Battlepanel battlepanel = new Battlepanel();
            battlepanel.update();


        }
        public void stop(){
            running = false;

            }
            game.update(){
        }

    }*/
 /*   public void update(){
        if(game.isPlayerTurn){
            System.out.println("Choose your action:");
            System.out.println("1. Attack");
            System.out.println("2. Bag");
            System.out.println("3. Exit");
            System.out.print("4. ");

            int actionnum = scanner.nextInt();*/

         /*  switch (actionnum){
               case 1 :
               {
                   switch (Pocketmon){
                       case 1:{}
                       case 2:{}
                       case 3:{}
                       case 4:{}
                   }
               }
               case 2 :
               case 3 :
               case 4 :
           }*/

        }
    }
//
//    public void isTrainer(){
//
//    }
//        else {
//
//        }
//
//        public static Pocketmon getRandomPokemon(List<Pocketmon> availablePoketmon){
//            int randomIndex = random.extInt(availablePokemon.size());
//            Pocketmon poketmon = availablePoketmon.get(randomIndex);
//            return new Pocketmon(poketmon.hp, poketmon.pp1,poketmon.pp2,poketmon.pp3,poketmon.pp4, new ArrayList<Pocketmon.takeDamage()>());
//        }



//}
