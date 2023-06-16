package Main;

import pocketmon.*;

import java.util.ArrayList;

public class PocketmoncenterPanel {


/////////////////////////// 포켓몬 회복

//isparalyzed , ispoisoned, hp=hpmax, pp[4] = ppmax[4]
public void recoverAll() {
    FirstPocketmon.hp = FirstPocketmon.hpMax;
    SecondPocketmon.hp = SecondPocketmon.hpMax;
    ThirdPocketmon.hp = ThirdPocketmon.hpMax;
    FourthPocketmon.hp = FourthPocketmon.hpMax;
    FifthPocketmon.hp = FifthPocketmon.hpMax;
    SixthPocketmon.hp = SixthPocketmon.hpMax;

    FirstPocketmon.isParalyzed = false;
    SecondPocketmon.isParalyzed = false;
    ThirdPocketmon.isParalyzed = false;
    FourthPocketmon.isParalyzed = false;
    FifthPocketmon.isParalyzed = false;
    SixthPocketmon.isParalyzed = false;

    FirstPocketmon.isPoisoned = false;
    SecondPocketmon.isPoisoned = false;
    ThirdPocketmon.isPoisoned = false;
    FourthPocketmon.isPoisoned = false;
    FifthPocketmon.isPoisoned = false;
    SixthPocketmon.isPoisoned = false;

    System.out.println("포켓몬이 모두 회복되었습니다 :)");
    for (int i = 0; i < 6; i++) {

    }
}
/*public void CheckMyPoke(){
    FirstPocketmon.hp =
    SecondPocketmon.hp
    ThirdPocketmon.hp
    FourthPocketmon.hp
    FifthPocketmon.hp
    SixthPocketmon.hp

}*/



////////////////////////////포켓몬 저장
    private static ArrayList<Pocketmon> pocketmonStorage = new ArrayList<>();

    public void storePoketmon(Pocketmon t){
        pocketmonStorage.add(t);
    }



}
