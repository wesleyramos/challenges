package data_structure.easy._001_arrayds;

import java.util.ArrayList;
import java.util.List;

public class Result {

    /*
     * Complete the 'reverseArray' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts INTEGER_ARRAY a as parameter.
     */

    public static List<Integer> reverseArray(List<Integer> a) {
        List<Integer> new_list = new ArrayList<>();

        for(int i = a.size() - 1; i >= 0; i--) {
            new_list.add(a.get(i));
        }


        return new_list;
    }

}
