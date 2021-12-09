package challenges.advent_of_code_2021;

import core.file_reading.FileScanner;

import java.util.ArrayList;
import java.util.Scanner;

public class Day2 {
    //Filepath: "src/main/resources/adventofcodeday2pathing.txt"
    private int position, depth, aim;
    public Day2(int startingPos, int startingDepth, int startingAim) {
        this.position = startingPos;
        this.depth = startingDepth;
        this.aim = startingAim;
    }
    
    // -- Getters for testing --
    public int getPosition() {
        return position;
    }

    public int getDepth() {
        return depth;
    }

    public int getAim() {
        return aim;
    }
    // -------------------------

    public ArrayList<String> getSubmarineFunctions(String filePath) {
        //Get the file's scanner
        Scanner functionReader = FileScanner.getScannerForFile(filePath);
        //Predefine result
        ArrayList<String> result = new ArrayList<>();
        //Iterate through the file
        while (functionReader.hasNextLine()) {
            result.add(functionReader.nextLine());
        }
        //Print the result
        return result;
    }

    public int[] getSubmarineLocationAimless(ArrayList<String> directions) {
        for(String direction : directions) {
            String[] functionSplit = direction.replaceAll("\\p{Punct}", "").split(" ");
            this.processFunctionAimless(functionSplit[0], Integer.parseInt(functionSplit[1]));
        }
        return new int[]{this.position, this.depth};
    }

    public int[] getSubmarineLocationAim(ArrayList<String> directions) {
        for(String direction : directions) {
            String[] functionSplit = direction.replaceAll("\\p{Punct}", "").split(" ");
            this.processFunctionAim(functionSplit[0], Integer.parseInt(functionSplit[1]));
        }
        return new int[]{this.position, this.depth};
    }

    private void processFunctionAimless(String function, int amount) {
        switch (function) {
            case "forward" -> this.position = moveForwardFunction(amount, this.position);
            case "back" -> this.position = moveBackwardFunction(amount, this.position);
            case "down" -> this.depth = moveDownFunction(amount, this.depth);
            case "up" -> this.depth = moveUpFunction(amount, this.depth);
            default -> System.err.println("Couldnt read function!");
        }
    }

    private void processFunctionAim(String function, int amount) {
        switch (function) {
            case "forward" -> {
                this.position = moveForwardFunction(amount, this.position);
                this.depth += this.aim * amount;
            }
            case "back" -> this.position = moveBackwardFunction(amount, this.position);
            case "down" -> this.aim = moveDownFunction(amount, this.aim);
            case "up" -> this.aim = moveUpFunction(amount, this.aim);
            default -> System.err.println("Couldnt read function!");
        }
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

    public static void main(String[] args) {
        Day2 secondday = new Day2(0, 0, 0);
        secondday.getSubmarineLocationAim(secondday.getSubmarineFunctions("src/main/resources/adventofcodeday2pathing.txt"));
        System.out.println(secondday.depth * secondday.position);
    }

}
