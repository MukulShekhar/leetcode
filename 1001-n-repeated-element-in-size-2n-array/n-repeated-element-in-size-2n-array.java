class Solution {
    public int repeatedNTimes(int[] nums) {
         int[] freq = new int[10001]; // since nums[i] ≤ 10^4

        for (int x : nums) {
            freq[x]++;
            if (freq[x] > 1) {   // the moment it repeats
                return x;
            }
        }

        return -1;
    }
}