package challenges;

public class SevenBoom {
    public static String boomSeven(Integer[] numbers) {
        for(Integer number : numbers) {
            if(number.toString().contains("7")) {
                return "Boom!";
            }
        }
        return "there is no 7 in the array";
    }

    public static void main(String[] args) {
        System.out.println(boomSeven(new Integer[] {80, 91, 5, 57}));
    }
}


