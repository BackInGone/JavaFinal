package Main;

import ItemList.Item;
import person.Trainer;
import pocketmon.*;
import skill.Skill;

import javax.swing.*;
import java.util.Scanner;

public class BattlePanel {


    JFrame Battle1 = new JFrame();
    JPanel battlepanel = new JPanel();
//    Image background = new ImageIcon(ShopPanel2.class.getResource("../image/상점.png")).getImage();

    Pocketmon[] myPoke = new Pocketmon[6];
    static Pocketmon[] oppos = new Pocketmon[6];

    Skill battleSkill = new Skill();
//    Item battleItem = new Item();
    Trainer battleTrainer = new Trainer();
    Scanner scan = new Scanner(System.in);


    public boolean isTrainer;
    public int oppoPokeNum;
    public int myPokeNum=0;
    public int turnstack;
    public int num=0;
    public int turnNumb=0;
    public void copyField(Pocketmon c, Pocketmon v){

        v.exist = c.exist;
        v.index = c.index;
        v.level = c.level;
        v.exp = c.exp;
        v.hp = c.hp;
        v.attack = c.attack;
        v.defence = c.defence;
        v.accuracy = c.accuracy;
        v.type = c.type;
        v.name = c.name;
        v.depth = c.depth;
        v.hpgrow = c.hpgrow;
        v.attackgrow = c.attackgrow;
        v.defencegrow = c.defencegrow;
        v.isPoisoned = c.isPoisoned;
        v.isParalyzed = c.isParalyzed;
        v.maxPP = c.maxPP;
        v.PP = c.PP;
        v.skill = c.skill;

    }
//    public Pocketmon[] setPocketmonArray(Pocketmon[] p){
//
//    }
    public BattlePanel(){

        //if(트레이너 끼리 일때)
        //if(야생포켓몬일때)
        int level1;
        int level2;
        level1 = (int) (Math.random() * 3);
        level2 = (int) (Math.random() * 20);
        while (level1<level2){
            goBaattle(level1,level2);
            level1 = (int) (Math.random() * 3);
            level2 = (int) (Math.random() * 20);
        }

        Battle1.setSize(400,600);
        Battle1.add(battlepanel);
        Battle1.getContentPane().setLayout(null);
        Battle1.setVisible(true);
    }
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

        int i =0;
        int num = 0;
        int range = 0;
        while (true) {      // 포켓몬 마리수 1~6마리랜덤 설정
            num = (int)(Math.random() * 10);
            if(num<6 && num>0) {
                System.out.println("적 포켓몬 마리수 = " + num);
                break;
            }
        }

