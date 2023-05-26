package pocketmon;

public class Pocketmon {

    public static int tmp;

    public boolean exist;
    public int index;
    public int level=1;
    public int exp;
    public int hp;
    public float attack;
    public float defence;
    public float accuracy;
    public String type;
    public String name;
    public int depth;

    public float hpgrow;
    public float attackgrow;
    public float defencegrow;
    public boolean isParalyzed;
    public boolean isPoisoned;

    public int[] maxPP = new int[5];
    public int[] PP = new int[5];
    public int[] skill = new int[5];


    public Pocketmon(){}
    public Pocketmon(int level){
        this.level = level;
    }

    public int afterLevelUpCheck(int index, int level) {
        switch (index) {
            case 0:
                if (level == 15) {
                    return 7;
                } else if (level == 30) {
                    return 8;
                } else{break;}
            case 1:
                if (level == 12) {
                    return 7;
                } else if (level == 25) {
                    return 8;
                } else{break;}
            case 2:
                if (level == 22) {
                    return 8;
                }else{break;}
            case 3:
                if (level == 15) {
                    return 10;
                } else if (level == 30) {
                    return 11;
                }else{break;}
            case 4:
                if (level == 12) {
                    return 10;
                } else if (level == 25) {
                    return 11;
                }else{break;}
            case 5:
                if (level == 22) {
                    return 11;
                }else{break;}
            case 6:
                if (level == 15) {
                    return 13;
                } else if (level == 30) {
                    return 14;
                }else{break;}
            case 7:
                if (level == 12) {
                    return 13;
                } else if (level == 25) {
                    return 14;
                }else{break;}
            case 8:
                if (level == 22) {
                    return 14;
                }else{break;}
            case 9:
                if (level == 10) {
                    return 5;
                } else if (level == 40) {
                    return 15;
                }else{break;}
            case 10:
                if (level == 8) {
                    return 10;
                } else if (level == 30) {
                    return 8;
                }else{break;}
            case 11:
                if (level == 15) {
                    return 16;
                } else if (level == 30) {
                    return 17;
                }else{break;}
            case 12:
                if (level == 12) {
                    return 16;
                } else if (level == 28) {
                    return 17;
                }else{break;}
            case 13:
                if (level == 25) {
                    return 17;
                }else{break;}
            case 14:
                if (level == 10) {
                    return 18;
                } else if (level == 30) {
                    return 19;
                }else{break;}
            case 15:
                if (level == 25) {
                    return 19;
                }else{break;}
            case 16:
                if (level == 15) {
                    return 20;
                } else if (level == 30) {
                    return 21;
                }else{break;}
            case 17:
                if (level == 17) {
                    return 20;
                } else if (level == 25) {
                    return 21;
                }else{break;}
            case 18:
                if (level == 27) {
                    return 21;
                }else{break;}
            case 19:
                if (level == 10) {
                    return 3;
                } else if (level == 13) {
                    return 20;
                } else if (level == 20) {
                    return 21;
                }else{break;}
        }
        return 0;
    }

    public int setPPafterLvUp(int skillnum){
        switch (skillnum){
            case 0:
            {break;}
            case 1:
            return 20;
            case 2: return 15;
            case 3: return 20;
            case 4: return 15;
            case 5: return 10;
            case 6: return 15;
            case 7: return 10;
            case 8: return 5;
            case 9: return 15;
            case 10: return 10;
            case 11: return 50;
            case 12: return 15;
            case 13: return 10;
            case 14: return 5;
            case 15: return 5;
            case 16: return 10;
            case 17: return 5;
            case 18: return 15;
            case 19: return 10;
            case 20: return 10;
            case 21: return 5;
        }
        return 0;
    }

    public void takeDamage ( int damage){
        this.hp = hp - damage;
        if (hp <= 0) {
            hp = 0;
            System.out.println("take damage 안에서 0");
        }

    }

