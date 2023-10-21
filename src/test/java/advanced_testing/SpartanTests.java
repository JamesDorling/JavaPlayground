package advanced_testing;

import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

public class SpartanTests {
    private Spartan spartan;

    @Nested
    @DisplayName("Nested example")
    class firstTest {
        @ParameterizedTest()
        @ValueSource(ints = {1})
        @DisplayName("InsideNestedExample")
        void testeroo(int number) {
            Assertions.assertTrue(number < 10);
        }
    }

    @BeforeAll
    static void setupAll(TestInfo testInfo) {
        System.out.println(testInfo.getTestClass() + " executing");
    }

    @BeforeEach
    void setup(TestInfo testInfo) {
        spartan = new Spartan(1, "James", "Java SDET", LocalDate.of(2020, 12, 29));
        System.out.println(testInfo.getDisplayName() + " is being tested.");
    }

    @AfterEach
    void tearDown(TestInfo testInfo) {
        System.out.println(testInfo.getDisplayName() + " has finished testing.");
    }

    @AfterAll
    static void tearDownAll(TestInfo testInfo) {
        System.out.println(testInfo.getTestClass() + " has completely finished testing.");
    }

    @Test
    @DisplayName("Name test")
    public void nameTest() {
        Assumptions.assumeTrue(spartan.getName() != null);
        assertEquals("James", spartan.getName());
    }

    @Test
    @DisplayName("Start Date test")
    public void dateTest() {
        Assumptions.assumeTrue(spartan.getStartDate() != null);
        Assertions.assertTrue(LocalDate.now().isAfter(spartan.getStartDate()));
    }

    @Test
    @DisplayName("Course In Future test")
    public void courseTooLateTest() {
        Assumptions.assumeTrue(spartan.getCourse() != null);
        Assertions.assertTrue(LocalDate.now().isAfter(spartan.getStartDate()));
    }

    @Test
    @DisplayName("Course Before Company test")
    public void courseTooEarlyTest() {
        Assumptions.assumeTrue(spartan.getCourse() != null);
        Assertions.assertTrue(spartan.getStartDate().isAfter(LocalDate.of(2014, 1, 1)));
    }

    @Test
    @DisplayName("ID test")
    public void idTest() {
        spartan.setId(3);
        Assertions.assertEquals(3, spartan.getId());
    }

    @ParameterizedTest(name = "[{index}] Testing for value = {arguments}")
    @ValueSource(ints = {2, 0, 9, 5})
    @DisplayName("ParameterTestExample")
    void doTest(int number) {
        Assertions.assertTrue(number < 10);
    }

    @ParameterizedTest()
    //@CsvSource({"James", "Dorling"})
    @CsvFileSource(resources = "/names.csv")
    @DisplayName("Testing with CSV values Example")
    void testingCSV(String name) {
        Assertions.assertNotEquals("blank", name);
    }

    public static Stream<Arguments> printArrays() {
        return Stream.of(
                Arguments.arguments(1),
                Arguments.arguments(10)
        );
    }

    //@ParameterizedTest
    //@MethodSource("printArrays")
    //void printTest(ArrayList<Integer> array) {
    //    System.out.println(array);
    //}
    //AssertThrows uses a lambda to check for a specific exception.
    //AssertDoesNotThrow uses a lambda to check if ANY exception is thrown.
}
