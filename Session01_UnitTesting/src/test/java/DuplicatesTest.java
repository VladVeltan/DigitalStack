import org.example.ContainsDuplicate;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import static junit.framework.TestCase.*;

public class DuplicatesTest {

    @Test
    public void testEmptyArray(){
        int [] emptyArray={};
        assertFalse(ContainsDuplicate.containsDuplicate(emptyArray));
    }
    @Test
    public void testOneElementArray(){
        int [] oneElementArray={1};
        assertFalse(ContainsDuplicate.containsDuplicate(oneElementArray));
    }
    @Test
    public void testOnlyOneDuplicate(){
        int [] oneDuplicatesArray={1,2,3,1,9};
        assertTrue(ContainsDuplicate.containsDuplicate(oneDuplicatesArray));
    }
    @Test
    public void testMultipleDuplicates(){
        int [] array={1,2,3,1,9,9,3};
        assertTrue(ContainsDuplicate.containsDuplicate(array));
    }

}
