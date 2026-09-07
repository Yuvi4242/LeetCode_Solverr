class Solution {

    public int distinctSubseqII(String s) {

        long[] dp = new long[26];

        return (int) solve(s, 0, dp);
    }

    private long solve(String s, int index, long[] dp) {

        if (index == s.length()) {

            long ans = 0;

            for (long x : dp) {
                ans += x;
            }

            return ans % 1000000007;
        }

        int c = s.charAt(index) - 'a';

        long total = 1;

        for (long x : dp) {
            total += x;
        }

        dp[c] = total % 1000000007;

        return solve(s, index + 1, dp);
    }
}