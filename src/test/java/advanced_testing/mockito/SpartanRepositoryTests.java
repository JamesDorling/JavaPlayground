package advanced_testing.mockito;

import advanced_testing.Spartan;
import advanced_testing.SpartanRepository;
import org.junit.jupiter.api.*;
import org.mockito.ArgumentCaptor;
import org.mockito.InOrder;
import org.mockito.Mockito;

import java.time.LocalDate;

public class SpartanRepositoryTests {
    private Spartan mockSpartan;
    private Spartan realSpartan;

    @BeforeAll
    static void setupAll(TestInfo testInfo) {
        System.out.println(testInfo.getTestClass() + " executing");
    }

    @AfterAll
    static void tearDownAll(TestInfo testInfo) { System.out.println(testInfo.getTestClass() + " has completely finished testing."); }

    @BeforeEach
    void setup() {
        mockSpartan = Mockito.mock(Spartan.class);
        realSpartan = new Spartan(1, "James", "Java", LocalDate.now());
    }

    @Test
    @DisplayName("Mocking a Spartan")
    void mockingASpartan() {
        SpartanRepository.addSpartan(mockSpartan);
        Mockito.when(mockSpartan.toString()).thenReturn("Found Mock Spartan");
        Mockito.doThrow(NullPointerException.class).when(mockSpartan).setId(Mockito.anyInt());
        System.out.println(mockSpartan.toString());
        Assertions.assertEquals("Found Mock Spartan", mockSpartan.toString());
    }

    @Test
    @DisplayName("Chain method calls with mock")
    void chainMethodCallsWithMock() {
        Mockito.when(mockSpartan.getStartDate())
                .thenReturn(LocalDate.now())
                .thenReturn(LocalDate.MAX);
    }

    @Test
    @DisplayName("Using a Spy")
    void usingASpy() {
        Spartan spySpartan = Mockito.spy(realSpartan);
        //Used if you want to change/mock a small part of a real object.
    }

    @Test
    @DisplayName("Internal method call test")
    void internalmethodcalltest() {
        SpartanRepository.addSpartan(mockSpartan);
        Mockito.when(mockSpartan.getId()).thenReturn(1);
        SpartanRepository.findSpartan(1).isPresent();
        Mockito.verify(mockSpartan, Mockito.times(1)).getId();
    }

    @Test
    @DisplayName("Verify order of operations")
    void verifyOrderOfOperations() {
        mockSpartan.setName("Jordan");
        mockSpartan.setCourse("SDET");
        System.out.println(mockSpartan.getName() + " " + mockSpartan.getCourse());

        InOrder inOrder = Mockito.inOrder(mockSpartan);
        inOrder.verify(mockSpartan).setName("Jordan");
        inOrder.verify(mockSpartan).setCourse("SDET");
        inOrder.verify(mockSpartan).getName();
        inOrder.verify(mockSpartan).getCourse();
    }

    @Test
    @DisplayName("Argument Captor")
    void argumentCaptor() {
        ArgumentCaptor<String> captor = ArgumentCaptor.forClass(String.class);
        mockSpartan.setName("Jordan");
        Mockito.verify(mockSpartan).setName(captor.capture());
    }
}
