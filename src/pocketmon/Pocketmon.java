package pocketmon;

public class Pocketmon {

    public static int tmp;


    public int exp;
    public int hp;
    public int attack;
    public int depend;
    public int accuracy;
    public String type;
    public boolean faintcheck;
    public float hpgrow;
    public float attackgrow;
    public float dependgrow;


    public int setHp(int hp) {
        System.out.println("메소드 안에서 값 =" + this.hp);
        this.hp = hp;
        this.hp += 40;
        return this.hp;
    }
    public int getHP(){
        return hp;
    }
    public void setFaint(){
    }


    int[] skill = new int[3];

}
