package pocketmon;

public class Pocketmon {

    public static int tmp;

    public boolean exist;
    public int index;
    public int level;
    public int exp;
    public int hp;
    public int attack;
    public int defence;
    public int accuracy;
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
    public int[] skill = new int[4];


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

    }

