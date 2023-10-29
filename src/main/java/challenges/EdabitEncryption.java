package challenges;
/*
https://edabit.com/challenge/jfCsugyp9BSLYEtwb
 */
public class EdabitEncryption {
    public static String encrypt(String message) {
        if(message == null) return null;

        int x = (int) Math.sqrt(message.length()); // This will truncate the double, therefore round down
        int y = (int) Math.round(Math.sqrt(message.length())); // This will round up and return a long. Just need to cast it.
        message = message.replaceAll("[ ]", "");
        StringBuilder result = new StringBuilder();
        String[] messageSplit = message.split("(?!^)");
        for (int i = 0; i < x; i++) {
            for (int j = i; j < message.length(); j+=y) {
                result.append(messageSplit[j]);
            }
            result.append(" ");
        }

        return result.toString();
    }

    public static void main(String[] args) {
        System.out.println(encrypt("if man was meant to stay on the ground god would have given us roots"));
    }
}
