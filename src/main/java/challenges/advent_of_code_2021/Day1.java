package challenges.advent_of_code_2021;

import core.file_reading.FileScanner;

import java.util.ArrayList;
import java.util.Scanner;

public class Day1 {
    //Filepath "src/main/resources/adventOfCodeDay1Measurements.txt"

    public static ArrayList<Integer> readMeasurements() {
        ArrayList<Integer> result = new ArrayList<>();
        int index = 0;

        //Open and scan the file
        Scanner fileReader = FileScanner.getScannerForFile("src/main/resources/adventOfCodeDay1Measurements.txt");
        //Go through each line and add it to an arraylist
        while (fileReader.hasNextLine()) {
            result.add(index, fileReader.nextInt());
            //System.out.println(result.get(index));
            index += 1;
        }
        return result;
    }

    public static int getNumberOfIncreases(ArrayList<Integer> measurements) {
        //Error trapping
        if(measurements == null) { return -1; }
        //Predefine result
        int result = 0;
        //Loop through the measurements to get the times it increases
        for(int i = 1; i < measurements.size(); i++)
        {
            if (measurements.get(i) > measurements.get(i-1))
            {
                //Add one to result every time it increases
                result += 1;
            }
        }
        //return the result
        return result;
    }
}
