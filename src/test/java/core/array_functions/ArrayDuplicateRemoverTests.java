package core.array_functions;

import org.junit.jupiter.api.Test;
import  static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class ArrayDuplicateRemoverTests {
    @Test
    public void duplicateTest()
    {
        assertArrayEquals(new Integer[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9}, ArrayDuplicateRemover.removeDuplicateElements(new Integer[]{0, 0, 1, 1, 2, 2, 3, 3, 4, 4, 5, 5, 6, 6, 7, 7, 8, 8, 9, 9}));
    }
}
