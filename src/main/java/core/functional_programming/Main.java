package core.functional_programming;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> starters = new ArrayList<>(Arrays.asList(
                "Bulbasaur",
                "Squirtle",
                "Charmander"
        ));

        starters.stream()
                .filter(s -> !s.isEmpty())
                .map(String::toLowerCase) //same as s -> s.tolowercase()
                .forEach(System.out::println);
    }
}
