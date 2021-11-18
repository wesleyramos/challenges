package sorting.easy.ch_004_big_sorting;

import java.util.Collections;
import java.util.List;

public class Solution {

    public static List<String> bigSorting(List<String> unsorted) {
        Collections.sort(unsorted, (x, y) ->
                x.length() == y.length()
                        ? x.compareTo(y)
                        : Integer.compare(x.length(), y.length()));
        return unsorted;
    }


}
