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

    static Pocketmon[] myPoke = new Pocketmon[6];
    static Pocketmon[] oppos = new Pocketmon[6];
    FirstPocketmon a = new FirstPocketmon();
    SecondPocketmon b = new SecondPocketmon();
    ThirdPocketmon c = new ThirdPocketmon();
    FourthPocketmon d = new FourthPocketmon();
    FifthPocketmon e = new FifthPocketmon();
    SixthPocketmon f = new SixthPocketmon();
    BattlePoke battlePoke = new BattlePoke();

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

    public int CountPocketmon(){
        int count = (FirstPocketmon.exist ? 1 : 0) + (SecondPocketmon.exist? 1 : 0) +
                (ThirdPocketmon.exist? 1 : 0) + (FourthPocketmon.exist? 1 : 0) + (FifthPocketmon.exist? 1 : 0) + (SixthPocketmon.exist? 1 : 0);
        return count;
    }


    public BattlePanel() throws InterruptedException {

        //if(트레이너 끼리 일때)
        //if(야생포켓몬일때)
        int rangeF;
        int rangeB;
        int battleLevel;
        rangeF = (int) (Math.random() * 3);
        rangeB = (int) (Math.random() * 20);
        battleLevel = (int) (Math.random() * 10);
        while (rangeF<rangeB){
            goBaattle(rangeF,rangeB, battleLevel);
            rangeF = (int) (Math.random() * 3);
            rangeB = (int) (Math.random() * 20);
        }

        Battle1.setSize(400,600);
        Battle1.add(battlepanel);
        Battle1.getContentPane().setLayout(null);
        Battle1.setVisible(true);
    }
    public void setmyPocketmon(){

        System.out.println("현재 보유 포켓몬은 " + CountPocketmon() + "마리");
        if(a.exist){
            if(a.hp !=0){
                battlePoke.exist = a.exist;
                battlePoke.index = a.index;
                battlePoke.level = a.level;
                battlePoke.exp = a.exp;
                battlePoke.hp = a.hp;
                battlePoke.attack = a.attack;
                battlePoke.defence = a.defence;
                battlePoke.accuracy = a.accuracy;
                battlePoke.type = a.type;
                battlePoke.name = a.name;
                battlePoke.depth = a.depth;
                battlePoke.hpgrow = a.hpgrow;
                battlePoke.attackgrow = a.attackgrow;
                battlePoke.defencegrow = a.defencegrow;
                battlePoke.isPoisoned = a.isPoisoned;
                battlePoke.isParalyzed = a.isParalyzed;
                battlePoke.maxPP = a.maxPP;
                battlePoke.PP = a.PP;
                battlePoke.skill = a.skill;
            }
            System.out.println(battlePoke.name+ "["+battlePoke.level+"]" + "[HP = " + battlePoke.hp + "]" );
        }
        if(b.exist){
            if(b.hp!=0){
                battlePoke.exist = b.exist;
                battlePoke.index = b.index;
                battlePoke.level = b.level;
                battlePoke.exp = b.exp;
                battlePoke.hp = b.hp;
                battlePoke.attack = b.attack;
                battlePoke.defence = b.defence;
                battlePoke.accuracy = b.accuracy;
                battlePoke.type = b.type;
                battlePoke.name = b.name;
                battlePoke.depth = b.depth;
                battlePoke.hpgrow = b.hpgrow;
                battlePoke.attackgrow = b.attackgrow;
                battlePoke.defencegrow = b.defencegrow;
                battlePoke.isPoisoned = b.isPoisoned;
                battlePoke.isParalyzed = b.isParalyzed;
                battlePoke.maxPP = b.maxPP;
                battlePoke.PP = b.PP;
                battlePoke.skill = b.skill;}
            System.out.println(b.name+ "["+b.level+"]" + "[HP = " + b.hp + "]" );
        }
        if(c.exist){
            if(c.hp!=0){
            battlePoke.exist = c.exist;
            battlePoke.index = c.index;
            battlePoke.level = c.level;
            battlePoke.exp = c.exp;
            battlePoke.hp = c.hp;
            battlePoke.attack = c.attack;
            battlePoke.defence = c.defence;
            battlePoke.accuracy = c.accuracy;
            battlePoke.type = c.type;
            battlePoke.name = c.name;
            battlePoke.depth = c.depth;
            battlePoke.hpgrow = c.hpgrow;
            battlePoke.attackgrow = c.attackgrow;
            battlePoke.defencegrow = c.defencegrow;
            battlePoke.isPoisoned = c.isPoisoned;
            battlePoke.isParalyzed = c.isParalyzed;
            battlePoke.maxPP = c.maxPP;
            battlePoke.PP = c.PP;
            battlePoke.skill = c.skill;}
            System.out.println(c.name+ "["+c.level+"]" + "[HP = " + c.hp + "]" );
        }
        if(d.exist){
            if(d.hp!=0){
                battlePoke.exist = d.exist;
                battlePoke.index = d.index;
                battlePoke.level = d.level;
                battlePoke.exp = d.exp;
                battlePoke.hp = d.hp;
                battlePoke.attack = d.attack;
                battlePoke.defence = d.defence;
                battlePoke.accuracy = d.accuracy;
                battlePoke.type = d.type;
                battlePoke.name = d.name;
                battlePoke.depth = d.depth;
                battlePoke.hpgrow = d.hpgrow;
                battlePoke.attackgrow = d.attackgrow;
                battlePoke.defencegrow = d.defencegrow;
                battlePoke.isPoisoned = d.isPoisoned;
                battlePoke.isParalyzed = d.isParalyzed;
                battlePoke.maxPP = d.maxPP;
                battlePoke.PP = d.PP;
                battlePoke.skill = d.skill;}
                System.out.println(d.name+ "["+d.level+"]" + "[HP = " + d.hp + "]" );
            }
        if(e.exist){
            if(e.hp!=0){
            battlePoke.exist = e.exist;
            battlePoke.index = e.index;
            battlePoke.level = e.level;
            battlePoke.exp = e.exp;
            battlePoke.hp = e.hp;
            battlePoke.attack = e.attack;
            battlePoke.defence = e.defence;
            battlePoke.accuracy = e.accuracy;
            battlePoke.type = e.type;
            battlePoke.name = e.name;
            battlePoke.depth = e.depth;
            battlePoke.hpgrow = e.hpgrow;
            battlePoke.attackgrow = e.attackgrow;
            battlePoke.defencegrow = e.defencegrow;
            battlePoke.isPoisoned = e.isPoisoned;
            battlePoke.isParalyzed = e.isParalyzed;
            battlePoke.maxPP = e.maxPP;
            battlePoke.PP = e.PP;
            battlePoke.skill = e.skill;}
            System.out.println(e.name+ "["+e.level+"]" + "[HP = " + e.hp + "]" );
        }
        if(f.exist){
            if(f.hp!=0){
            battlePoke.exist = f.exist;
            battlePoke.index = f.index;
            battlePoke.level = f.level;
            battlePoke.exp = f.exp;
            battlePoke.hp = f.hp;
            battlePoke.attack = f.attack;
            battlePoke.defence = f.defence;
            battlePoke.accuracy = f.accuracy;
            battlePoke.type = f.type;
            battlePoke.name = f.name;
            battlePoke.depth = f.depth;
            battlePoke.hpgrow = f.hpgrow;
            battlePoke.attackgrow = f.attackgrow;
            battlePoke.defencegrow = f.defencegrow;
            battlePoke.isPoisoned = f.isPoisoned;
            battlePoke.isParalyzed = f.isParalyzed;
            battlePoke.maxPP = f.maxPP;
            battlePoke.PP = f.PP;
            battlePoke.skill = f.skill;}
            System.out.println(f.name+ "["+f.level+"]" + "[HP = " + f.hp + "]" );
        }
    }
    public void setOppoPocketmon(int rangeF, int rangeB, int batLevel){

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
        System.out.println(" 랜덤 전 batLevel 체크 =" + batLevel);
//         랜덤 수 만큼 포켓몬 생성
            while(i<num){
                int oppoLevel;
                    range = (int) (Math.random() * rangeB); // 해당 인덱스 안에서 포켓몬 랜덤 배정
                if(rangeF < range){
                    oppos[i]= new Pocketmon();
                    int plma= (int) (Math.random() * 2); // 메서드 타겟 레벨 +-3랜덤 배정
                    if(plma==0){oppoLevel = batLevel + (int) (Math.random() * 3);}
                    else{
                        oppoLevel = batLevel - (int) (Math.random() * 3);
                    }
                switch (range) {
                    case 0: {
                        //파이리
                        Charmender a = new Charmender(oppoLevel);
                        copyField(a, oppos[i]);
                        oppos[i].exist=true;
                        System.out.println(i+"번째 포켓몬 hp = " + oppos[i].hp);
                        System.out.println(i+"번째 포켓몬 Level = " + oppos[i].level);
                        System.out.println(i+"번째 포켓몬 = " + oppos[i].name);

                        break;
                    }
                    case 1: {
                        //리자드
                        Charizard b = new Charizard(oppoLevel);
                        copyField(b, oppos[i]);

                        oppos[i].exist=true;
                        System.out.println(i+"번째 포켓몬 hp = " + oppos[i].hp);
                        System.out.println(i+"번째 포켓몬 Level = " + oppos[i].level);
                        System.out.println(i+"번째 포켓몬 =" + oppos[i].name);
                        break;
                    }
                    case 2: {
                        //리자몽
                        Charmeleon c = new Charmeleon(oppoLevel);
                        copyField(c, oppos[i]);
                        oppos[i].exist=true;
                        System.out.println(i+"번째 포켓몬 hp = " + oppos[i].hp);
                        System.out.println(i+"번째 포켓몬 Level = " + oppos[i].level);
                        System.out.println(i+"번째 포켓몬 =" + oppos[i].name);
                        break;

                    }
                    case 3: {
                        //꼬부기
                        Kkobook c = new Kkobook(oppoLevel);
                        copyField(c, oppos[i]);
                        oppos[i].exist=true;
                        System.out.println(i+"번째 포켓몬 hp = " + oppos[i].hp);
                        System.out.println(i+"번째 포켓몬 Level = " + oppos[i].level);
                        System.out.println(i+"번째 포켓몬 =" + oppos[i].name);
                        break;

                    }
                    case 4: {
                        //어니부기

                        Earnybook c = new Earnybook(oppoLevel);
                        copyField(c, oppos[i]);
                        oppos[i].exist=true;
                        System.out.println(i+"번째 포켓몬 hp = " + oppos[i].hp);
                        System.out.println(i+"번째 포켓몬 Level = " + oppos[i].level);
                        System.out.println(i+"번째 포켓몬 =" + oppos[i].name);
                        break;

                    }
                    case 5: {
                        //거북왕
                        Kingbook c = new Kingbook(oppoLevel);
                        oppos[i].exist=true;
                        copyField(c, oppos[i]);
                        System.out.println(i+"번째 포켓몬 hp = " + oppos[i].hp);
                        System.out.println(i+"번째 포켓몬 Level = " + oppos[i].level);
                        System.out.println(i+"번째 포켓몬 =" + oppos[i].name);
                        break;


                    }
                    case 6: {
                        //이상해씨
                        Esangssi c = new Esangssi(oppoLevel);
                        oppos[i].exist=true;
                        copyField(c, oppos[i]);
                        System.out.println(i+"번째 포켓몬 hp = " + oppos[i].hp);
                        System.out.println(i+"번째 포켓몬 Level = " + oppos[i].level);
                        System.out.println(i+"번째 포켓몬 =" + oppos[i].name);
                        break;

                    }
                    case 7: {
                        //이상해풀
                        Esangssi c  = new Esangpool(oppoLevel);
                        copyField(c, oppos[i]);
                        oppos[i].exist=true;
                        System.out.println(i+"번째 포켓몬 hp = " + oppos[i].hp);
                        System.out.println(i+"번째 포켓몬 Level = " + oppos[i].level);
                        System.out.println(i+"번째 포켓몬 =" + oppos[i].name);
                        break;

                    }
                    case 8: {
                        //이상해꽃
                        Esangkkot c = new Esangkkot(oppoLevel);
                        copyField(c, oppos[i]);
                        oppos[i].exist=true;
                        System.out.println(i+"번째 포켓몬 hp = " + oppos[i].hp);
                        System.out.println(i+"번째 포켓몬 Level = " + oppos[i].level);
                        System.out.println(i+"번째 포켓몬 =" + oppos[i].name);
                        break;

                    }
                    case 9: {
                        //피카츄
                        Pikachu c= new Pikachu(oppoLevel);
                        copyField(c, oppos[i]);
                        oppos[i].exist=true;
                        System.out.println(i+"번째 포켓몬 hp = " + oppos[i].hp);
                        System.out.println(i+"번째 포켓몬 Level = " + oppos[i].level);
                        System.out.println(i+"번째 포켓몬 =" + oppos[i].name);
                        break;

                    }
                    case 10: {
                        //라이츄
                        Raichu c = new Raichu(oppoLevel);
                        copyField(c, oppos[i]);
                        oppos[i].exist=true;
                        System.out.println(i+"번째 포켓몬 hp = " + oppos[i].hp);
                        System.out.println(i+"번째 포켓몬 Level = " + oppos[i].level);
                        System.out.println(i+"번째 포켓몬 =" + oppos[i].name);
                        break;

                    }
                    case 11: {
                        //구구
                        Googoo c = new Googoo(oppoLevel);
                        copyField(c, oppos[i]);
                        oppos[i].exist=true;
                        System.out.println(i+"번째 포켓몬 hp = " + oppos[i].hp);
                        System.out.println(i+"번째 포켓몬 Level = " + oppos[i].level);
                        System.out.println(i+"번째 포켓몬 =" + oppos[i].name);
                        break;

                    }
                    case 12: {
                        //피존
                        Pidgeon c = new Pidgeon(oppoLevel);
                        copyField(c, oppos[i]);
                        oppos[i].exist=true;
                        System.out.println(i+"번째 포켓몬 hp = " + oppos[i].hp);
                        System.out.println(i+"번째 포켓몬 Level = " + oppos[i].level);
                        System.out.println(i+"번째 포켓몬 =" + oppos[i].name);
                        break;

                    }
                    case 13: {
                        //피존투
                        Pidgeontwo c = new Pidgeontwo(oppoLevel);
                        copyField(c, oppos[i]);
                        oppos[i].exist=true;
                        System.out.println(i+"번째 포켓몬 hp = " + oppos[i].hp);
                        System.out.println(i+"번째 포켓몬 Level = " + oppos[i].level);
                        System.out.println(i+"번째 포켓몬 =" + oppos[i].name);
                        break;

                    }
                    case 14: {
                        //꼬렛
                        Rattata c = new Rattata(oppoLevel);
                        copyField(c, oppos[i]);
                        oppos[i].exist=true;
                        System.out.println(i+"번째 포켓몬 hp = " + oppos[i].hp);
                        System.out.println(i+"번째 포켓몬 Level = " + oppos[i].level);
                        System.out.println(i+"번째 포켓몬 =" + oppos[i].name);
                        break;

                    }
                    case 15: {
                        //레트라

                        Raticate c  = new Raticate(oppoLevel);
                        copyField(c, oppos[i]);
                        oppos[i].exist=true;
                        System.out.println(i+"번째 포켓몬 hp = " + oppos[i].hp);
                        System.out.println(i+"번째 포켓몬 Level = " + oppos[i].level);
                        System.out.println(i+"번째 포켓몬 =" + oppos[i].name);
                        break;

                    }
                    case 16: {
                        //꼬마돌
                        Kkomastone c = new Kkomastone(oppoLevel);
                        copyField(c, oppos[i]);
                        oppos[i].exist=true;
                        System.out.println(i+"번째 포켓몬 hp = " + oppos[i].hp);
                        System.out.println(i+"번째 포켓몬 Level = " + oppos[i].level);
                        System.out.println(i+"번째 포켓몬 =" + oppos[i].name);
                        break;

                    }
                    case 17: {
                        //데구리
                        Deguri c = new Deguri(oppoLevel);
                        copyField(c, oppos[i]);
                        oppos[i].exist=true;
                        System.out.println(i+"번째 포켓몬 hp = " + oppos[i].hp);
                        System.out.println(i+"번째 포켓몬 Level = " + oppos[i].level);
                        System.out.println(i+"번째 포켓몬 =" + oppos[i].name);
                        break;

                    }
                    case 18: {
                        //딱구리
                        Ddakguri c = new Ddakguri(oppoLevel);
                        copyField(c, oppos[i]);
                        oppos[i].exist=true;
                        System.out.println(i+"번째 포켓몬 hp = " + oppos[i].hp);
                        System.out.println(i+"번째 포켓몬 Level = " + oppos[i].level);
                        System.out.println(i+"번째 포켓몬 =" + oppos[i].name);
                        break;

                    }
                    case 19: {
                        //롱스톤
                        Longstone c = new Longstone(oppoLevel);
                        copyField(c, oppos[i]);
                        oppos[i].exist=true;
                        System.out.println(i+"번째 포켓몬 hp = " + oppos[i].hp);
                        System.out.println(i+"번째 포켓몬 Level = " + oppos[i].level);
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

    public void goBaattle(int rangeF, int rangeB, int Level) throws InterruptedException {
        System.out.println("rangeF" + rangeF);
        System.out.println("rangeB" + rangeB);

        System.out.println("\n\n\n\n\n");

        setmyPocketmon();
        setOppoPocketmon(rangeF, rangeB, Level);


        System.out.println("setOppo 나와서 객체를 정리해보자!");
        for (int i = 0; i < oppos.length; i++) {
            if (oppos[i]!=null){
            System.out.println(i + "번쨰 hp + "+ oppos[i].hp);
            System.out.println(i + "번쨰 name + "+ oppos[i].name);
        } else {
                System.out.println(i + "번째 포켓몬 없음");
            }}



       //배틀 시작
        String art = """ 
                 ________   ________   _________   _________   ___        _______       \s
                |\\   __  \\ |\\   __  \\ |\\___   ___\\|\\___   ___\\|\\  \\      |\\  ___ \\      \s
                \\ \\  \\|\\ /_\\ \\  \\|\\  \\\\|___ \\  \\_|\\|___ \\  \\_|\\ \\  \\     \\ \\   __/|     \s
                 \\ \\   __  \\\\ \\   __  \\    \\ \\  \\      \\ \\  \\  \\ \\  \\     \\ \\  \\_|/__   \s
                  \\ \\  \\|\\  \\\\ \\  \\ \\  \\    \\ \\  \\      \\ \\  \\  \\ \\  \\____ \\ \\  \\_|\\ \\  \s
                   \\ \\_______\\\\ \\__\\ \\__\\    \\ \\__\\      \\ \\__\\  \\ \\_______\\\\ \\_______\\ \s
                    \\|_______| \\|__|\\|__|     \\|__|       \\|__|   \\|_______| \\|_______| \s
                 ________   _________   ________   ________   _________        ___      \s
                |\\   ____\\ |\\___   ___\\|\\   __  \\ |\\   __  \\ |\\___   ___\\     |\\  \\     \s
                \\ \\  \\___|_\\|___ \\  \\_|\\ \\  \\|\\  \\\\ \\  \\|\\  \\\\|___ \\  \\_|     \\ \\  \\    \s
                 \\ \\_____  \\    \\ \\  \\  \\ \\   __  \\\\ \\   _  _\\    \\ \\  \\       \\ \\  \\   \s
                  \\|____|\\  \\    \\ \\  \\  \\ \\  \\ \\  \\\\ \\  \\\\  \\|    \\ \\  \\       \\ \\__\\  \s
                    ____\\_\\  \\    \\ \\__\\  \\ \\__\\ \\__\\\\ \\__\\\\ _\\     \\ \\__\\       \\|__|  \s
                   |\\_________\\    \\|__|   \\|__|\\|__| \\|__|\\|__|     \\|__|           ___\s
                   \\|_________|                                                     |\\__\\
                                                                                    \\|__|
                                                                                        \s                """;
        for (int i = 0; i < art.length(); i++) {
            System.out.print(art.charAt(i));
            Thread.sleep(2);
        }








        while (true) {
            System.out.println("\n\n\n");
        turnstack =0;
            System.out.println("mypokenum = " + battlePoke);
            System.out.println(battlePoke+ " 번째 내 포켓몬 상태 체크 =" + battlePoke.name + "레벨" + battlePoke.level);
//            System.out.println(battlePokeNum+ " 번째 내 포켓몬 HP =" + battlePoke.level);
//            System.out.println(battlePokeNum+ " 번째 내 포켓몬 LEVEL =" + battlePoke.hp);
//        if(myPoke[myPokeNum].hp==0){
//            changePoketmon(myPoke[myPokeNum],1);
//        }if(oppos[oppoPokeNum].hp==0){
//            changePoketmon(myPoke[myPokeNum],2);
//            }

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
