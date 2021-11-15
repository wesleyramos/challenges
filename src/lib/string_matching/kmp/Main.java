package lib.string_matching.kmp;

import java.io.IOException;


public class Main {
    public static void main(String[] args) throws IOException {
        String txt = "ABABDABACDABABCABAB";
        String pat = "ABABCABAB";
        KMP_String_Matching.KMPSearch(pat, txt);
    }

}
