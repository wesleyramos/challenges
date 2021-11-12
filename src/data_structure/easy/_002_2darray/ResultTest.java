package data_structure.easy._002_2darray;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class ResultTest {

    @Test
    public void test_1() {
        List<List<Integer>> lista = new ArrayList<>();

        List<Integer> a = Arrays.asList(-9, -9, -9, 1, 1, 1);
        List<Integer> b = Arrays.asList(0, -9, 0, 4, 3, 2);
        List<Integer> c = Arrays.asList(-9, -9, -9, 1, 2, 3);
        List<Integer> d = Arrays.asList(0, 0, 8, 6, 6, 0);
        List<Integer> e = Arrays.asList(0, 0, 0, -2, 0, 0);
        List<Integer> f = Arrays.asList(0, 0, 1, 2, 4, 0);
        lista.add(a);
        lista.add(b);
        lista.add(c);
        lista.add(d);
        lista.add(e);
        lista.add(f);

        assertEquals(Result.hourglassSum(lista), 28);
    }


}