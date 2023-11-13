import java.util.*;
public class Solution {
    public static int isCyclicRotation(String p, String q)  {
         int n = p.length();

        // Check if lengths are equal
        if (n != q.length()) {
            return 0;
        }

        // Concatenate the first string with itself
        String concatenated = p + p;

        // Check if the second string is a substring of the concatenated string
        for (int i = 0; i < n; i++) {
            if (concatenated.substring(i, i + n).equals(q)) {
                return 1;
            }
        }

        return 0;
    }
}
