package data_structure.hard._002_crush;

import java.util.List;

class Result {

    public static long arrayManipulation(int n, List<List<Integer>> queries) {
        // Write your code here
        int[] array = new int[n];

        for (int i = 0; i < queries.size(); i++) {
            int start = queries.get(i).get(0);
            int end = queries.get(i).get(1);
            int value = queries.get(i).get(2);

            for (int j = start - 1; j < end; j++) {
                array[j] = array[j] + value;
            }
        }

        int bigger = array[0];
        for (int i = 0; i < array.length; i++) {
            if (bigger < array[i]) {
                bigger = array[i];
            }
        }

        return bigger;
    }

}