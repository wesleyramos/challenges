package algorithms.strings.hard._0001_dna_health;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<String> genes = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .collect(toList());

        List<Integer> health = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        int s = Integer.parseInt(bufferedReader.readLine().trim());
//        System.out.printf("s: " + s);
        int bad = 0;
        int good = 0;
        for (int i = 0; i < s; i++) {

            String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

            int first = Integer.parseInt(firstMultipleInput[0]);

            int last = Integer.parseInt(firstMultipleInput[1]);

            String d = firstMultipleInput[2];


            int calc = calc(getGenes(genes, first, last), getHealth(health, first, last), d);
            bad = Math.min(calc, bad);
            good = Math.max(calc, good);
        }
//        IntStream.range(0, s).forEach(sItr -> {
//            try {
//                String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");
//
//                int first = Integer.parseInt(firstMultipleInput[0]);
//
//                int last = Integer.parseInt(firstMultipleInput[1]);
//
//                String d = firstMultipleInput[2];
//
//
//                int calc = Solution.calc(getGenes(genes, first, last), getHealth(health, first, last), d);
//                bad = Math.min(calc, bad);
//                good = Math.max(calc, good);
//            } catch (IOException ex) {
//                throw new RuntimeException(ex);
//            }
//
//
//        });
        System.out.println(bad + " " + good);

        bufferedReader.close();
    }

    public static List<String> getGenes(List<String> genes, int first, int last) {
        return genes.subList(first, last + 1);
    }

    public static List<Integer> getHealth(List<Integer> health, int first, int last) {
        return health.subList(first, last + 1);
    }

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
