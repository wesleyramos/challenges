package algorithms.easy.warmup._0001_a_very_big_sum;

public class Solution {

    static long aVeryBigSum(long[] ar) {

        Long sum = 0L;

        for (int i = 0; i < ar.length; i++) {
            sum += ar[i];
        }

        return sum;
    }

}
