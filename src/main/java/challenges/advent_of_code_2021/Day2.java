package challenges.advent_of_code_2021;

import core.file_reading.FileScanner;

import java.util.ArrayList;
import java.util.Scanner;

public class Day2 {
    public static ArrayList<String> getSubmarineFunctions() {
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

    public static int[] getSubmarineLocationDepth(int currentHorizontal, int currentDepth, ArrayList<String> directions) {
        for(String direction : directions) {
            String[] functionSplit = direction.replaceAll("\\p{Punct}", "").split(" ");
            switch(functionSplit[0]){
                case "forward":
                    currentHorizontal = moveForwardFunction(Integer.parseInt(functionSplit[1]), currentHorizontal);
                    break;
                case "back":
                    currentHorizontal = moveBackwardFunction(Integer.parseInt(functionSplit[1]), currentHorizontal);
                    break;
                case "down":
                    currentDepth = moveDownFunction(Integer.parseInt(functionSplit[1]), currentDepth);
                    break;
                case "up":
                    currentDepth = moveUpFunction(Integer.parseInt(functionSplit[1]), currentDepth);
                    break;

                default:
                    System.err.println("Couldnt read function!");
            }
        }
        return new int[]{currentHorizontal, currentDepth};
    }

    public static int[] getSubmarineLocationAim(int currentHorizontal, int currentDepth, int currentAim, ArrayList<String> directions) {
        for(String direction : directions) {
            String[] functionSplit = direction.replaceAll("\\p{Punct}", "").split(" ");
            switch(functionSplit[0]){
                case "forward":
                    currentHorizontal = moveForwardWithAimFunction(Integer.parseInt(functionSplit[1]), currentAim, currentHorizontal);
                    break;
                case "back":
                    currentHorizontal = moveBackwardsWithAimFunction(Integer.parseInt(functionSplit[1]), currentAim, currentHorizontal);
                    break;
                case "down":
                    currentAim = moveDownFunction(Integer.parseInt(functionSplit[1]), currentDepth);
                    break;
                case "up":
                    currentAim = moveUpFunction(Integer.parseInt(functionSplit[1]), currentDepth);
                    break;

                default:
                    System.err.println("Couldnt read function!");
            }
        }
        return new int[]{currentHorizontal, currentDepth};
    }

    private static int moveForwardFunction(int distance, int currentLocation) {
        return currentLocation + distance;
    }

    private static int moveBackwardFunction(int distance, int currentLocation) {
        return currentLocation - distance;
    }

    private static int moveUpFunction(int distance, int currentLocation) {
        return currentLocation - distance;
    }

    private static int moveDownFunction(int distance, int currentLocation) {
        return currentLocation + distance;
    }

    private static int moveForwardWithAimFunction(int distance, int aim, int currentLocation) {
        return currentLocation + distance;
    }

    private static int moveBackwardsWithAimFunction(int distance, int aim, int currentLocation) {
        return currentLocation + distance;
    }

    public static void main(String[] args) {
        int[] location = getSubmarineLocation(0, 0, getSubmarineFunctions());
        System.out.println(location[0] * location[1]);
    }

}
