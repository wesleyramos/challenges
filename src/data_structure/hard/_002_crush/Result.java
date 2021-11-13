package data_structure.hard._002_crush;

import java.util.ArrayList;
import java.util.List;

class Result {

    /*
     * Complete the 'matchingStrings' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts following parameters:
     *  1. STRING_ARRAY strings
     *  2. STRING_ARRAY queries
     */

    public static List<Integer> matchingStrings(List<String> strings, List<String> queries) {
        List<Integer> result = new ArrayList<>();

        for (int j = 0; j < queries.size(); j++) {
            int count = 0;
            for (int i = 0; i < strings.size(); i++) {
                if (strings.get(i).equals(queries.get(j))) {
                    count++;
                }
            }
            result.add(count);
        }

        return result;
    }

}