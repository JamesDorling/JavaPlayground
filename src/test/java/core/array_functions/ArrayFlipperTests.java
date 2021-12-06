package core.array_functions;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class ArrayFlipperTests {
    @Test
    public void arrayFlipTest()
    {
        assertArrayEquals(new Integer[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9}, ArrayFlipper.flipArray(new Integer[]{9, 8, 7, 6, 5, 4, 3, 2, 1, 0}));
    }
}
