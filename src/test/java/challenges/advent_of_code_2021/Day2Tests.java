package challenges.advent_of_code_2021;

import org.hamcrest.MatcherAssert;
import org.hamcrest.Matchers;
import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.ArrayList;
import java.util.Arrays;

public class Day2Tests {
    private static Day2 secondDayAOC;

    @BeforeAll
    static void setupAll(TestInfo testInfo) { System.out.println(testInfo.getTestClass() + " executing"); }

    @AfterAll
    static void tearDownAll(TestInfo testInfo) { System.out.println(testInfo.getTestClass() + " has completely finished testing."); }

    @BeforeEach
    void setupEach(TestInfo testinfo) { secondDayAOC = new Day2(0,0,0); }

    @Nested
    @DisplayName("Hamcrest AOC Day2 Aimless")
    class HamcrestDay2AimlessTests {
        @Test
        @DisplayName("Hamcrest: Check File is Read")
        public void checkFileIsRead() {
            MatcherAssert.assertThat(secondDayAOC.getSubmarineFunctions("src/main/resources/adventofcodeday2pathing.txt").toArray(new String[0]), Matchers.arrayWithSize(1000));
        }

        @ParameterizedTest
        @ValueSource(strings = {"forward 1,up 2,down 3"})
        @DisplayName("Hamcrest: Check Aim is not Set")
        public void checkFunctionsUsedAim(String function) {
            secondDayAOC.getSubmarineLocationAimless(new ArrayList<String>(Arrays.asList(function.split(","))));
            MatcherAssert.assertThat(secondDayAOC.getAim(), Matchers.is(0));
        }

        @ParameterizedTest
        @ValueSource(strings = {"forward 1,up 2,down 3"})
        @DisplayName("Hamcrest: Check Position is Set")
        public void checkFunctionsUsedPosition(String function) {
            secondDayAOC.getSubmarineLocationAimless(new ArrayList<String>(Arrays.asList(function.split(","))));
            MatcherAssert.assertThat(secondDayAOC.getPosition(), Matchers.is(1));
        }

        @ParameterizedTest
        @ValueSource(strings = {"forward 1,up 2,down 3"})
        @DisplayName("Hamcrest: Check Depth is Set")
        public void checkFunctionsUsedDepth(String function) {
            secondDayAOC.getSubmarineLocationAimless(new ArrayList<String>(Arrays.asList(function.split(","))));
            MatcherAssert.assertThat(secondDayAOC.getDepth(), Matchers.is(1));
        }
    }

    @Nested
    @DisplayName("AOC Day2 Aimed")
    class Day2AimedTests {
        @Test
        @DisplayName("Hamcrest: Check File is Read")
        public void checkFileIsRead() {
            MatcherAssert.assertThat(secondDayAOC.getSubmarineFunctions("src/main/resources/adventofcodeday2pathing.txt").toArray(new String[0]), Matchers.arrayWithSize(1000));
        }

        @ParameterizedTest
        @ValueSource(strings = {"forward 1,up 2,down 3"})
        @DisplayName("Hamcrest: Check Aim is Set")
        public void checkFunctionsUsedAim(String function) {
            secondDayAOC.getSubmarineLocationAim(new ArrayList<String>(Arrays.asList(function.split(","))));
            MatcherAssert.assertThat(secondDayAOC.getAim(), Matchers.is(1));
        }

        @ParameterizedTest
        @ValueSource(strings = {"forward 1,up 2,down 3"})
        @DisplayName("Hamcrest: Check Position is Set")
        public void checkFunctionsUsedPosition(String function) {
            secondDayAOC.getSubmarineLocationAim(new ArrayList<String>(Arrays.asList(function.split(","))));
            MatcherAssert.assertThat(secondDayAOC.getPosition(), Matchers.is(1));
        }

        @ParameterizedTest
        @ValueSource(strings = {"forward 1,up 2,down 3"})
        @DisplayName("Hamcrest: Check Depth is Set")
        public void checkFunctionsUsedDepth(String function) {
            secondDayAOC.getSubmarineLocationAim(new ArrayList<String>(Arrays.asList(function.split(","))));
            MatcherAssert.assertThat(secondDayAOC.getDepth(), Matchers.is(0));
        }
    }
}
