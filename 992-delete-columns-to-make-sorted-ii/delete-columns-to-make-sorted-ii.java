class Solution {
    public int minDeletionSize(String[] strs) {
        int n = strs.length;
        int m = strs[0].length();

        boolean[] good = new boolean[n - 1]; // tracks if strs[i] < strs[i+1] is already decided
        int deletions = 0;

        for (int col = 0; col < m; col++) {
            boolean mustDelete = false;

            // Step 1: Check if this column forces a deletion
            for (int i = 0; i < n - 1; i++) {
                if (!good[i] && strs[i].charAt(col) > strs[i + 1].charAt(col)) {
                    mustDelete = true;
                    break;
                }
            }

            if (mustDelete) {
                deletions++; // delete this column
                continue;
            }

            // Step 2: Update good[] information based on this column
            for (int i = 0; i < n - 1; i++) {
                if (!good[i] && strs[i].charAt(col) < strs[i + 1].charAt(col)) {
                    good[i] = true; // this column resolves ordering for this pair
                }
            }
        }

        return deletions;
    }
}
