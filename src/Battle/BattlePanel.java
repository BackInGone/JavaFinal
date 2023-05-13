package Battle;

import Shop.ShopPanel2;
import person.Trainer;
import pocketmon.*;
import skill.Skill;

import javax.swing.*;
import java.awt.*;
import java.util.Scanner;

public class BattlePanel {


    JFrame Battle1 = new JFrame();
    JPanel battlepanel = new JPanel();
    Image background = new ImageIcon(ShopPanel2.class.getResource("../image/상점.png")).getImage();


    //추후 랜덤 생성 Pocketmon[] oppos = new Pocketmon[5];
    Skill battleSkill = new Skill();
    Trainer battleTrainer = new Trainer();
    Scanner scan = new Scanner(System.in);


    public boolean isTrainer;


    public void goBaattle() {

        System.out.println("현재 보유 포켓몬은 " + battleTrainer.CountPocketmon() + "마리");
        for (int i = 0; i < battleTrainer.CountPocketmon(); i++) {

            switch (i) {
                case0 : {
                    if(FirstPocketmon.exist){
                    System.out.println("FirstPocketmon = " + FirstPocketmon.name);
                        break;
                }else {
                        break;
                    }
                case1 : {
                    if(SecondPocketmon.exist){
                        System.out.println("FirstPocketmon = " + SecondPocketmon.name);
                        break;
                    }else {
                        break;
                    }
                case2 : {
                    if(ThirdPocketmon.exist){
                        System.out.println("FirstPocketmon = " + ThirdPocketmon.name);
                        break;
                    }else {
                        break;
                    }
                case3 : {
                    if(FourthPocketmon.exist){
                        System.out.println("FirstPocketmon = " + FourthPocketmon.name);
                        break;
                    }else {
                        break;
                    }
                case4 : {
                    if(FifthPocketmon.exist){
                        System.out.println("FirstPocketmon = " + FifthPocketmon.name);
                        break;
                    }else {
                        break;
                    }
                case5 : {
                    if(SixthPocketmon.exist){
                        System.out.println("FirstPocketmon = " + SixthPocketmon.name);
                        break;
                    }else {
                        break;
                    }
                }

            SecondPocketmon;
            ThirdPocketmon;
            FourthPocketmon;
            FifthPocketmon;
            SixthPocketmon;
                }
            }




        while (true) {
          int choiceNum =  scan.nextInt();

            if(choiceNum==1){//기술사용



            }else if(choiceNum==2){//포켓몬변경

            } else if (choiceNum==3) {//아이템사용

            } else{ //나가기

            }

        }



        //적
        //

    }

}
