package data_structure.hard._002_crush;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;

public class ResultTest {

    @Test
    public void test_1() {
        assertEquals(Result.matchingStrings(Arrays.asList("ab", "ab", "abc"), Arrays.asList("ab", "abc", "bc")), Arrays.asList(2, 1, 0));
    }

}