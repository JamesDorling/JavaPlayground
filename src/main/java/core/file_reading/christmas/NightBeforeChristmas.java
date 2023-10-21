package core.file_reading.christmas;

import core.file_reading.FileScanner;

import java.io.*;

public class NightBeforeChristmas {
    //Filepath "src/main/resources/christmas/nightbeforechristmas.txt"
    public static void readFile() {
        try {
            BufferedReader buffReader = new BufferedReader(new FileReader("src/main/resources/christmas/nightbeforechristmas.txt"));

            String line = buffReader.readLine();
            while (line != null) {
                System.out.println(line);
                line = buffReader.readLine();
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
            System.err.println("Couldnt read file!");
        } catch (IOException e) {
            e.printStackTrace();
            System.err.println("Couldnt read line in file!");
        }
    }

    public static void printAllLinesUsingForLoop(String fileLocation) {
        try {
            BufferedReader buffReader = new BufferedReader(new FileReader(fileLocation));

            for(String line = buffReader.readLine(); line != null; line = buffReader.readLine()) {
                System.out.println(line);
            }

        } catch (IOException e) {
            e.printStackTrace();
            System.err.println("File not found.");
        }
    }

    public static void writeToFile(String filepath, String message) {
        try {
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(filepath));
            bufferedWriter.write(message);
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
            System.err.println("Issue writing to file.");
        }
    }


}