        System.out.println(" 랜덤 전 num 체크 =" + num);
//         랜덤 수 만큼 포켓몬 생성
            while(i<6){
                    range = (int) (Math.random() * rangeB); // 해당 인덱스 안에서 포켓몬 랜덤 배정
                if(rangeF < range){
                    oppos[i]= new Pocketmon();
                int oppoLevel = (int) (Math.random() * 7);  //레벨 랜덤 배정
                switch (range) {
                    case 0: {
                        //파이리
                        Charmender a = new Charmender(oppoLevel);
                        copyField(a, oppos[i]);
                        oppos[i].exist=true;
                        System.out.println(i+"번째 포켓몬 hp = " + oppos[i].hp);
                        System.out.println(i+"번째 포켓몬 =" + oppos[i].name);
                        break;
                    }
                    case 1: {
                        //리자드
                        Charizard b = new Charizard(oppoLevel);
                        copyField(b, oppos[i]);

                        oppos[i].exist=true;
                        System.out.println(i+"번째 포켓몬 hp = " + oppos[i].hp);
                        System.out.println(i+"번째 포켓몬 =" + oppos[i].name);
                        break;
                    }
                    case 2: {
                        //리자몽
                        Charmeleon c = new Charmeleon(oppoLevel);
                        copyField(c, oppos[i]);
                        oppos[i].exist=true;
                        System.out.println(i+"번째 포켓몬 hp = " + oppos[i].hp);
                        System.out.println(i+"번째 포켓몬 =" + oppos[i].name);
                        break;

                    }
                    case 3: {
                        //꼬부기
                        Kkobook c = new Kkobook(oppoLevel);
                        copyField(c, oppos[i]);
                        oppos[i].exist=true;
                        System.out.println(i+"번째 포켓몬 hp = " + oppos[i].hp);
                        System.out.println(i+"번째 포켓몬 =" + oppos[i].name);
                        break;

                    }
                    case 4: {
                        //어니부기

                        Earnybook c = new Earnybook(oppoLevel);
                        copyField(c, oppos[i]);
                        oppos[i].exist=true;
                        System.out.println(i+"번째 포켓몬 hp = " + oppos[i].hp);
                        System.out.println(i+"번째 포켓몬 =" + oppos[i].name);
                        break;

                    }
                    case 5: {
                        //거북왕
                        Kingbook c = new Kingbook(oppoLevel);
                        oppos[i].exist=true;
                        copyField(c, oppos[i]);
                        System.out.println(i+"번째 포켓몬 hp = " + oppos[i].hp);
                        System.out.println(i+"번째 포켓몬 =" + oppos[i].name);
                        break;


                    }
                    case 6: {
                        //이상해씨
                        Esangssi c = new Esangssi(oppoLevel);
                        oppos[i].exist=true;
                        copyField(c, oppos[i]);
                        System.out.println(i+"번째 포켓몬 hp = " + oppos[i].hp);
                        System.out.println(i+"번째 포켓몬 =" + oppos[i].name);
                        break;

                    }
                    case 7: {
                        //이상해풀
                        Esangssi c  = new Esangpool(oppoLevel);
                        copyField(c, oppos[i]);
                        oppos[i].exist=true;
                        System.out.println(i+"번째 포켓몬 hp = " + oppos[i].hp);
                        System.out.println(i+"번째 포켓몬 =" + oppos[i].name);
                        break;

                    }
                    case 8: {
                        //이상해꽃
                        Esangkkot c = new Esangkkot(oppoLevel);
                        copyField(c, oppos[i]);
                        oppos[i].exist=true;
                        System.out.println(i+"번째 포켓몬 hp = " + oppos[i].hp);
                        System.out.println(i+"번째 포켓몬 =" + oppos[i].name);
                        break;

                    }
                    case 9: {
                        //피카츄
                        Pikachu c= new Pikachu(oppoLevel);
                        copyField(c, oppos[i]);
                        oppos[i].exist=true;
                        System.out.println(i+"번째 포켓몬 hp = " + oppos[i].hp);
                        System.out.println(i+"번째 포켓몬 =" + oppos[i].name);
                        break;

                    }
                    case 10: {
                        //라이츄
                        Raichu c = new Raichu(oppoLevel);
                        copyField(c, oppos[i]);
                        oppos[i].exist=true;
                        System.out.println(i+"번째 포켓몬 hp = " + oppos[i].hp);
                        System.out.println(i+"번째 포켓몬 =" + oppos[i].name);
                        break;

                    }
                    case 11: {
                        //구구
                        Googoo c = new Googoo(oppoLevel);
                        copyField(c, oppos[i]);
                        oppos[i].exist=true;
                        System.out.println(i+"번째 포켓몬 hp = " + oppos[i].hp);
                        System.out.println(i+"번째 포켓몬 =" + oppos[i].name);
                        break;

                    }
                    case 12: {
                        //피존
                        Pidgeon c = new Pidgeon(oppoLevel);
                        copyField(c, oppos[i]);
                        oppos[i].exist=true;
                        System.out.println(i+"번째 포켓몬 hp = " + oppos[i].hp);
                        System.out.println(i+"번째 포켓몬 =" + oppos[i].name);
                        break;

                    }
                    case 13: {
                        //피존투
                        Pidgeontwo c = new Pidgeontwo(oppoLevel);
                        copyField(c, oppos[i]);
                        oppos[i].exist=true;
                        System.out.println(i+"번째 포켓몬 hp = " + oppos[i].hp);
                        System.out.println(i+"번째 포켓몬 =" + oppos[i].name);
                        break;

                    }
                    case 14: {
                        //꼬렛
                        Rattata c = new Rattata(oppoLevel);
                        copyField(c, oppos[i]);
                        oppos[i].exist=true;
                        System.out.println(i+"번째 포켓몬 hp = " + oppos[i].hp);
                        System.out.println(i+"번째 포켓몬 =" + oppos[i].name);
                        break;

                    }
                    case 15: {
                        //레트라

                        Raticate c  = new Raticate(oppoLevel);
                        copyField(c, oppos[i]);
                        oppos[i].exist=true;
                        System.out.println(i+"번째 포켓몬 hp = " + oppos[i].hp);
                        System.out.println(i+"번째 포켓몬 =" + oppos[i].name);
                        break;

                    }
                    case 16: {
                        //꼬마돌
                        Kkomastone c = new Kkomastone(oppoLevel);
                        copyField(c, oppos[i]);
                        oppos[i].exist=true;
                        System.out.println(i+"번째 포켓몬 hp = " + oppos[i].hp);
                        System.out.println(i+"번째 포켓몬 =" + oppos[i].name);
                        break;

                    }
                    case 17: {
                        //데구리
                        Deguri c = new Deguri(oppoLevel);
                        copyField(c, oppos[i]);
                        oppos[i].exist=true;
                        System.out.println(i+"번째 포켓몬 hp = " + oppos[i].hp);
                        System.out.println(i+"번째 포켓몬 =" + oppos[i].name);
                        break;

                    }
                    case 18: {
                        //딱구리
                        Ddakguri c = new Ddakguri(oppoLevel);
                        copyField(c, oppos[i]);
                        oppos[i].exist=true;
                        System.out.println(i+"번째 포켓몬 hp = " + oppos[i].hp);
                        System.out.println(i+"번째 포켓몬 =" + oppos[i].name);
                        break;

                    }
                    case 19: {
                        //롱스톤
                        Longstone c = new Longstone(oppoLevel);
                        copyField(c, oppos[i]);
                        oppos[i].exist=true;
                        System.out.println(i+"번째 포켓몬 hp = " + oppos[i].hp);
                        System.out.println(i+"번째 포켓몬 =" + oppos[i].name);
                        break;

                    }

                }
                    i++;
                       }
                else {continue;}
            }
        }


    public void changePoketmon(Pocketmon p, int num){

        if (num==1) { //내 포켓몬 변경
//            for(int i=0;i<myPoke.length;i++){
                if(p.exist&&(p.hp!=0)){
                    System.out.println(p.name + " 의  hp = " + p.hp);
                }
//            }

            while(true){

            int next = scan.nextInt();
            if(myPoke[next]!=null){
            if(myPoke[next].exist&&(myPoke[next].hp!=0)){
                myPokeNum= next;
                break;
            } }else {
                System.out.println("change pocketmon test");
            }}
        }
        else if(num==2) { //상대 포켓몬 변경
            oppoPokeNum++;
            num=0;
        }
    }
    public void useItem(Pocketmon pocketmon, Pocketmon oppo){

    }

    public void goBaattle(int rangeF, int rangeB) {
        System.out.println("rangeF" + rangeF);
        System.out.println("rangeB" + rangeB);
        setmyPocketmon();
        setOppoPocketmon(rangeF, rangeB);


        System.out.println("setOppo 나와서 객체를 정리해보자!");
        for (int i = 0; i < oppos.length; i++) {
            if (oppos[i]!=null){
            System.out.println(i + "번쨰 hp + "+ oppos[i].hp);
            System.out.println(i + "번쨰 name + "+ oppos[i].name);
        } else {
                System.out.println(i + "번째 포켓몬 없음");
            }}



       //배틀 시작
        while (true) {
        turnstack =0;

        if(myPoke[myPokeNum].hp==0){
            changePoketmon(myPoke[myPokeNum],1);
        }if(oppos[oppoPokeNum].hp==0){
            changePoketmon(myPoke[myPokeNum],2);
            }

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
                changePoketmon(myPoke[myPokeNum],1);

            } else if (choiceNum==3) {//아이템사용
                System.out.println(Item.itemlist3);
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

            if(myPoke[myPokeNum].hp==0){
                changePoketmon(myPoke[myPokeNum],1);
            }if(oppos[oppoPokeNum].hp==0){
                changePoketmon(myPoke[myPokeNum],2);
            }

            /////////////////상대턴///////////////////



        }



        //적
        //

    }

    public void setMyPoke(Pocketmon oppos, int count) {

    }
}
