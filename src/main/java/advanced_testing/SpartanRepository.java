package advanced_testing;
import java.util.ArrayList;
import java.util.Optional;

public class SpartanRepository {
    private static final ArrayList<Spartan> spartans = new ArrayList<>();

    public static void addSpartan(Spartan spartan) {
        spartans.add(spartan);
    }

    public static Optional<Spartan> findSpartan(int id) {
        Spartan returnedSpartan = null;
        for (Spartan spartan : spartans) {
            if (spartan.getId() == id) {
                returnedSpartan = spartan;
            }
        }
        return Optional.ofNullable(returnedSpartan);
    }

    public static String getAllSpartans() {
        StringBuilder SpartansInArray = new StringBuilder();
        for (Spartan spartan : spartans) {
            SpartansInArray.append(spartan.toString()).append("\n");
        }
        return SpartansInArray.toString();
    }

    public static boolean removeSpartan(int id) {
        return spartans.removeIf(spartan -> spartan.getId() == id);
    }
}