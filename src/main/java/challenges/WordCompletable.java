package challenges;
// Given the current letters, with only insertions of characters can we turn the current letters into the desired word?
public class WordCompletable {
    public static boolean completable(String currentLetters, String desiredWord) {
        if(currentLetters == null || desiredWord == null) return false;
        else if(currentLetters.equals(desiredWord)) return true;

        char[] currentCharacters = currentLetters.toCharArray();
        int index = 0;
        for(char character : desiredWord.toCharArray()) {
            if (index < currentLetters.length()) {
                if (character == currentCharacters[index]) {
                    index ++;
                }
            } else { return true; }
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(completable("but", "beautiful"));
        System.out.println(completable("cabbage", "oranges"));
        System.out.println(completable("test", "example"));
        System.out.println(completable("test", "tests"));
        System.out.println(completable("tests", "test"));
    }
}
