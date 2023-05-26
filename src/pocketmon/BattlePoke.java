package pocketmon;

import Battle.Battle;

public class BattlePoke extends Pocketmon{

    public static char current;

    public static boolean exist;
    public static int index;
    public static int level;
    public static  int exp;
    public static int hp;
    public static float  attack;
    public static float  defence;
    public static float  accuracy;
    public static String type;
    public static String name;
    public static int depth;

    public static float hpgrow;
    public static float attackgrow;
    public static float defencegrow;
    public static boolean isParalyzed;
    public static boolean isPoisoned;

    public static int[] maxPP = new int[5];
    public static int[] PP = new int[5];
    public static int[] skill = new int[5];

    public void takeDamage(int damage){
        BattlePoke.hp-= damage;
        if (hp <= 0) {
            hp = 0;
            System.out.println("take damage 안에서 0");
        }
    }
}
