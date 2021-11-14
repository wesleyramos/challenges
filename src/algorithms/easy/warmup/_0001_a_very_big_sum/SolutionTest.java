package algorithms.easy.warmup._0001_a_very_big_sum;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolutionTest {

    @Test
    public void test_simple() {
        assertEquals(Solution.aVeryBigSum(new long[]{1000000001l}), 1000000001l);
    }

    @Test
    public void test_2() {
        assertEquals(Solution.aVeryBigSum(new long[]{1000000001l, 1000000002l, 1000000003l, 1000000004l, 1000000005l}), 5000000015l);
    }

}