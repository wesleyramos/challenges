package algorithms.medium.implementation._0002_magic_square;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static java.lang.Math.abs;

public class Solution {

    public static int formingMagicSquare(List<List<Integer>> s) {
        List<List<List<Integer>>> all = getAllMatrix();

        int min = count(s, all.get(0));

        for (int i = 1; i < all.size(); i++) {
            int count = count(s, all.get(i));
            min = Math.min(min, count);
        }

        return min;
    }

    private static int count(List<List<Integer>> s, List<List<Integer>> compare) {
        int sum = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                sum += abs(s.get(i).get(j) - compare.get(i).get(j));
            }
        }
        return sum;
    }

    private static List<List<List<Integer>>> getAllMatrix() {
        List<List<List<Integer>>> all = new ArrayList<>();
        all.add(Arrays.asList(Arrays.asList(8, 1, 6), Arrays.asList(3, 5, 7), Arrays.asList(4, 9, 2)));
        all.add(Arrays.asList(Arrays.asList(6, 7, 2), Arrays.asList(1, 5, 9), Arrays.asList(8, 3, 4)));
        all.add(Arrays.asList(Arrays.asList(2, 9, 4), Arrays.asList(7, 5, 3), Arrays.asList(6, 1, 8)));
        all.add(Arrays.asList(Arrays.asList(4, 3, 8), Arrays.asList(9, 5, 1), Arrays.asList(2, 7, 6)));

        all.add(Arrays.asList(Arrays.asList(6, 1, 8), Arrays.asList(7, 5, 3), Arrays.asList(2, 9, 4)));
        all.add(Arrays.asList(Arrays.asList(2, 7, 6), Arrays.asList(9, 5, 1), Arrays.asList(4, 3, 8)));
        all.add(Arrays.asList(Arrays.asList(4, 9, 2), Arrays.asList(3, 5, 7), Arrays.asList(8, 1, 6)));
        all.add(Arrays.asList(Arrays.asList(8, 3, 4), Arrays.asList(1, 5, 9), Arrays.asList(6, 7, 2)));

        return all;
    }

}
