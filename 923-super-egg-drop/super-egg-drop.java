class Solution {
    Integer[][] dp;

    public int superEggDrop(int k, int n) {
        dp = new Integer[k + 1][n + 1];
        return helper(k, n);
    }

    private int helper(int k, int n) {
        if (n == 0 || k == 0) return 0;
        if (k == 1) return n;
        if (n == 1) return 1;

        if (dp[k][n] != null) return dp[k][n];

        int low = 1, high = n, min = n;

        while (low <= high) {
            int mid = (low + high) / 2;

            int eggBreaks = helper(k - 1, mid - 1);  
            int eggSurvives = helper(k, n - mid);   

            int worst = 1 + Math.max(eggBreaks, eggSurvives);
            min = Math.min(min, worst);

            if (eggBreaks > eggSurvives) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        dp[k][n] = min;
        return min;
    }
}
