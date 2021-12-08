package core.file_reading;

import org.junit.jupiter.api.*;

import java.io.File;
import java.util.Scanner;

public class FileScannerTests {
    @BeforeAll
    static void setupAll(TestInfo testInfo) {
        System.out.println(testInfo.getTestClass() + " executing");
    }

    @AfterAll
    static void tearDownAll(TestInfo testInfo) { System.out.println(testInfo.getTestClass() + " has completely finished testing."); }

    @Test
    @DisplayName("Can Open a File Test")
    public void fileOpenTest() {
        File testFile = FileScanner.getFile("src/main/resources/testFile.txt");
        Assumptions.assumeTrue(testFile != null);
        Assertions.assertTrue(testFile.getName().equals("testFile.txt"));
    }

    @Test
    @DisplayName("Can Scan a File Test")
    public void fileScanTest() {
        Scanner testScanner = FileScanner.getScannerForFile("src/main/resources/testFile.txt");
        Assumptions.assumeTrue(testScanner != null);
        //Can use a for loop as I know exactly how many lines there are.
        int[] result = new int[4];
        for (int i = 0; i < 4; i++) {
            result[i] = testScanner.nextInt();
        }
        Assertions.assertArrayEquals(new int[]{0, 2, 3, 1}, result);
    }
}
