package core;

import challenges.CountWordType;
import core.bubble_sort.BubbleSort;
import core.properties.Config;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        CountWordType wordCounter = new CountWordType(Config.fileLocation(),
                "src/main/resources/nbc_parse.txt");

    }
}
