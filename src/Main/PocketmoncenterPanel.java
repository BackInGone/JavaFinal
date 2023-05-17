package Main;

import pocketmon.Pocketmon;

import java.util.ArrayList;

public class PocketmoncenterPanel {
    private static ArrayList<Pocketmon> pocketmonStorage = new ArrayList<>();

    public void storePoketmon(Pocketmon t){
        pocketmonStorage.add(t);
    }
}
