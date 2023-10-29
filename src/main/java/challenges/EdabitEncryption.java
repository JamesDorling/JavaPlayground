package challenges;
/*
https://edabit.com/challenge/jfCsugyp9BSLYEtwb
 */
public class EdabitEncryption {
    public static String encrypt(String message) {
        if(message == null) return null;

        int x = (int) Math.sqrt(message.length()); // This will truncate the double, therefore round down
        int y = (int) Math.ceil(Math.sqrt(message.length())); // This will round up and return a long. Just need to cast it.
        System.out.println("x = " + x + "; y = " + y + ";");
        message = message.replaceAll("[ ]", "");
        StringBuilder result = new StringBuilder();
        String[] messageSplit = message.split("(?!^)");
        for (int i = 0; i < y; i++) {
            for (int j = i; j < message.length(); j+=x) {
                System.out.print(messageSplit[j]);
                result.append(messageSplit[j]);
            }
            System.out.print("\n");
            result.append(" ");
        }

        return result.toString();
    }

    public static void main(String[] args) {
        System.out.println(encrypt("if man was meant to stay on the ground god would have given us roots"));
        System.out.println(encrypt("haveaniceday"));
        System.out.println(encrypt("feedthedog"));
        System.out.println(encrypt("chillout"));
        System.out.println(encrypt("A Fool and His Money Are Soon Parted."));
    }
}