    public boolean setParalyzed(int depth){

        int possible = (int)(Math.random()*10);
        if(isParalyzed){return true;}
        else {
            if (possible > 7) {
                isParalyzed = true;
                System.out.println("상대방이 감전되었다!");
            } else {
                isParalyzed = false;
            }
            return isParalyzed;
        }
    }


    public void setPoison(){}
    public void setBurned(){}

    public void setFieldtoCharmen(){
        Charmender c = new Charmender(level);
        this.exist = c.exist;
        this.index = c.index;
        this.level = c.level;
        this.exp = c.exp;
        this.hp = c.hp;
        this.attack = c.attack;
        this.defence = c.defence;
        this.accuracy = c.accuracy;
        this.type = c.type;
        this.name = c.name;
        this.depth = c.depth;
        this.hpgrow = c.hpgrow;
        this.attackgrow = c.attackgrow;
        this.defencegrow = c.defencegrow;
        this.isPoisoned = c.isPoisoned;
        this.isParalyzed = c.isParalyzed;
        this.maxPP = c.maxPP;
        this.PP = c.PP;
        this.skill = c.skill;
    } //0
    public void setFieldtoCharizard(){
        Charizard c = new Charizard(level);
        this.exist = c.exist;
        this.index = c.index;
        this.level = c.level;
        this.exp = c.exp;
        this.hp = c.hp;
        this.attack = c.attack;
        this.defence = c.defence;
        this.accuracy = c.accuracy;
        this.type = c.type;
        this.name = c.name;
        this.depth = c.depth;
        this.hpgrow = c.hpgrow;
        this.attackgrow = c.attackgrow;
        this.defencegrow = c.defencegrow;
        this.isPoisoned = c.isPoisoned;
        this.isParalyzed = c.isParalyzed;
        this.maxPP = c.maxPP;
        this.PP = c.PP;
        this.skill = c.skill;
    }//1
    public void setFieldtoCharmeleon(){
        Charmeleon c = new Charmeleon(level);
        this.exist = c.exist;
        this.index = c.index;
        this.level = c.level;
        this.exp = c.exp;
        this.hp = c.hp;
        this.attack = c.attack;
        this.defence = c.defence;
        this.accuracy = c.accuracy;
        this.type = c.type;
        this.name = c.name;
        this.depth = c.depth;
        this.hpgrow = c.hpgrow;
        this.attackgrow = c.attackgrow;
        this.defencegrow = c.defencegrow;
        this.isPoisoned = c.isPoisoned;
        this.isParalyzed = c.isParalyzed;
        this.maxPP = c.maxPP;
        this.PP = c.PP;
        this.skill = c.skill;
    }//2
    public void setFieldtoKkobook(){
        Kkobook c = new Kkobook(level);
        this.exist = c.exist;
        this.index = c.index;
        this.level = c.level;
        this.exp = c.exp;
        this.hp = c.hp;
        this.attack = c.attack;
        this.defence = c.defence;
        this.accuracy = c.accuracy;
        this.type = c.type;
        this.name = c.name;
        this.depth = c.depth;
        this.hpgrow = c.hpgrow;
        this.attackgrow = c.attackgrow;
        this.defencegrow = c.defencegrow;
        this.isPoisoned = c.isPoisoned;
        this.isParalyzed = c.isParalyzed;
        this.maxPP = c.maxPP;
        this.PP = c.PP;
        this.skill = c.skill;
    }//3
    public void setFieldtoEarny(){
        Earnybook c = new Earnybook(level);
        this.exist = c.exist;
        this.index = c.index;
        this.level = c.level;
        this.exp = c.exp;
        this.hp = c.hp;
        this.attack = c.attack;
        this.defence = c.defence;
        this.accuracy = c.accuracy;
        this.type = c.type;
        this.name = c.name;
        this.depth = c.depth;
        this.hpgrow = c.hpgrow;
        this.attackgrow = c.attackgrow;
        this.defencegrow = c.defencegrow;
        this.isPoisoned = c.isPoisoned;
        this.isParalyzed = c.isParalyzed;
        this.maxPP = c.maxPP;
        this.PP = c.PP;
        this.skill = c.skill;
    }//4
    public void setFieldtoKingbook(){
        Kingbook c = new Kingbook(level);
        this.exist = c.exist;
        this.index = c.index;
        this.level = c.level;
        this.exp = c.exp;
        this.hp = c.hp;
        this.attack = c.attack;
        this.defence = c.defence;
        this.accuracy = c.accuracy;
        this.type = c.type;
        this.name = c.name;
        this.depth = c.depth;
        this.hpgrow = c.hpgrow;
        this.attackgrow = c.attackgrow;
        this.defencegrow = c.defencegrow;
        this.isPoisoned = c.isPoisoned;
        this.isParalyzed = c.isParalyzed;
        this.maxPP = c.maxPP;
        this.PP = c.PP;
        this.skill = c.skill;
    }//5
    public void setFieldtoEssangssi(){
        Esangssi c = new Esangssi(level);
        this.exist = c.exist;
        this.index = c.index;
        this.level = c.level;
        this.exp = c.exp;
        this.hp = c.hp;
        this.attack = c.attack;
        this.defence = c.defence;
        this.accuracy = c.accuracy;
        this.type = c.type;
        this.name = c.name;
        this.depth = c.depth;
        this.hpgrow = c.hpgrow;
        this.attackgrow = c.attackgrow;
        this.defencegrow = c.defencegrow;
        this.isPoisoned = c.isPoisoned;
        this.isParalyzed = c.isParalyzed;
        this.maxPP = c.maxPP;
        this.PP = c.PP;
        this.skill = c.skill;
    }//6
    public void setFieldtoEssangpool(){
        Esangpool c = new Esangpool(level);
        this.exist = c.exist;
        this.index = c.index;
        this.level = c.level;
        this.exp = c.exp;
        this.hp = c.hp;
        this.attack = c.attack;
        this.defence = c.defence;
        this.accuracy = c.accuracy;
        this.type = c.type;
        this.name = c.name;
        this.depth = c.depth;
        this.hpgrow = c.hpgrow;
        this.attackgrow = c.attackgrow;
        this.defencegrow = c.defencegrow;
        this.isPoisoned = c.isPoisoned;
        this.isParalyzed = c.isParalyzed;
        this.maxPP = c.maxPP;
        this.PP = c.PP;
        this.skill = c.skill;
    }//7
    public void setFieldtoEssankkot(){
        Esangkkot c = new Esangkkot(level);
        this.exist = c.exist;
        this.index = c.index;
        this.level = c.level;
        this.exp = c.exp;
        this.hp = c.hp;
        this.attack = c.attack;
        this.defence = c.defence;
        this.accuracy = c.accuracy;
        this.type = c.type;
        this.name = c.name;
        this.depth = c.depth;
        this.hpgrow = c.hpgrow;
        this.attackgrow = c.attackgrow;
        this.defencegrow = c.defencegrow;
        this.isPoisoned = c.isPoisoned;
        this.isParalyzed = c.isParalyzed;
        this.maxPP = c.maxPP;
        this.PP = c.PP;
        this.skill = c.skill;
    }//8
    public void setFieldtoPikachu(){
        Pikachu c = new Pikachu(level);
        this.exist = c.exist;
        this.index = c.index;
        this.level = c.level;
        this.exp = c.exp;
        this.hp = c.hp;
        this.attack = c.attack;
        this.defence = c.defence;
        this.accuracy = c.accuracy;
        this.type = c.type;
        this.name = c.name;
        this.depth = c.depth;
        this.hpgrow = c.hpgrow;
        this.attackgrow = c.attackgrow;
        this.defencegrow = c.defencegrow;
        this.isPoisoned = c.isPoisoned;
        this.isParalyzed = c.isParalyzed;
        this.maxPP = c.maxPP;
        this.PP = c.PP;
        this.skill = c.skill;
    }//9
    public void setFieldtoRaichu(){
        Raichu c = new Raichu(level);
        this.exist = c.exist;
        this.index = c.index;
        this.level = c.level;
        this.exp = c.exp;
        this.hp = c.hp;
        this.attack = c.attack;
        this.defence = c.defence;
        this.accuracy = c.accuracy;
        this.type = c.type;
        this.name = c.name;
        this.depth = c.depth;
        this.hpgrow = c.hpgrow;
        this.attackgrow = c.attackgrow;
        this.defencegrow = c.defencegrow;
        this.isPoisoned = c.isPoisoned;
        this.isParalyzed = c.isParalyzed;
        this.maxPP = c.maxPP;
        this.PP = c.PP;
        this.skill = c.skill;
    }//10
    public void setFieldtoGoogoo(){
        Googoo c = new Googoo(level);
        this.exist = c.exist;
        this.index = c.index;
        this.level = c.level;
        this.exp = c.exp;
        this.hp = c.hp;
        this.attack = c.attack;
        this.defence = c.defence;
        this.accuracy = c.accuracy;
        this.type = c.type;
        this.name = c.name;
        this.depth = c.depth;
        this.hpgrow = c.hpgrow;
        this.attackgrow = c.attackgrow;
        this.defencegrow = c.defencegrow;
        this.isPoisoned = c.isPoisoned;
        this.isParalyzed = c.isParalyzed;
        this.maxPP = c.maxPP;
        this.PP = c.PP;
        this.skill = c.skill;
    }//11
    public void setFieldtoPidgeon(){
        Pidgeon c = new Pidgeon(level);
        this.exist = c.exist;
        this.index = c.index;
        this.level = c.level;
        this.exp = c.exp;
        this.hp = c.hp;
        this.attack = c.attack;
        this.defence = c.defence;
        this.accuracy = c.accuracy;
        this.type = c.type;
        this.name = c.name;
        this.depth = c.depth;
        this.hpgrow = c.hpgrow;
        this.attackgrow = c.attackgrow;
        this.defencegrow = c.defencegrow;
        this.isPoisoned = c.isPoisoned;
        this.isParalyzed = c.isParalyzed;
        this.maxPP = c.maxPP;
        this.PP = c.PP;
        this.skill = c.skill;
    }//12
    public void setFieldtoPidgeontwo(){
        Pidgeontwo c = new Pidgeontwo(level);
        this.exist = c.exist;
        this.index = c.index;
        this.level = c.level;
        this.exp = c.exp;
        this.hp = c.hp;
        this.attack = c.attack;
        this.defence = c.defence;
        this.accuracy = c.accuracy;
        this.type = c.type;
        this.name = c.name;
        this.depth = c.depth;
        this.hpgrow = c.hpgrow;
        this.attackgrow = c.attackgrow;
        this.defencegrow = c.defencegrow;
        this.isPoisoned = c.isPoisoned;
        this.isParalyzed = c.isParalyzed;
        this.maxPP = c.maxPP;
        this.PP = c.PP;
        this.skill = c.skill;
    }//13
    public void setFieldtoRattata(){
        Rattata c = new Rattata(level);
        this.exist = c.exist;
        this.index = c.index;
        this.level = c.level;
        this.exp = c.exp;
        this.hp = c.hp;
        this.attack = c.attack;
        this.defence = c.defence;
        this.accuracy = c.accuracy;
        this.type = c.type;
        this.name = c.name;
        this.depth = c.depth;
        this.hpgrow = c.hpgrow;
        this.attackgrow = c.attackgrow;
        this.defencegrow = c.defencegrow;
        this.isPoisoned = c.isPoisoned;
        this.isParalyzed = c.isParalyzed;
        this.maxPP = c.maxPP;
        this.PP = c.PP;
        this.skill = c.skill;
    }//14
    public void setFieldtoRaticate(){
        Raticate c = new Raticate(level);
        this.exist = c.exist;
        this.index = c.index;
        this.level = c.level;
        this.exp = c.exp;
        this.hp = c.hp;
        this.attack = c.attack;
        this.defence = c.defence;
        this.accuracy = c.accuracy;
        this.type = c.type;
        this.name = c.name;
        this.depth = c.depth;
        this.hpgrow = c.hpgrow;
        this.attackgrow = c.attackgrow;
        this.defencegrow = c.defencegrow;
        this.isPoisoned = c.isPoisoned;
        this.isParalyzed = c.isParalyzed;
        this.maxPP = c.maxPP;
        this.PP = c.PP;
        this.skill = c.skill;
    }//15
    public void setFieldtoKkomastone(){
        Kkomastone c = new Kkomastone(level);
        this.exist = c.exist;
        this.index = c.index;
        this.level = c.level;
        this.exp = c.exp;
        this.hp = c.hp;
        this.attack = c.attack;
        this.defence = c.defence;
        this.accuracy = c.accuracy;
        this.type = c.type;
        this.name = c.name;
        this.depth = c.depth;
        this.hpgrow = c.hpgrow;
        this.attackgrow = c.attackgrow;
        this.defencegrow = c.defencegrow;
        this.isPoisoned = c.isPoisoned;
        this.isParalyzed = c.isParalyzed;
        this.maxPP = c.maxPP;
        this.PP = c.PP;
        this.skill = c.skill;
    }//16
    public void setFieldtoDeguri(){
        Deguri c = new Deguri(level);
        this.exist = c.exist;
        this.index = c.index;
        this.level = c.level;
        this.exp = c.exp;
        this.hp = c.hp;
        this.attack = c.attack;
        this.defence = c.defence;
        this.accuracy = c.accuracy;
        this.type = c.type;
        this.name = c.name;
        this.depth = c.depth;
        this.hpgrow = c.hpgrow;
        this.attackgrow = c.attackgrow;
        this.defencegrow = c.defencegrow;
        this.isPoisoned = c.isPoisoned;
        this.isParalyzed = c.isParalyzed;
        this.maxPP = c.maxPP;
        this.PP = c.PP;
        this.skill = c.skill;
    }//17
    public void setFieldtoDdakguri(){
        Ddakguri c = new Ddakguri(level);
        this.exist = c.exist;
        this.index = c.index;
        this.level = c.level;
        this.exp = c.exp;
        this.hp = c.hp;
        this.attack = c.attack;
        this.defence = c.defence;
        this.accuracy = c.accuracy;
        this.type = c.type;
        this.name = c.name;
        this.depth = c.depth;
        this.hpgrow = c.hpgrow;
        this.attackgrow = c.attackgrow;
        this.defencegrow = c.defencegrow;
        this.isPoisoned = c.isPoisoned;
        this.isParalyzed = c.isParalyzed;
        this.maxPP = c.maxPP;
        this.PP = c.PP;
        this.skill = c.skill;
    }//18
    public void setFieldtoLongstone(){
        Longstone c = new Longstone(level);
        this.exist = c.exist;
        this.index = c.index;
        this.level = c.level;
        this.exp = c.exp;
        this.hp = c.hp;
        this.attack = c.attack;
        this.defence = c.defence;
        this.accuracy = c.accuracy;
        this.type = c.type;
        this.name = c.name;
        this.depth = c.depth;
        this.hpgrow = c.hpgrow;
        this.attackgrow = c.attackgrow;
        this.defencegrow = c.defencegrow;
        this.isPoisoned = c.isPoisoned;
        this.isParalyzed = c.isParalyzed;
        this.maxPP = c.maxPP;
        this.PP = c.PP;
        this.skill = c.skill;
    }//19
    public void setFieldtoFirst(){
        BattlePoke.exist = FirstPocketmon.exist;
        BattlePoke.index = FirstPocketmon.index;
        BattlePoke.level = FirstPocketmon.level;
        BattlePoke.exp = FirstPocketmon.exp;
        BattlePoke.hp = FirstPocketmon.hp;
        BattlePoke.attack = FirstPocketmon.attack;
        BattlePoke.defence = FirstPocketmon.defence;
        BattlePoke.accuracy = FirstPocketmon.accuracy;
        BattlePoke.type = FirstPocketmon.type;
        BattlePoke.name = FirstPocketmon.name;
        BattlePoke.depth = FirstPocketmon.depth;
        BattlePoke.hpgrow = FirstPocketmon.hpgrow;
        BattlePoke.attackgrow = FirstPocketmon.attackgrow;
        BattlePoke.defencegrow = FirstPocketmon.defencegrow;
        BattlePoke.isPoisoned = FirstPocketmon.isPoisoned;
        BattlePoke.isParalyzed = FirstPocketmon.isParalyzed;
        BattlePoke.maxPP = FirstPocketmon.maxPP;
        BattlePoke.PP = FirstPocketmon.PP;
        BattlePoke.skill = FirstPocketmon.skill;
        BattlePoke.current = 'a';
    }
    public void setFieldtoSecond(){
        BattlePoke.exist = SecondPocketmon.exist;
        BattlePoke.index = SecondPocketmon.index;
        BattlePoke.level = SecondPocketmon.level;
        BattlePoke.exp = SecondPocketmon.exp;
        BattlePoke.hp = SecondPocketmon.hp;
        BattlePoke.attack = SecondPocketmon.attack;
        BattlePoke.defence = SecondPocketmon.defence;
        BattlePoke.accuracy = SecondPocketmon.accuracy;
        BattlePoke.type = SecondPocketmon.type;
        BattlePoke.name = SecondPocketmon.name;
        BattlePoke.depth = SecondPocketmon.depth;
        BattlePoke.hpgrow = SecondPocketmon.hpgrow;
        BattlePoke.attackgrow = SecondPocketmon.attackgrow;
        BattlePoke.defencegrow = SecondPocketmon.defencegrow;
        BattlePoke.isPoisoned = SecondPocketmon.isPoisoned;
        BattlePoke.isParalyzed = SecondPocketmon.isParalyzed;
        BattlePoke.maxPP = SecondPocketmon.maxPP;
        BattlePoke.PP = SecondPocketmon.PP;
        BattlePoke.skill = SecondPocketmon.skill;
        BattlePoke.current = 'b';
    }
    public void setFieldtoThird(BattlePoke p){
        this.exist = ThirdPocketmon.exist;
        this.index = ThirdPocketmon.index;
        this.level = ThirdPocketmon.level;
        this.exp = ThirdPocketmon.exp;
        this.hp = ThirdPocketmon.hp;
        this.attack = ThirdPocketmon.attack;
        this.defence = ThirdPocketmon.defence;
        this.accuracy = ThirdPocketmon.accuracy;
        this.type = ThirdPocketmon.type;
        this.name = ThirdPocketmon.name;
        this.depth = ThirdPocketmon.depth;
        this.hpgrow = ThirdPocketmon.hpgrow;
        this.attackgrow = ThirdPocketmon.attackgrow;
        this.defencegrow = ThirdPocketmon.defencegrow;
        this.isPoisoned = ThirdPocketmon.isPoisoned;
        this.isParalyzed = ThirdPocketmon.isParalyzed;
        this.maxPP = ThirdPocketmon.maxPP;
        this.PP = ThirdPocketmon.PP;
        this.skill = ThirdPocketmon.skill;
        BattlePoke.current = 'c';}
    public void setFieldtoFourth(BattlePoke p){

        this.exist = FourthPocketmon.exist;
        this.index = FourthPocketmon.index;
        this.level = FourthPocketmon.level;
        this.exp = FourthPocketmon.exp;
        this.hp = FourthPocketmon.hp;
        this.attack = FourthPocketmon.attack;
        this.defence = FourthPocketmon.defence;
        this.accuracy = FourthPocketmon.accuracy;
        this.type = FourthPocketmon.type;
        this.name = FourthPocketmon.name;
        this.depth = FourthPocketmon.depth;
        this.hpgrow = FourthPocketmon.hpgrow;
        this.attackgrow = FourthPocketmon.attackgrow;
        this.defencegrow = FourthPocketmon.defencegrow;
        this.isPoisoned = FourthPocketmon.isPoisoned;
        this.isParalyzed = FourthPocketmon.isParalyzed;
        this.maxPP = FourthPocketmon.maxPP;
        this.PP = FourthPocketmon.PP;
        this.skill = FourthPocketmon.skill;
        BattlePoke.current = 'd';
    }
    public void setFieldtoFifth(BattlePoke p){

        this.exist = FifthPocketmon.exist;
        this.index = FifthPocketmon.index;
        this.level = FifthPocketmon.level;
        this.exp = FifthPocketmon.exp;
        this.hp = FifthPocketmon.hp;
        this.attack = FifthPocketmon.attack;
        this.defence = FifthPocketmon.defence;
        this.accuracy = FifthPocketmon.accuracy;
        this.type = FifthPocketmon.type;
        this.name = FifthPocketmon.name;
        this.depth = FifthPocketmon.depth;
        this.hpgrow = FifthPocketmon.hpgrow;
        this.attackgrow = FifthPocketmon.attackgrow;
        this.defencegrow = FifthPocketmon.defencegrow;
        this.isPoisoned = FifthPocketmon.isPoisoned;
        this.isParalyzed = FifthPocketmon.isParalyzed;
        this.maxPP = FifthPocketmon.maxPP;
        this.PP = FifthPocketmon.PP;
        this.skill = FifthPocketmon.skill;
        BattlePoke.current = 'e';
    }
    public void setFieldtoSixth(BattlePoke p){

        this.exist = SixthPocketmon.exist;
        this.index = SixthPocketmon.index;
        this.level = SixthPocketmon.level;
        this.exp = SixthPocketmon.exp;
        this.hp = SixthPocketmon.hp;
        this.attack = SixthPocketmon.attack;
        this.defence = SixthPocketmon.defence;
        this.accuracy = SixthPocketmon.accuracy;
        this.type = SixthPocketmon.type;
        this.name = SixthPocketmon.name;
        this.depth = SixthPocketmon.depth;
        this.hpgrow = SixthPocketmon.hpgrow;
        this.attackgrow = SixthPocketmon.attackgrow;
        this.defencegrow = SixthPocketmon.defencegrow;
        this.isPoisoned = SixthPocketmon.isPoisoned;
        this.isParalyzed = SixthPocketmon.isParalyzed;
        this.maxPP = SixthPocketmon.maxPP;
        this.PP = SixthPocketmon.PP;
        this.skill = SixthPocketmon.skill;
        BattlePoke.current = 'f';
    }
    public void setFieldtoBattle(BattlePoke p){

        this.exist = BattlePoke.exist;
        this.index = BattlePoke.index;
        this.level = BattlePoke.level;
        this.exp = BattlePoke.exp;
        this.hp = BattlePoke.hp;
        this.attack = BattlePoke.attack;
        this.defence = BattlePoke.defence;
        this.accuracy = BattlePoke.accuracy;
        this.type = BattlePoke.type;
        this.name = BattlePoke.name;
        this.depth = BattlePoke.depth;
        this.hpgrow = BattlePoke.hpgrow;
        this.attackgrow = BattlePoke.attackgrow;
        this.defencegrow = BattlePoke.defencegrow;
        this.isPoisoned = BattlePoke.isPoisoned;
        this.isParalyzed = BattlePoke.isParalyzed;
        this.maxPP = BattlePoke.maxPP;
        this.PP = BattlePoke.PP;
        this.skill = BattlePoke.skill;
        BattlePoke.current = ' ';
    }
    }

