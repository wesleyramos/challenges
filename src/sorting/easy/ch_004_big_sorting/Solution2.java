package sorting.easy.ch_004_big_sorting;

import java.util.ArrayList;
import java.util.List;

public class Solution2 {

    public static List<String> bigSorting(List<String> unsorted) {
        List<String> orderedList = new ArrayList<>();
        orderedList.add(unsorted.get(0));
        for (int i = 1; i < unsorted.size(); i++) {
            String newValue = unsorted.get(i);
            findAPlace(newValue, orderedList);
        }


        return orderedList;
    }

    public static List<String> findAPlace(String newValue, List<String> orderedList) {
        int j = 0;
        for (; j < orderedList.size(); j++) {
            String toTest = orderedList.get(j);
            if (isSmallestOrEqual(newValue, toTest)) {
                orderedList.add(j, newValue);
                break;
            }
        }
        if (j == orderedList.size()) {
            orderedList.add(newValue);
        }

        return orderedList;
    }

    public static boolean isSmallestOrEqual(String s, String s1) {

        if (s.length() < s1.length()) {
            return true;
        } else if (s.length() > s1.length()) {
            return false;
        } else {
            int i = 0;
            for (; i < s.length(); i++) {
                if (s.charAt(i) < s1.charAt(i)) {
                    return true;
                } else if (s.charAt(i) > s1.charAt(i)) {
                    return false;
                }
            }
            if (i == s.length()) {
                return true;
            }

            return false;
        }


    }


}
