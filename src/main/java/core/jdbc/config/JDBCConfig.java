package core.jdbc.config;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class JDBCConfig {
    private static final Properties config;

    //TAKE NOTE OF THIS (static block. Eagerly loads the configs.)
    static {
        //Make a new properties (Initialise it)
        config = new Properties();

        try {
            //Load in the properties
            config.load(new BufferedReader(new FileReader("src/main/java/core/jdbc/config/config.properties")));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    //Getters for the properties
    public static String dbDatabaseName(){ return config.getProperty("db_name"); }
    public static String dbDatabaseConnectionURL(){ return config.getProperty("db_connection"); }
    public static String dbUsername(){ return config.getProperty("username"); }
    public static String dbPassword(){ return config.getProperty("password"); }
}