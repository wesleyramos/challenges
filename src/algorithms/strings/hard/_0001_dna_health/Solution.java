package algorithms.strings.hard._0001_dna_health;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution {

    public static int calc(List<String> genes, List<Integer> health, String d) {
        Map<String, Integer> alreadyCount = new HashMap<>();
        int sum = 0;
        for (int i = 0; i < genes.size(); i++) {
            String gen = genes.get(i);
            Integer healthValue = health.get(i);
            Integer integer = alreadyCount.get(gen);
            if (integer == null) {
                int value = countSubString(d, gen);
                sum += value * healthValue;
                alreadyCount.put(gen, value);
//                System.out.println(gen + " aparece: " + value);

            } else {
                int value = integer;
                sum += value * healthValue;
//                System.out.println(gen + " ja existe" + value);
            }
//            System.out.println("Sum: " + sum);
        }

        return sum;
    }

    public static int countSubString(String d, String s) {
        int first = 0;
        int last = s.length();
        int count = 0;
//        do {
//            System.out.println(first);
//            System.out.println(last);
//
//            System.out.println("s: " + s + ", test: " + d.substring(first, last) + ".");
//            if (s.equals(d.substring(first, last))) {
//                count++;
//            }
//            first++;
//            last++;
//        } while (d.length() - 1 < last);

        while (d.length() >= last) {
//            System.out.println(first);
//            System.out.println(last);
//
//            System.out.println("s: " + s + ", test: " + d.substring(first, last) + ".");
            if (s.equals(d.substring(first, last))) {
                count++;
            }
            first++;
            last++;
        }

        return count;
    }


}
