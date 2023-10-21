package challenges;

import core.file_reading.christmas.NightBeforeChristmas;

import javax.swing.*;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

public class CountWordType {
    //Filepath = "src/main/resources/christmas/nightbeforechristmas.txt"
    private static ArrayList<String>  nouns;
    private static ArrayList<String>  pronouns;
    private static ArrayList<String>  verbs;
    private static ArrayList<String>  adverbs;
    private static ArrayList<String>  adjectives;

    public static String[] getAllOfAWordTypeFromFile(ArrayList<String> wordType, String filepath) {
        ArrayList<String> result = new ArrayList<>(0);
        try {
            BufferedReader buffReader = new BufferedReader(new FileReader(filepath));

            for(String line = buffReader.readLine(); line != null; line = buffReader.readLine()) {
                String[] words = line.replaceAll("\\p{Punct}", "")
                        .replaceAll("“", "")
                        .replaceAll("”", "")
                        .toLowerCase()
                        .split(" ");
                for(String word: words) {
                    //If the word is of the specified wordtype then add that word
                    if(wordType.contains(word)) {
                        result.add(word);
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
            System.err.println("File not found.");
        }
        return result.toArray(new String[0]);
    }

    public static ArrayList<String>  getAllWordsFromFile(String filepath) {
        ArrayList<String> result = new ArrayList<>(0);
        try {
            BufferedReader buffReader = new BufferedReader(new FileReader(filepath));

            for(String line = buffReader.readLine(); line != null; line = buffReader.readLine()) {
                result.add(line.replaceAll("\\p{Punct}", ""));
            } // [^A-Za-z0-9]

        } catch (IOException e) {
            e.printStackTrace();
            System.err.println("File not found.");
        }
        return result;
    }

    public static void writeWordTypeCountToFile(String fileToCheck, String fileToWriteTo) {
        NightBeforeChristmas.writeToFile(fileToWriteTo,
                (       "Number of each: \n"
                        + "Nouns: " + getAllOfAWordTypeFromFile(nouns, fileToCheck).length + "\n"
                        + "Pronouns: " +   getAllOfAWordTypeFromFile(pronouns, fileToCheck).length + "\n"
                        + "Verbs: " +      getAllOfAWordTypeFromFile(verbs, fileToCheck).length + "\n"
                        + "Adverbs: " +    getAllOfAWordTypeFromFile(adverbs, fileToCheck).length + "\n"
                        + "Adjectives: " + getAllOfAWordTypeFromFile(adjectives, fileToCheck).length + "\n\n"
                        + "List of words: \n"
                        + "Nouns: " +        Arrays.toString(getAllOfAWordTypeFromFile(nouns, fileToCheck))+ "\n\n"
                        + "Pronouns: " +   Arrays.toString(getAllOfAWordTypeFromFile(pronouns, fileToCheck)) + "\n\n"
                        + "Verbs: " +      Arrays.toString(getAllOfAWordTypeFromFile(verbs, fileToCheck)) + "\n\n"
                        + "Adverbs: " +    Arrays.toString(getAllOfAWordTypeFromFile(adverbs, fileToCheck)) + "\n\n"
                        + "Adjectives: " + Arrays.toString(getAllOfAWordTypeFromFile(adjectives, fileToCheck))) //Double new lines for readability.
        );
    }

    public CountWordType(String fileToCheck, String fileToWriteTo) {
        //fileToCheck   = "src/main/resources/christmas/nightbeforechristmas.txt";
        //fileToWriteTo = "src/main/resources/wordtypecount.txt";
        nouns      = getAllWordsFromFile("src/main/resources/wordTypes/nouns.txt");
        pronouns   = getAllWordsFromFile("src/main/resources/wordTypes/pronouns.txt");
        verbs      = getAllWordsFromFile("src/main/resources/wordTypes/verbs.txt");
        adverbs    = getAllWordsFromFile("src/main/resources/wordTypes/adverbs.txt");
        adjectives = getAllWordsFromFile("src/main/resources/wordTypes/adjectives.txt");
        writeWordTypeCountToFile(fileToCheck, fileToWriteTo);
    }
}
