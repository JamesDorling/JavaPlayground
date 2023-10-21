package core.properties;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class Config {
    private static final Properties config;

    //TAKE NOTE OF THIS (static block. Eagerly loads the configs.)
    static {
        //Make a new properties (Initialise it)
        config = new Properties();

        try {
            //Load in the properties
            config.load(new BufferedReader(new FileReader("src/main/java/core/properties/config.properties")));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    //Getters for the properties
    public static String appEnvironmentInUse(){ return config.getProperty("env"); }
    public static String fileLocation(){ return config.getProperty("file_location"); }
}
