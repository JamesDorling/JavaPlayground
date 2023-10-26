package challenges;
/*
https://edabit.com/challenge/jfCsugyp9BSLYEtwb
 */
public class EdabitEncryption {
    public String encrypt(String message) {
        int x = (int) Math.sqrt(message.length()); // This will truncate the double, therefore round down
        int y = (int) Math.round(Math.sqrt(message.length())); // This will return a long. Just need to cast it.
        char[][] characterMatrix = new char[x][y];

        return "AAAA";
    }

    public static void main(String[] args) {

    }
}
