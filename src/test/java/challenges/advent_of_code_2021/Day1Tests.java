package challenges.advent_of_code_2021;

import org.junit.jupiter.api.*;
import org.junit.jupiter.api.condition.DisabledIfSystemProperties;

import java.util.ArrayList;

public class Day1Tests {
    static ArrayList<Integer> measurements;
    @BeforeAll
    static void setupAll(TestInfo testInfo) {
        System.out.println(testInfo.getTestClass() + " executing");
        measurements = Day1.readMeasurements();
    }

    @AfterAll
    static void tearDownAll(TestInfo testInfo) { System.out.println(testInfo.getTestClass() + " has completely finished testing."); }

    //@BeforeEach

    @Test
    @DisplayName("Read the measurements Test")
    public void readMeasurementsTest() {
        Assumptions.assumeTrue(measurements != null);
        Integer[] testMeasurements = new Integer[]{measurements.get(0), measurements.get(1)};
        Assertions.assertArrayEquals(new Integer[]{132, 146}, testMeasurements);
    }

    @Test
    @DisplayName("Number of Increases test.")
    public void increasesNumTest() {
        Assumptions.assumeTrue(measurements != null);
        Assertions.assertEquals(1288, Day1.getNumberOfIncreases(measurements));
    }
}
