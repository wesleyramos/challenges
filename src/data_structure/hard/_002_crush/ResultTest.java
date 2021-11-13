package data_structure.hard._002_crush;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class ResultTest {

    @Test
    public void test_simple() {

        List<List<Integer>> list = new ArrayList<>();
        list.add(Arrays.asList(1, 5, 3));
//        list.add(Arrays.asList(4, 8, 7));
//        list.add(Arrays.asList(6, 9, 1));

        assertEquals(Result.arrayManipulation(6, list), 3);
    }

    @Test
    public void test_1() {

        List<List<Integer>> list = new ArrayList<>();
        list.add(Arrays.asList(1, 5, 3));
        list.add(Arrays.asList(4, 8, 7));
        list.add(Arrays.asList(6, 9, 1));

        assertEquals(Result.arrayManipulation(10, list), 10);
    }

}