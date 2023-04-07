public class PalindromicSubsequences {
    
        public static void main(String[] args) {
            String str = "abcbda";
            int count = countPalindromicSubsequences(str);
            System.out.println("Number of palindromic subsequences: " + count);
        }

        public static int countPalindromicSubsequences(String str) {
            int n = str.length();
            int[][] dp = new int[n][n];

            // Each single character is a palindromic subsequence
            for (int i = 0; i < n; i++) {
                dp[i][i] = 1;
            }

            // Count palindromic subsequences of length 2 and above
            for (int len = 2; len <= n; len++) {
                for (int i = 0; i < n - len + 1; i++) {
                    int j = i + len - 1;

                    if (str.charAt(i) == str.charAt(j)) {
                        dp[i][j] = dp[i + 1][j] + dp[i][j - 1] + 1;
                    } else {
                        dp[i][j] = dp[i + 1][j] + dp[i][j - 1] - dp[i + 1][j - 1];
                    }
                }
            }

            // Return the count of palindromic subsequences
            return dp[0][n - 1];
        }
}
