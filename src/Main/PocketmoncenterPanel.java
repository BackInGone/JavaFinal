package Main;

import pocketmon.*;

import java.lang.management.ThreadInfo;
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

    for (int i = 0; i < 4; i++) {
    FirstPocketmon.PP[i] = FirstPocketmon.maxPP[i];
    }for (int i = 0; i < 4; i++) {
    SecondPocketmon.PP[i] = SecondPocketmon.maxPP[i];
    }for (int i = 0; i < 4; i++) {
    ThirdPocketmon.PP[i] = ThirdPocketmon.maxPP[i];
    }for (int i = 0; i < 4; i++) {
    FourthPocketmon.PP[i] = FourthPocketmon.maxPP[i];
    }for (int i = 0; i < 4; i++) {
    FifthPocketmon.PP[i] = FifthPocketmon.maxPP[i];
    }for (int i = 0; i < 4; i++) {
    SixthPocketmon.PP[i] = SixthPocketmon.maxPP[i];
    }
    /*
    FirstPocketmon.PP = FirstPocketmon.maxPP;
    SecondPocketmon.PP = SecondPocketmon.maxPP;
    ThirdPocketmon.PP = ThirdPocketmon.maxPP;
    FourthPocketmon.PP= FourthPocketmon.maxPP;
    FifthPocketmon.PP=FifthPocketmon.maxPP;
    SixthPocketmon.PP=SixthPocketmon.maxPP;
*/


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
