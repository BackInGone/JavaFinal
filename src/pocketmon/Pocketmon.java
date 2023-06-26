package pocketmon;

public class Pocketmon {

    public static int tmp;

    public boolean exist;
    public int index;
    public int level=1;
    public int exp;
    public int hp;
    public int hpMax;

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

    public void KeeptoTemp(int tlevel, int thp, int num){
        Temp temp = new Temp();

        if (num == 1) {
            temp.exist = FirstPocketmon.exist;
            temp.index = FirstPocketmon.index;
            temp.level = FirstPocketmon.level;
            temp.exp = FirstPocketmon.exp;
            temp.hp = FirstPocketmon.hp;
            temp.attack = FirstPocketmon.attack;
            temp.defence = FirstPocketmon.defence;
            temp.accuracy = FirstPocketmon.accuracy;
            temp.type = FirstPocketmon.type;
            temp.name = FirstPocketmon.name;
            temp.depth = FirstPocketmon.depth;
            temp.hpgrow = FirstPocketmon.hpgrow;
            temp.attackgrow = FirstPocketmon.attackgrow;
            temp.defencegrow = FirstPocketmon.defencegrow;
            temp.isPoisoned = FirstPocketmon.isPoisoned;
            temp.isParalyzed = FirstPocketmon.isParalyzed;
            temp.maxPP = FirstPocketmon.maxPP;
            temp.PP = FirstPocketmon.PP;
            temp.skill = FirstPocketmon.skill;
//        temp.current = 'b';

        }else if (num == 2) {
        temp.exist = SecondPocketmon.exist;
        temp.index = SecondPocketmon.index;
        temp.level = SecondPocketmon.level;
        temp.exp = SecondPocketmon.exp;
        temp.hp = SecondPocketmon.hp;
        temp.attack = SecondPocketmon.attack;
        temp.defence = SecondPocketmon.defence;
        temp.accuracy = SecondPocketmon.accuracy;
        temp.type = SecondPocketmon.type;
        temp.name = SecondPocketmon.name;
        temp.depth = SecondPocketmon.depth;
        temp.hpgrow = SecondPocketmon.hpgrow;
        temp.attackgrow = SecondPocketmon.attackgrow;
        temp.defencegrow = SecondPocketmon.defencegrow;
        temp.isPoisoned = SecondPocketmon.isPoisoned;
        temp.isParalyzed = SecondPocketmon.isParalyzed;
        temp.maxPP = SecondPocketmon.maxPP;
        temp.PP = SecondPocketmon.PP;
        temp.skill = SecondPocketmon.skill;
//        temp.current = 'b';

        }else if (num == 3) {
            temp.exist = ThirdPocketmon.exist;
            temp.index = ThirdPocketmon.index;
            temp.level = ThirdPocketmon.level;
            temp.exp = ThirdPocketmon.exp;
            temp.hp = ThirdPocketmon.hp;
            temp.attack = ThirdPocketmon.attack;
            temp.defence = ThirdPocketmon.defence;
            temp.accuracy = ThirdPocketmon.accuracy;
            temp.type = ThirdPocketmon.type;
            temp.name = ThirdPocketmon.name;
            temp.depth = ThirdPocketmon.depth;
            temp.hpgrow = ThirdPocketmon.hpgrow;
            temp.attackgrow = ThirdPocketmon.attackgrow;
            temp.defencegrow = ThirdPocketmon.defencegrow;
            temp.isPoisoned = ThirdPocketmon.isPoisoned;
            temp.isParalyzed = ThirdPocketmon.isParalyzed;
            temp.maxPP = ThirdPocketmon.maxPP;
            temp.PP = ThirdPocketmon.PP;
            temp.skill = ThirdPocketmon.skill;
//        temp.current = 'b';

        }else if (num == 4) {
            temp.exist = FourthPocketmon.exist;
            temp.index = FourthPocketmon.index;
            temp.level = FourthPocketmon.level;
            temp.exp = FourthPocketmon.exp;
            temp.hp = FourthPocketmon.hp;
            temp.attack = FourthPocketmon.attack;
            temp.defence = FourthPocketmon.defence;
            temp.accuracy = FourthPocketmon.accuracy;
            temp.type = FourthPocketmon.type;
            temp.name = FourthPocketmon.name;
            temp.depth = FourthPocketmon.depth;
            temp.hpgrow = FourthPocketmon.hpgrow;
            temp.attackgrow = FourthPocketmon.attackgrow;
            temp.defencegrow = FourthPocketmon.defencegrow;
            temp.isPoisoned = FourthPocketmon.isPoisoned;
            temp.isParalyzed = FourthPocketmon.isParalyzed;
            temp.maxPP = FourthPocketmon.maxPP;
            temp.PP = FourthPocketmon.PP;
            temp.skill = FourthPocketmon.skill;
//        temp.current = 'b';

        }else if (num == 5) {
            temp.exist = FifthPocketmon.exist;
            temp.index = FifthPocketmon.index;
            temp.level = FifthPocketmon.level;
            temp.exp = FifthPocketmon.exp;
            temp.hp = FifthPocketmon.hp;
            temp.attack = FifthPocketmon.attack;
            temp.defence = FifthPocketmon.defence;
            temp.accuracy = FifthPocketmon.accuracy;
            temp.type = FifthPocketmon.type;
            temp.name = FifthPocketmon.name;
            temp.depth = FifthPocketmon.depth;
            temp.hpgrow = FifthPocketmon.hpgrow;
            temp.attackgrow = FifthPocketmon.attackgrow;
            temp.defencegrow = FifthPocketmon.defencegrow;
            temp.isPoisoned = FifthPocketmon.isPoisoned;
            temp.isParalyzed = FifthPocketmon.isParalyzed;
            temp.maxPP = FifthPocketmon.maxPP;
            temp.PP = FifthPocketmon.PP;
            temp.skill = FifthPocketmon.skill;
//        temp.current = 'b';

        }else if (num == 6) {
            temp.exist = SixthPocketmon.exist;
            temp.index = SixthPocketmon.index;
            temp.level = SixthPocketmon.level;
            temp.exp = SixthPocketmon.exp;
            temp.hp = SixthPocketmon.hp;
            temp.attack = SixthPocketmon.attack;
            temp.defence = SixthPocketmon.defence;
            temp.accuracy = SixthPocketmon.accuracy;
            temp.type = SixthPocketmon.type;
            temp.name = SixthPocketmon.name;
            temp.depth = SixthPocketmon.depth;
            temp.hpgrow = SixthPocketmon.hpgrow;
            temp.attackgrow = SixthPocketmon.attackgrow;
            temp.defencegrow = SixthPocketmon.defencegrow;
            temp.isPoisoned = SixthPocketmon.isPoisoned;
            temp.isParalyzed = SixthPocketmon.isParalyzed;
            temp.maxPP = SixthPocketmon.maxPP;
            temp.PP = SixthPocketmon.PP;
            temp.skill = SixthPocketmon.skill;
//        temp.current = 'b';

        }

    }


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
    public void setFieldtoPikachu(Pocketmon t ,int level){
        Pikachu c = new Pikachu(level);
        t.exist = c.exist;
        t.index = c.index;
        t.level = c.level;
        t.exp = c.exp;
        t.hp = c.hp;
        t.attack = c.attack;
        t.defence = c.defence;
        t.accuracy = c.accuracy;
        t.type = c.type;
        t.name = c.name;
        t.depth = c.depth;
        t.hpgrow = c.hpgrow;
        t.attackgrow = c.attackgrow;
        t.defencegrow = c.defencegrow;
        t.isPoisoned = c.isPoisoned;
        t.isParalyzed = c.isParalyzed;
        t.maxPP = c.maxPP;
        t.PP = c.PP;
        t.skill = c.skill;
    }//9
    public void setFieldtoRaichu(int level){
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
    public void setFieldtoThird(){
        BattlePoke.exist = ThirdPocketmon.exist;
        BattlePoke.index = ThirdPocketmon.index;
        BattlePoke.level = ThirdPocketmon.level;
        BattlePoke.exp = ThirdPocketmon.exp;
        BattlePoke.hp = ThirdPocketmon.hp;
        BattlePoke.attack = ThirdPocketmon.attack;
        BattlePoke.defence = ThirdPocketmon.defence;
        BattlePoke.accuracy = ThirdPocketmon.accuracy;
        BattlePoke.type = ThirdPocketmon.type;
        BattlePoke.name = ThirdPocketmon.name;
        BattlePoke.depth = ThirdPocketmon.depth;
        BattlePoke.hpgrow = ThirdPocketmon.hpgrow;
        BattlePoke.attackgrow = ThirdPocketmon.attackgrow;
        BattlePoke.defencegrow = ThirdPocketmon.defencegrow;
        BattlePoke.isPoisoned = ThirdPocketmon.isPoisoned;
        BattlePoke.isParalyzed = ThirdPocketmon.isParalyzed;
        BattlePoke.maxPP = ThirdPocketmon.maxPP;
        BattlePoke.PP = ThirdPocketmon.PP;
        BattlePoke.skill = ThirdPocketmon.skill;
        BattlePoke.current = 'c';}
    public void setFieldtoFourth(){

        BattlePoke.exist = FourthPocketmon.exist;
        BattlePoke.index = FourthPocketmon.index;
        BattlePoke.level = FourthPocketmon.level;
        BattlePoke.exp = FourthPocketmon.exp;
        BattlePoke.hp = FourthPocketmon.hp;
        BattlePoke.attack = FourthPocketmon.attack;
        BattlePoke.defence = FourthPocketmon.defence;
        BattlePoke.accuracy = FourthPocketmon.accuracy;
        BattlePoke.type = FourthPocketmon.type;
        BattlePoke.name = FourthPocketmon.name;
        BattlePoke.depth = FourthPocketmon.depth;
        BattlePoke.hpgrow = FourthPocketmon.hpgrow;
        BattlePoke.attackgrow = FourthPocketmon.attackgrow;
        BattlePoke.defencegrow = FourthPocketmon.defencegrow;
        BattlePoke.isPoisoned = FourthPocketmon.isPoisoned;
        BattlePoke.isParalyzed = FourthPocketmon.isParalyzed;
        BattlePoke.maxPP = FourthPocketmon.maxPP;
        BattlePoke.PP = FourthPocketmon.PP;
        BattlePoke.skill = FourthPocketmon.skill;
        BattlePoke.current = 'd';
    }
    public void setFieldtoFifth(){

        BattlePoke.exist = FifthPocketmon.exist;
        BattlePoke.index = FifthPocketmon.index;
        BattlePoke.level = FifthPocketmon.level;
        BattlePoke.exp = FifthPocketmon.exp;
        BattlePoke.hp = FifthPocketmon.hp;
        BattlePoke.attack = FifthPocketmon.attack;
        BattlePoke.defence = FifthPocketmon.defence;
        BattlePoke.accuracy = FifthPocketmon.accuracy;
        BattlePoke.type = FifthPocketmon.type;
        BattlePoke.name = FifthPocketmon.name;
        BattlePoke.depth = FifthPocketmon.depth;
        BattlePoke.hpgrow = FifthPocketmon.hpgrow;
        BattlePoke.attackgrow = FifthPocketmon.attackgrow;
        BattlePoke.defencegrow = FifthPocketmon.defencegrow;
        BattlePoke.isPoisoned = FifthPocketmon.isPoisoned;
        BattlePoke.isParalyzed = FifthPocketmon.isParalyzed;
        BattlePoke.maxPP = FifthPocketmon.maxPP;
        BattlePoke.PP = FifthPocketmon.PP;
        BattlePoke.skill = FifthPocketmon.skill;
        BattlePoke.current = 'e';
    }
    public void setFieldtoSixth(){

        BattlePoke.exist = SixthPocketmon.exist;
        BattlePoke.index = SixthPocketmon.index;
        BattlePoke.level = SixthPocketmon.level;
        BattlePoke.exp = SixthPocketmon.exp;
        BattlePoke.hp = SixthPocketmon.hp;
        BattlePoke.attack = SixthPocketmon.attack;
        BattlePoke.defence = SixthPocketmon.defence;
        BattlePoke.accuracy = SixthPocketmon.accuracy;
        BattlePoke.type = SixthPocketmon.type;
        BattlePoke.name = SixthPocketmon.name;
        BattlePoke.depth = SixthPocketmon.depth;
        BattlePoke.hpgrow = SixthPocketmon.hpgrow;
        BattlePoke.attackgrow = SixthPocketmon.attackgrow;
        BattlePoke.defencegrow = SixthPocketmon.defencegrow;
        BattlePoke.isPoisoned = SixthPocketmon.isPoisoned;
        BattlePoke.isParalyzed = SixthPocketmon.isParalyzed;
        BattlePoke.maxPP = SixthPocketmon.maxPP;
        BattlePoke.PP = SixthPocketmon.PP;
        BattlePoke.skill = SixthPocketmon.skill;
        BattlePoke.current = 'f';
    }
    public void setBattletoFirst(){

        FirstPocketmon.exist = BattlePoke.exist;
        FirstPocketmon.index = BattlePoke.index;
        FirstPocketmon.level = BattlePoke.level;
        FirstPocketmon.exp = BattlePoke.exp;
        FirstPocketmon.hp = BattlePoke.hp;
        FirstPocketmon.attack = BattlePoke.attack;
        FirstPocketmon.defence = BattlePoke.defence;
        FirstPocketmon.accuracy = BattlePoke.accuracy;
        FirstPocketmon.type = BattlePoke.type;
        FirstPocketmon.name = BattlePoke.name;
        FirstPocketmon.depth = BattlePoke.depth;
        FirstPocketmon.hpgrow = BattlePoke.hpgrow;
        FirstPocketmon.attackgrow = BattlePoke.attackgrow;
        FirstPocketmon.defencegrow = BattlePoke.defencegrow;
        FirstPocketmon.isPoisoned = BattlePoke.isPoisoned;
        FirstPocketmon.isParalyzed = BattlePoke.isParalyzed;
        FirstPocketmon.maxPP = BattlePoke.maxPP;
        FirstPocketmon.PP = BattlePoke.PP;
        FirstPocketmon.skill = BattlePoke.skill;
        BattlePoke.current = ' ';
    }
    public void setBattletoSeoncd(){

        SecondPocketmon.exist = BattlePoke.exist;
        SecondPocketmon.index = BattlePoke.index;
        SecondPocketmon.level = BattlePoke.level;
        SecondPocketmon.exp = BattlePoke.exp;
        SecondPocketmon.hp = BattlePoke.hp;
        SecondPocketmon.attack = BattlePoke.attack;
        SecondPocketmon.defence = BattlePoke.defence;
        SecondPocketmon.accuracy = BattlePoke.accuracy;
        SecondPocketmon.type = BattlePoke.type;
        SecondPocketmon.name = BattlePoke.name;
        SecondPocketmon.depth = BattlePoke.depth;
        SecondPocketmon.hpgrow = BattlePoke.hpgrow;
        SecondPocketmon.attackgrow = BattlePoke.attackgrow;
        SecondPocketmon.defencegrow = BattlePoke.defencegrow;
        SecondPocketmon.isPoisoned = BattlePoke.isPoisoned;
        SecondPocketmon.isParalyzed = BattlePoke.isParalyzed;
        SecondPocketmon.maxPP = BattlePoke.maxPP;
        SecondPocketmon.PP = BattlePoke.PP;
        SecondPocketmon.skill = BattlePoke.skill;
        BattlePoke.current = ' ';
    }
    public void setBattletoThird(){

        ThirdPocketmon.exist = BattlePoke.exist;
        ThirdPocketmon.index = BattlePoke.index;
        ThirdPocketmon.level = BattlePoke.level;
        ThirdPocketmon.exp = BattlePoke.exp;
        ThirdPocketmon.hp = BattlePoke.hp;
        ThirdPocketmon.attack = BattlePoke.attack;
        ThirdPocketmon.defence = BattlePoke.defence;
        ThirdPocketmon.accuracy = BattlePoke.accuracy;
        ThirdPocketmon.type = BattlePoke.type;
        ThirdPocketmon.name = BattlePoke.name;
        ThirdPocketmon.depth = BattlePoke.depth;
        ThirdPocketmon.hpgrow = BattlePoke.hpgrow;
        ThirdPocketmon.attackgrow = BattlePoke.attackgrow;
        ThirdPocketmon.defencegrow = BattlePoke.defencegrow;
        ThirdPocketmon.isPoisoned = BattlePoke.isPoisoned;
        ThirdPocketmon.isParalyzed = BattlePoke.isParalyzed;
        ThirdPocketmon.maxPP = BattlePoke.maxPP;
        ThirdPocketmon.PP = BattlePoke.PP;
        ThirdPocketmon.skill = BattlePoke.skill;
        BattlePoke.current = ' ';
    }
    public void setBattletoFourth(){

        FourthPocketmon.exist = BattlePoke.exist;
        FourthPocketmon.index = BattlePoke.index;
        FourthPocketmon.level = BattlePoke.level;
        FourthPocketmon.exp = BattlePoke.exp;
        FourthPocketmon.hp = BattlePoke.hp;
        FourthPocketmon.attack = BattlePoke.attack;
        FourthPocketmon.defence = BattlePoke.defence;
        FourthPocketmon.accuracy = BattlePoke.accuracy;
        FourthPocketmon.type = BattlePoke.type;
        FourthPocketmon.name = BattlePoke.name;
        FourthPocketmon.depth = BattlePoke.depth;
        FourthPocketmon.hpgrow = BattlePoke.hpgrow;
        FourthPocketmon.attackgrow = BattlePoke.attackgrow;
        FourthPocketmon.defencegrow = BattlePoke.defencegrow;
        FourthPocketmon.isPoisoned = BattlePoke.isPoisoned;
        FourthPocketmon.isParalyzed = BattlePoke.isParalyzed;
        FourthPocketmon.maxPP = BattlePoke.maxPP;
        FourthPocketmon.PP = BattlePoke.PP;
        FourthPocketmon.skill = BattlePoke.skill;
        BattlePoke.current = ' ';
    }
    public void setBattletoFifth(){

        FifthPocketmon.exist = BattlePoke.exist;
        FifthPocketmon.index = BattlePoke.index;
        FifthPocketmon.level = BattlePoke.level;
        FifthPocketmon.exp = BattlePoke.exp;
        FifthPocketmon.hp = BattlePoke.hp;
        FifthPocketmon.attack = BattlePoke.attack;
        FifthPocketmon.defence = BattlePoke.defence;
        FifthPocketmon.accuracy = BattlePoke.accuracy;
        FifthPocketmon.type = BattlePoke.type;
        FifthPocketmon.name = BattlePoke.name;
        FifthPocketmon.depth = BattlePoke.depth;
        FifthPocketmon.hpgrow = BattlePoke.hpgrow;
        FifthPocketmon.attackgrow = BattlePoke.attackgrow;
        FifthPocketmon.defencegrow = BattlePoke.defencegrow;
        FifthPocketmon.isPoisoned = BattlePoke.isPoisoned;
        FifthPocketmon.isParalyzed = BattlePoke.isParalyzed;
        FifthPocketmon.maxPP = BattlePoke.maxPP;
        FifthPocketmon.PP = BattlePoke.PP;
        FifthPocketmon.skill = BattlePoke.skill;
        BattlePoke.current = ' ';
    }
    public void setBattletoSixth(){

        SixthPocketmon.exist = BattlePoke.exist;
        SixthPocketmon.index = BattlePoke.index;
        SixthPocketmon.level = BattlePoke.level;
        SixthPocketmon.exp = BattlePoke.exp;
        SixthPocketmon.hp = BattlePoke.hp;
        SixthPocketmon.attack = BattlePoke.attack;
        SixthPocketmon.defence = BattlePoke.defence;
        SixthPocketmon.accuracy = BattlePoke.accuracy;
        SixthPocketmon.type = BattlePoke.type;
        SixthPocketmon.name = BattlePoke.name;
        SixthPocketmon.depth = BattlePoke.depth;
        SixthPocketmon.hpgrow = BattlePoke.hpgrow;
        SixthPocketmon.attackgrow = BattlePoke.attackgrow;
        SixthPocketmon.defencegrow = BattlePoke.defencegrow;
        SixthPocketmon.isPoisoned = BattlePoke.isPoisoned;
        SixthPocketmon.isParalyzed = BattlePoke.isParalyzed;
        SixthPocketmon.maxPP = BattlePoke.maxPP;
        SixthPocketmon.PP = BattlePoke.PP;
        SixthPocketmon.skill = BattlePoke.skill;
        BattlePoke.current = ' ';
    }

    public void setBattleVoid(){
        BattlePoke.exist = false;
        BattlePoke.index = 0;
        BattlePoke.level = 0;
        BattlePoke.exp = 0;
        BattlePoke.hp = 0;
        BattlePoke.attack = 0;
        BattlePoke.defence = 0;
        BattlePoke.accuracy = 0;
        BattlePoke.type = null;
        BattlePoke.name = null;
        BattlePoke.depth = 0;
        BattlePoke.hpgrow = 0;
        BattlePoke.attackgrow = 0;
        BattlePoke.defencegrow = 0;
        BattlePoke.isPoisoned = false;
        BattlePoke.isParalyzed =false;
        BattlePoke.maxPP = null;
        BattlePoke.PP = null;
        BattlePoke.skill = null;
        BattlePoke.current = ' ';
    }

    }

