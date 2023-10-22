package core.file_reading;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileScanner {
    public static File getFile(String filePath) {
        //Open a new file
        File fileToOpen = new File(filePath);
        return fileToOpen;
    }

    public static Scanner getScannerForFile(String filePath) {
        try {
            //Try and read the file
            Scanner fileReader = new Scanner(getFile(filePath));
            //Return the scanner
            return fileReader;
        } catch (FileNotFoundException e) {
            //Log the error and print the error message
            System.err.println("Didnt find the measurements file");
            e.printStackTrace();
            //Returning null as there is no scanner.
            return null;
        }
    }
}
