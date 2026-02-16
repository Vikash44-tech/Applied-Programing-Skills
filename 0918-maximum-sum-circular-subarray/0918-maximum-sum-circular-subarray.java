class Solution {
    public int maxSubarraySumCircular(int[] nums) {
        int total = nums[0];
        int currMax = nums[0], maxSum = nums[0];
        int currMin = nums[0], minSum = nums[0];
        
        for(int i=1;i<nums.length;i++){
            currMax = Math.max(nums[i], currMax + nums[i]);
            maxSum = Math.max(currMax, maxSum);
            
            currMin = Math.min(nums[i], currMin + nums[i]);
            minSum = Math.min(currMin, minSum);
            
            total += nums[i];
        }
        if(maxSum < 0) return maxSum;
        return Math.max(maxSum, total - minSum);
    }
}