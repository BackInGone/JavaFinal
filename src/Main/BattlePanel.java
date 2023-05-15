package Main;

import ItemList.Item;
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

    Pocketmon[] myPoke = new Pocketmon[5];
    Pocketmon[] oppos = new Pocketmon[5];

    Skill battleSkill = new Skill();
    Item battleItem = new Item();
    Trainer battleTrainer = new Trainer();
    Scanner scan = new Scanner(System.in);


    public boolean isTrainer;
    public int oppoPokeNum;
    public int myPokeNum;
    public int turnstack;
    public int num;
    public int turnNumb=0;

    public void setmyPocketmon(){
        System.out.println("현재 보유 포켓몬은 " + battleTrainer.CountPocketmon() + "마리");
        for (int i = 0; i < battleTrainer.CountPocketmon(); i++) {

            switch (i) {
                case 0:{
                    if (FirstPocketmon.exist) {
                        myPoke[i] = new FirstPocketmon();
                        System.out.println("FirstPocketmon = " + FirstPocketmon.name);
                        break;
                    } else {
                        break;
                    }
                }
                case 1:
                {
                    if (SecondPocketmon.exist) {
                        myPoke[i] = new SecondPocketmon();
                        System.out.println("FirstPocketmon = " + SecondPocketmon.name);
                        break;
                    } else {
                        break;
                    }
                }
                case 2:
                {
                    if (ThirdPocketmon.exist) {
                        myPoke[i] = new ThirdPocketmon();
                        System.out.println("FirstPocketmon = " + ThirdPocketmon.name);
                        break;
                    } else {
                        break;
                    }
                }
                case 3:
                {
                    if (FourthPocketmon.exist) {
                        myPoke[i] = new FourthPocketmon();
                        System.out.println("FirstPocketmon = " + FourthPocketmon.name);
                        break;
                    } else {
                        break;
                    }
                }
                case 4:
                {
                    if (FifthPocketmon.exist) {
                        myPoke[i] = new FifthPocketmon();
                        System.out.println("FirstPocketmon = " + FifthPocketmon.name);
                        break;
                    } else {
                        break;
                    }
                }
                case 5:
                {
                    if (SixthPocketmon.exist) {
                        myPoke[i] = new SixthPocketmon();
                        System.out.println("FirstPocketmon = " + SixthPocketmon.name);
                        break;
                    } else {
                        break;
                    }

                }

            }
        }

    }
    public void setOppoPocketmon(int rangeF, int rangeB){
        double num = 0;
        int j=0;
        while (true) {      // 포켓몬 마리수 1~6마리랜덤 설정
            num = (Math.random() * 10);
            if(num<6 && num>=0) {
                System.out.println("적 포켓몬 마리수 = " + (int) num);
//                        double ranNum = (int) (Math.random() * 10);
//                    System.out.println("랜덤 숫자 = " + ranNum);
                break;
            }
        }
        // 랜덤 수 만큼 포켓몬 생성
        for (int i = 0; i <= num; i++) {
            oppos[i] = new Pocketmon();
        }


        // 포켓몬 랜덤 배정
        for (int i = 0; i <= num; i++) {

                j = (int) (Math.random() * 19); // 해당 인덱스 안에서 포켓몬 랜덤 배정
            if(j>=rangeF && j<=rangeB) {
                switch (j) {
                    case 0: {
                        //파이리
                        myPoke[i] = new Charmender();
                        break;
                    }
                    case 1: {
                        //리자드
                        myPoke[i] = new Charizard();
                        break;
                    }
                    case 2: {
                        //리자몽

                        myPoke[i] = new Charmeleon();
                        break;

                    }
                    case 3: {
                        //꼬부기
                        myPoke[i] = new Kkobook();
                        break;

                    }
                    case 4: {
                        //어니부기

                        myPoke[i] = new Earnybook();
                        break;

                    }
                    case 5: {
                        //거북왕
                        myPoke[i] = new Kingbook();
                        break;


                    }
                    case 6: {
                        //이상해씨
                        myPoke[i] = new Esangssi();
                        break;

                    }
                    case 7: {
                        //이상해풀
                        myPoke[i] = new Esangpool();
                        break;

                    }
                    case 8: {
                        //이상해꽃
                        myPoke[i] = new Esangkkot();
                        break;

                    }
                    case 9: {
                        //피카츄
                        myPoke[i] = new Pikachu();
                        break;

                    }
                    case 10: {
                        //라이츄
                        myPoke[i] = new Raichu();
                        break;

                    }
                    case 11: {
                        //구구
                        myPoke[i] = new Googoo();
                        break;

                    }
                    case 12: {
                        //피존
                        myPoke[i] = new Pidgeon();
                        break;

                    }
                    case 13: {
                        //피존투
                        myPoke[i] = new Pidgeontwo();
                        break;

                    }
                    case 14: {
                        //꼬렛
                        myPoke[i] = new Rattata();
                        break;

                    }
                    case 15: {
                        //레트라

                        myPoke[i] = new Raticate();
                        break;

                    }
                    case 16: {
                        //꼬마돌
                        myPoke[i] = new Kkomastone();
                        break;

                    }
                    case 17: {
                        //데구리
                        myPoke[i] = new Deguri();
                        break;

                    }
                    case 18: {
                        //딱구리
                        myPoke[i] = new Ddakguri();
                        break;

                    }
                    case 19: {
                        //롱스톤
                        myPoke[i] = new Longstone();
                        break;

                    }
                }
            }
        }
    }
    public void changePoketmon(int num){


        if (num==1) { //내 포켓몬 변경
            System.out.println("보유중인 포켓몬");
            for(int i=0;i<myPoke.length;i++){
                if(myPoke[i].exist&&(myPoke[i].hp!=0)){
                    System.out.println(i + "번 : " + myPoke[i].name + "   hp = " + myPoke[i].hp);
                }
            }

            while(true){
            int next = scan.nextInt();
            if(myPoke[next].exist&&(myPoke[next].hp!=0)){
                myPokeNum= next;
                break;
            } }

        }
        else if(num==2) { //상대 포켓몬 변경
            oppoPokeNum++;
            num=0;
        }


    }
    public void useItem(Pocketmon pocketmon, Pocketmon oppo){

    }

    public void goBaattle(int rangeF, int rangeB) {

        setmyPocketmon();
//        setOppoPocketmon(rangeF, rangeB);

        if(myPoke[myPokeNum].hp==0){
            changePoketmon(1);
        }

       //배틀 시작
        while (true) {
        turnstack =0;


            ////////////////내턴//////////////////
            System.out.println("행동을 선택");
            System.out.println("1. 기술사용");
            System.out.println("2. 포켓몬변경");
            System.out.println("3. 아이템사용");
            System.out.println("4. 나가기");
          int choiceNum =  scan.nextInt();



          if(choiceNum>=1 && choiceNum<=4) {}
            else {System.out.println("다시 입력");}
            if(choiceNum==1){//기술사용
                int selectSkill = scan.nextInt();
                battleSkill.doSkill(oppos[oppoPokeNum], myPoke[myPokeNum].skill[selectSkill]);
                System.out.println("changed oppos's hp = " + oppos[oppoPokeNum].hp);
                break;

            }else if(choiceNum==2){//포켓몬변경
                changePoketmon(1);

            } else if (choiceNum==3) {//아이템사용
                System.out.println(battleItem.itemlist3);
                useItem(myPoke[myPokeNum], oppos[oppoPokeNum]);


            } else{ //나가기
                if (isTrainer){
                    System.out.println("배틀중에 도망갈 수 없습니다.");
                }

            }
            if((oppos[0].hp+oppos[1].hp+oppos[2].hp+oppos[3].hp+oppos[4].hp+oppos[5].hp)==0 ||
                    myPoke[0].hp+myPoke[1].hp+myPoke[2].hp+myPoke[3].hp+myPoke[4].hp+myPoke[5].hp==0){
                break;
            }

            /////////////////상대턴///////////////////



        }



        //적
        //

    }

}
