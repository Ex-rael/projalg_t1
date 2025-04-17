public class lcsBruteForce {

    // Recursive method to find LCS string
    public static String lcs(String s1, String s2, int i, int j) {
        // Base case: if either string is empty
        if (i == 0 || j == 0) {
            return "";
        }

        // If characters match, include this character and move diagonally
        if (s1.charAt(i - 1) == s2.charAt(j - 1)) {
            return lcs(s1, s2, i - 1, j - 1) + s1.charAt(i - 1);
        } else {
            // Else, take the longer LCS of the two options
            String lcs1 = lcs(s1, s2, i - 1, j);
            String lcs2 = lcs(s1, s2, i, j - 1);
            return (lcs1.length() > lcs2.length()) ? lcs1 : lcs2;
        }
    }

    public static void main(String[] args) {
        String str1 = "AGGTAB";
        String str2 = "GXTXAYB";

        String result = lcs(str1, str2, str1.length(), str2.length());

        System.out.println("LCS: " + result);
        System.out.println("Length of LCS: " + result.length());
    }
}
