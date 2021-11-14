package algorithms.medium.implementation._0002_magic_square;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class SolutionTest {

    @Test
    public void test_simple() {
        List<List<Integer>> list = new ArrayList<>();
        list.add(Arrays.asList(4, 9, 2));
        list.add(Arrays.asList(3, 5, 7));
        list.add(Arrays.asList(8, 1, 5));
        assertEquals(Solution.formingMagicSquare(list), 1);
    }

}