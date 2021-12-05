package challenges.week_1;

import org.junit.jupiter.api.Test;

import  static org.junit.jupiter.api.Assertions.assertTrue;
import  static org.junit.jupiter.api.Assertions.assertFalse;

public class Challenge5Tests {
    Challenge5 fifthChall = new Challenge5();

    /*
    A couple functions in Challenge5 didnt fit the challenge. They are still there, but I see no reason to test them
    as they are incorrect.
    */

    // Single Name Tests
    //////////////////////////////////////////////////////////////////////////////////////////////////
    @Test
    public void singleNameTests()
    {
        // This should flip the name properly
        assertTrue(fifthChall.reverseSingleNameSplitless("James Dorling").equals("Dorling James"));
        // This is to check to see if it works but again, I suppose
        assertFalse(fifthChall.reverseSingleNameSplitless("James Dorling").equals("James Dorling"));
        // This should be true as the first name becomes "James Robert" as the function only tracks one space, and its the last one.
        assertTrue(fifthChall.reverseSingleNameSplitless("James Robert Dorling").equals("Dorling James Robert"));
        // This should be false because it should not flip just the first and last name, and therefore make the whole name go backwards.
        assertFalse(fifthChall.reverseSingleNameSplitless("James Robert Dorling").equals("Dorling Robert James"));
        // This should only move the final space to the back, as the function only tracks the final spacebar.
        assertTrue(fifthChall.reverseSingleNameSplitless("James Robert Dorling ").equals(" James Robert Dorling"));
    }

    // List Name Tests
    //////////////////////////////////////////////////////////////////////////////////////////////////
    @Test
    public void nameListTests()
    {
        //This function just calls the "reverseSingleNameSplitless" function on substrings created from a long string of names.

        // This should flip the names properly
        assertTrue(fifthChall.reverseNameListSplitless("James Dorling, Jordan Dorling, Alex Mace").equals("Dorling James, Dorling Jordan, Mace Alex"));
        //ISSUE ONE this provides square brackets as it converts an arraylist to a string at the end
        //ISSUE TWO this cuts out the final name because it does not have a comma at the end
    }

    @Test
    public void nameListSyntaxTests()
    {
        //syntax tests, no reason not to pass but why not test it
        assertTrue(fifthChall.reverseNameListSplitless("# 0, & =").equals("0 #, = &"));
        //This should fail, as it will split the a and the d because of the comma.
        assertFalse(fifthChall.reverseNameListSplitless("a,d ros").equals("ros a,d"));
    }
}
