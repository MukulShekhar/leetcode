class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
        long maxSum = 0, currentSum = 0;
        Set<Integer> uniqueElements = new HashSet<>();
        int left = 0;
        for (int right = 0; right < nums.length; right++) {
            while (uniqueElements.contains(nums[right])) {
                uniqueElements.remove(nums[left]);
                currentSum -= nums[left];
                left++;
            }
            uniqueElements.add(nums[right]);
            currentSum += nums[right];
            if (right - left + 1 == k) {
                maxSum = Math.max(maxSum, currentSum);
                uniqueElements.remove(nums[left]);
                currentSum -= nums[left];
                left++;
            }
        }
        return maxSum;
    }
}