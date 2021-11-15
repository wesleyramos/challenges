package lib.string_matching.kmp;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class KMP_String_MatchingTest {

    @Test
    public void KMPSearch() {
        assertEquals(KMP_String_Matching.KMPSearch("AABC", "DDDDAABC"), 4);
        assertEquals(KMP_String_Matching.KMPSearch("A", "DDDD"), -1);
    }
}