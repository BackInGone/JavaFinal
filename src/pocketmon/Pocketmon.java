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

    public int[] maxPP = new int[4];
    public int[] PP = new int[4];
    public int[] skill = new int[5];


    public Pocketmon(){}
    public Pocketmon(int level){
        this.level = level;
    }



    public void takeDamage ( int damage){
        this.hp -= damage;
        if (hp < 0) {
            hp = 0;
        }

    }

    public boolean setParalyzed(){
        isParalyzed=true;
        return isParalyzed;
    }

    public int ParalyzeDepth(int depth){
        return depth;
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
    }
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
    }
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
    }
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
    }
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
    }
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
    }
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
    }
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
    }
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
    }
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
    }
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
    }
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
    }
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
    }
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
    }
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
    }
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
    }
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
    }
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
    }
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
    }
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
    }
    public void setFieldtoFirst(){
        this.exist = FirstPocketmon.exist;
        this.index = FirstPocketmon.index;
        this.level = FirstPocketmon.level;
        this.exp = FirstPocketmon.exp;
        this.hp = FirstPocketmon.hp;
        this.attack = FirstPocketmon.attack;
        this.defence = FirstPocketmon.defence;
        this.accuracy = FirstPocketmon.accuracy;
        this.type = FirstPocketmon.type;
        this.name = FirstPocketmon.name;
        this.depth = FirstPocketmon.depth;
        this.hpgrow = FirstPocketmon.hpgrow;
        this.attackgrow = FirstPocketmon.attackgrow;
        this.defencegrow = FirstPocketmon.defencegrow;
        this.isPoisoned = FirstPocketmon.isPoisoned;
        this.isParalyzed = FirstPocketmon.isParalyzed;
        this.maxPP = FirstPocketmon.maxPP;
        this.PP = FirstPocketmon.PP;
        this.skill = FirstPocketmon.skill;
    }
    public void setFieldtoSecond(){}
    public void setFieldtoThird(){}
    public void setFieldtoFourth(){}
    public void setFieldtoFifth(){}
    public void setFieldtoSixth(){}
    }

