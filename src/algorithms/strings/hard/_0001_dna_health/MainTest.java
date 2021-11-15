package algorithms.strings.hard._0001_dna_health;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class MainTest {

    @Test
    public void testGet() {
        List<String> genes = Arrays.asList("a", "b", "c", "aa", "d", "b");
        List<Integer> health = Arrays.asList(1, 2, 3, 4, 5, 6);

        assertEquals(Main.getGenes(genes, 1, 5), Arrays.asList("b", "c", "aa", "d", "b"));
        assertEquals(Main.getHealth(health, 1, 5), Arrays.asList(2, 3, 4, 5, 6));
    }

    @Test
    public void testCount() {
        assertEquals(1, Main.countSubStringNaive("a", "a"));
        assertEquals(1, Main.countSubStringNaive("abc", "a"));
        assertEquals(1, Main.countSubStringNaive("abc", "c"));
        assertEquals(1, Main.countSubStringNaive("abc", "ab"));
        assertEquals(1, Main.countSubStringNaive("abc", "bc"));
        assertEquals(2, Main.countSubStringNaive("aac", "a"));
        assertEquals(2, Main.countSubStringNaive("aaa", "aa"));
        assertEquals(1, Main.countSubStringNaive("caa", "aa"));
        assertEquals(2, Main.countSubStringNaive("ada", "a"));
        assertEquals(1, Main.countSubStringNaive("aaabcaa", "abc"));
        assertEquals(3, Main.countSubStringNaive("abbababcaa", "ab"));

        assertEquals(1, Main.countSubStringKMP("a", "a"));
        assertEquals(1, Main.countSubStringKMP("a", "abc"));
        assertEquals(1, Main.countSubStringKMP("c", "abc"));
        assertEquals(1, Main.countSubStringKMP("ab", "abc"));
        assertEquals(1, Main.countSubStringKMP("bc", "abc"));
        assertEquals(2, Main.countSubStringKMP("a", "aac"));
        assertEquals(2, Main.countSubStringKMP("aa", "aaa"));
        assertEquals(1, Main.countSubStringKMP("aa", "caa"));
        assertEquals(2, Main.countSubStringKMP("a", "ada"));
        assertEquals(1, Main.countSubStringKMP("abc", "aaabcaa"));
        assertEquals(3, Main.countSubStringKMP("ab", "abbababcaa"));
    }

    @Test
    public void test_simple() {
//        assertEquals(19, Main.calc(Arrays.asList("b", "c", "aa", "d", "b"), Arrays.asList(2, 3, 4, 5, 6), "caaab"));
        assertEquals(34, Main.calc(Arrays.asList("b", "c", "aa", "a", "b"), Arrays.asList(2, 3, 4, 5, 6), "caaab"));
//        assertEquals(0, Main.calc(Arrays.asList("a", "b", "c", "aa", "d"), Arrays.asList(1, 2, 3, 4, 5), "xyz"));
//        assertEquals(11, Main.calc(Arrays.asList("c", "aa", "d"), Arrays.asList(3, 4, 5), "bcdybc"));
    }

}