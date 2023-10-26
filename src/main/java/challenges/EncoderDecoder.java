package challenges;

import java.util.Arrays;

/*
An encoder and a decoder! The first letter of a message acts as a key, and we grab its first character's character
code. Then, all following characters are represented by the difference between the first character's code and its
own character code!
The decoder just does the opposite!
*/
public class EncoderDecoder {
    public static int[] encode(String message) {
        int[] result = new int[message.length()];
        char[] characters = message.toCharArray();
        result[0] = Character.codePointAt(characters, 0);
        for (int i = 1; i < message.length(); i++) {
            result[i] = Character.codePointAt(characters, i) - Character.codePointAt(characters, i-1);
        }
        return result;
    }

    public static String decode(int[] message) {
        StringBuilder result = new StringBuilder(convertIntToString(message[0]));
        for(int i = 1; i < message.length; i++) {
            result.append(convertIntToString(Character.codePointAt(result, i-1) + message[i]));
        }
        return result.toString();
    }

    private static String convertIntToString(int characterCode) {
        return String.valueOf(Character.toChars(characterCode));
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(encode("Hello")));
        System.out.println(decode(new int[]{72, 29, 7, 0, 3}));
        System.out.println(decode(encode("example! :;'#[]")));
    }
}
