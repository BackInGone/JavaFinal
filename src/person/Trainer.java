package person;


import pocketmon.*;

import java.util.ArrayList;
import java.util.List;


public class Trainer extends Person {

//        availablePokemon.add(new Poktemon("Pikachu", 100, Arrays.asList(new move("Thunderbolt", 25, "Electric"), new Move("Quick Attack", 15, "Normal"))));

        List<Pocketmon> availablePokemon = new ArrayList<Pocketmon>(); //해보고 싶었는데


        FirstPocketmon a = new FirstPocketmon();
        SecondPocketmon b = new SecondPocketmon();
        ThirdPocketmon c = new ThirdPocketmon();
        FourthPocketmon d = new FourthPocketmon();
        FifthPocketmon e = new FifthPocketmon();
        SixthPocketmon f = new SixthPocketmon();
        public void setTrainerPoke(){
            for (int i = 0; i < 6; i++) {
                myPokeList[i] = 'a';
                int code = 65;}
        }
        static char[] myPokeList = new char[6];



        public int CountPocketmon(){
           int count = (FirstPocketmon.exist ? 1 : 0) + (SecondPocketmon.exist? 1 : 0) +
                   (ThirdPocketmon.exist? 1 : 0) + (FourthPocketmon.exist? 1 : 0) + (FifthPocketmon.exist? 1 : 0) + (SixthPocketmon.exist? 1 : 0);
           return count;
        }




}
