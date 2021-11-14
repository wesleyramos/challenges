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
        assertEquals(1, Main.countSubString("a", "a"));
        assertEquals(1, Main.countSubString("abc", "a"));
        assertEquals(1, Main.countSubString("abc", "c"));
        assertEquals(1, Main.countSubString("abc", "ab"));
        assertEquals(1, Main.countSubString("abc", "bc"));
        assertEquals(2, Main.countSubString("aac", "a"));
        assertEquals(2, Main.countSubString("aaa", "aa"));
        assertEquals(1, Main.countSubString("caa", "aa"));
        assertEquals(2, Main.countSubString("ada", "a"));
        assertEquals(1, Main.countSubString("aaabcaa", "abc"));
        assertEquals(3, Main.countSubString("abbababcaa", "ab"));
    }

    @Test
    public void test_simple() {
//        assertEquals(19, Main.calc(Arrays.asList("b", "c", "aa", "d", "b"), Arrays.asList(2, 3, 4, 5, 6), "caaab"));
        assertEquals(34, Main.calc(Arrays.asList("b", "c", "aa", "a", "b"), Arrays.asList(2, 3, 4, 5, 6), "caaab"));
//        assertEquals(0, Main.calc(Arrays.asList("a", "b", "c", "aa", "d"), Arrays.asList(1, 2, 3, 4, 5), "xyz"));
//        assertEquals(11, Main.calc(Arrays.asList("c", "aa", "d"), Arrays.asList(3, 4, 5), "bcdybc"));
    }

}