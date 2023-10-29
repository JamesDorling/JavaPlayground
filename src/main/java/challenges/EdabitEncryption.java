package challenges;
/*
https://edabit.com/challenge/jfCsugyp9BSLYEtwb
 */
public class EdabitEncryption {
    public static String encrypt(String message) {
        if(message == null) return null;

        message = message.replaceAll("[ ]", "");
        int x = (int) Math.floor(Math.sqrt(message.length())); // This will truncate the double, therefore round down
        int y = (int) Math.ceil(Math.sqrt(message.length())); // This will round up and return a long. Just need to cast it.
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < y; i++) {
            for (int j = i; j < message.length(); j+=y) {
                // System.out.print(message.charAt(j));
                result.append(message.charAt(j));
            }
            // System.out.print("\n");
            result.append(" ");
        }

        return result.toString();
    }

    public static String decrypt(String message) {
        if(message == null) return null;

        String[] messageParts = message.split("[ ]");
        StringBuilder result = new StringBuilder();
        int loopTimes = (int)Math.ceil((double)message.replaceAll("[ ]", "").length() / messageParts.length); // Gotta be a better way to do this, looks nastyyyyy
        for(int i = 0; i < loopTimes; i++) {
            for(String part : messageParts) {
                try {
                    result.append(part.charAt(i));
                } catch (StringIndexOutOfBoundsException ignored) {}
            }
        }

        return result.toString();
    }

    public static void main(String[] args) {
        System.out.println(encrypt("if man was meant to stay on the ground god would have given us roots"));
        System.out.println(encrypt("haveaniceday"));
        System.out.println(encrypt("feedthedog"));
        System.out.println(encrypt("chillout"));
        System.out.println(encrypt("A Fool and His Money Are Soon Parted."));

        System.out.println(decrypt("imtgdvs fearwer mayoogo anouuio ntnnlvt wttddes aohghn sseoau"));
        System.out.println(decrypt("hae and via ecy"));
        System.out.println(decrypt("fto ehg ee dd"));
        System.out.println(decrypt("clu hlt io"));
        System.out.println(decrypt("Anoea FdnSr oHeot oiyoe lsAnd aMrP."));
    }
}
