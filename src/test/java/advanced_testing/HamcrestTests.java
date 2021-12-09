package advanced_testing;

import org.hamcrest.MatcherAssert;
import org.hamcrest.Matchers;
import org.junit.jupiter.api.*;

import java.time.LocalDate;

public class HamcrestTests {
    private Spartan spartan;

    @BeforeEach
    void setup() {
        spartan = new Spartan(1,"James", "Java", LocalDate.now());
    }

    @Nested
    @DisplayName("Hamcrest Spartan Tests")
    class HamcrestSpartanTests {
        @Test
        @DisplayName("Hamcrest: Spartan is called James")
        public void checkSpartanIsCalledJames() {
            MatcherAssert.assertThat(spartan.getName(), Matchers.equalTo("James"));
        }

        @Test
        @DisplayName("Hamcrest: Spartan has a field called name")
        void hamcrestSpartanHasAFieldCalledName() {
            MatcherAssert.assertThat(spartan, Matchers.hasProperty("name"));
        }

        @Test
        @DisplayName("Hamcrest: Spartan Has Correct Course Field Set To Java")
        void hamcrestSpartanHasAFieldCalledCourseAndItIsJava() {
            MatcherAssert.assertThat(spartan, Matchers.hasProperty("course", Matchers.equalTo("Java")));
        }

    }

    @Nested
    @DisplayName("Hamcrest String Methods")
    class HamcrestStringMethods {
        @Test
        @DisplayName("Hamcrest: check a string is null or empty")
        void hamcrestSpartanNameEmptyOrNull() {
            MatcherAssert.assertThat(spartan.getName(), Matchers.isEmptyOrNullString());
        }

        @Test
        @DisplayName("Hamcrest: check that 'James' ends with mes")
        void hamcrestSpartanNameEndsWithMes() {
            MatcherAssert.assertThat(spartan.getName(), Matchers.endsWith("mes"));
        }
    }
}
