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
        int bad = 0;
        int good = 0;
        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int first = Integer.parseInt(firstMultipleInput[0]);

        int last = Integer.parseInt(firstMultipleInput[1]);

        String d = firstMultipleInput[2];
        int firstValue = calc(getGenes(genes, first, last), getHealth(health, first, last), d);
        bad = firstValue;
        good = firstValue;
        for (int i = 1; i < s; i++) {

            firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

            first = Integer.parseInt(firstMultipleInput[0]);

            last = Integer.parseInt(firstMultipleInput[1]);

            d = firstMultipleInput[2];


            int value = calc(getGenes(genes, first, last), getHealth(health, first, last), d);

            bad = Math.min(value, bad);
            good = Math.max(value, good);
        }
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
                int value = countSubStringKMP(gen, d);
                sum += value * healthValue;
                alreadyCount.put(gen, value);
            } else {
                int value = integer;
                sum += value * healthValue;
            }

        }

        return sum;
    }

    public static int countSubStringKMP(String pat, String txt) {
        int M = pat.length();
        int N = txt.length();

        int lps[] = new int[M];
        int j = 0;

        computeLPSArray(pat, M, lps);

        int i = 0;
        int count = 0;
        while (i < N) {
            if (pat.charAt(j) == txt.charAt(i)) {
                i++;
                j++;
            }
            if (j == M) {
                j = lps[j - 1];
                count++;

            } else if (i < N && pat.charAt(j) != txt.charAt(i)) {
                if (j != 0) {
                    j = lps[j - 1];
                } else {
                    i++;
                }
            }
        }
        return count;
    }

    private static void computeLPSArray(String pat, int M, int[] lps) {
        int len = 0;
        int i = 1;
        lps[0] = 0;

        while (i < M) {
            if (pat.charAt(i) == pat.charAt(len)) {
                len++;
                lps[i] = len;
                i++;
            } else {
                if (len != 0) {
                    len = lps[len - 1];
                } else {
                    lps[i] = len;
                    i++;
                }
            }
        }
    }

    public static int countSubStringNaive(String d, String s) {
        int first = 0;
        int last = s.length();
        int count = 0;

        while (d.length() >= last) {
            if (s.equals(d.substring(first, last))) {
                count++;
            }
            first++;
            last++;
        }

        return count;
    }


}
