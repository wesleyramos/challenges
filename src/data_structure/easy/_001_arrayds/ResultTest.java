package data_structure.easy._001_arrayds;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class ResultTest {

    @Test
    public void test_1() {
        assertEquals(Result.reverseArray(Arrays.asList(1)), Arrays.asList(1));
    }

    @Test
    public void test_2() {
        assertEquals(Result.reverseArray(Arrays.asList(1, 2)), Arrays.asList(2, 1));
    }

}