package person;

import pocketmon.Pocketmon;

import java.awt.*;
import java.util.ArrayList;


public class Trainer extends Person {

//        availablePokemon.add(new Poktemon("Pikachu", 100, Arrays.asList(new move("Thunderbolt", 25, "Electric"), new Move("Quick Attack", 15, "Normal"))));

        List availablePokemon new ArrayList<Pocketmon>();
//    public static createAvailablePokemon() {
//        availablePokemon.add(new Poketmon("Charmander", 80, Arrays.asList(new Move("Ember", 20, "Fire"), new Move("Scratch", 15, "Normal"))));
//        availablePokemon.add(new Poketmon("Bulbasaur", 90, Arrays.asList(new Move("Vine Whip", 22, "Grass"), new Move("Tackle", 15, "Normal"))));
//        availablePokemon.add(new Poketmon("Squirtle", 85, Arrays.asList(new Move("Water Gun", 18, "Water"), new Move("Tackle", 15, "Normal"))));
//        availablePokemon.add(new Poketmon("Jigglypuff", 95, Arrays.asList(new Move("Pound", 20, "Normal"), new Move("Sing", 0, "Normal"))));
//        availablePokemon.add(new Poketmon("Geodude", 80, Arrays.asList(new Move("Rock Throw", 22, "Rock"), new Move("Tackle", 15, "Normal"))));
//        return availablePokemon;
//    }

    public getPockmetmon(List<Pocketmon> availablePokemon){
        this.availablePokemon = new ArrayList<>(availablePokemon);
    }


}
