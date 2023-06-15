package Main;

import pocketmon.Pocketmon;

import java.util.ArrayList;

public class PocketmoncenterPanel {


/////////////////////////// 포켓몬 회복

//isparalyzed , ispoisoned, hp=hpmax, pp[4] = ppmax[4]





////////////////////////////포켓몬 저장
    private static ArrayList<Pocketmon> pocketmonStorage = new ArrayList<>();

    public void storePoketmon(Pocketmon t){
        pocketmonStorage.add(t);
    }



}
