package data_structure.hard._002_crush;

import java.util.List;

class Result {

    public static long arrayManipulation(int n, List<List<Integer>> queries) {
        int[] array = new int[n];
        int bigger = 0;
        for (int j = 0; j < array.length; j++) {
            for (int i = 0; i < queries.size(); i++) {
                int start = queries.get(i).get(0) - 1;
                int end = queries.get(i).get(1) - 1;
                int value = queries.get(i).get(2);

                if (j >= start && j <= end) {
                    array[j] += value;
                }
            }
            if (array[j] > bigger) {
                bigger = array[j];
            }
        }


        return bigger;
    }

}