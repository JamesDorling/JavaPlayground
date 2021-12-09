package challenges.advent_of_code_2021;

import core.file_reading.FileScanner;

import java.util.ArrayList;
import java.util.Scanner;

public class Day2 {
    public ArrayList<String> getSubmarineFunctions() {
        //Get the file's scanner
        Scanner functionReader = FileScanner.getScannerForFile("src/main/resources/adventofcodeday2pathing.txt");
        //Predefine result
        ArrayList<String> result = new ArrayList<>();
        //Iterate through the file
        while (functionReader.hasNextLine()) {
            result.add(functionReader.nextLine());
        }
        //Print the result
        return result;
    }

    public int getSubmarineLocation(int currentLocation, ArrayList<String> directions) {
        for(String direction : directions) {
            String[] functionSplit = direction.split(" ");
            switch(functionSplit[0]){
                case "forward":
                    currentLocation = moveForwardFunction(Integer.parseInt(functionSplit[1]), currentLocation);
                case "down":
                    currentLocation = moveDownFunction(Integer.parseInt(functionSplit[1]), currentLocation);
                case "up":
                    currentLocation = moveUpFunction(Integer.parseInt(functionSplit[1]), currentLocation);
                default:
                    System.err.println("Couldnt read function!");
            }
        }
        return currentLocation;
    }

    private int moveForwardFunction(int distance, int currentLocation) {

        return 0;
    }

    private int moveUpFunction(int distance, int currentLocation) {

        return 0;
    }

    private int moveDownFunction(int distance, int currentLocation) {

        return 0;
    }

}
