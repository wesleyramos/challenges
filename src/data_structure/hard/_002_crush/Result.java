package data_structure.hard._002_crush;

import java.util.List;

class Result {

    public static long arrayManipulation(int n, List<List<Integer>> queries) {
        int[] array = new int[n+1];


        for (int i = 0; i < queries.size(); i++) {
            int start = queries.get(i).get(0) - 1;
            int end = queries.get(i).get(1);
            int value = queries.get(i).get(2);

            array[start] += value;
            array[end] -= value;

        }
        int bigger = 0;

        for(int i = 0; i < array.length - 1; i++) {
            int sum = array[i] + array[i+1];
            array[i+1] += array[i];
            if(sum > bigger) {
                bigger = sum;
            }
        }

        return bigger;
    }

}