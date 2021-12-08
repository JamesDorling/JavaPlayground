package advanced_junit;

import org.junit.jupiter.api.*;
import  static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.time.LocalDate;

public class SpartanTests {
    private Spartan spartan;

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
}
