class Solution {
    public int rob(int[] nums) {

        int n = nums.length;

        // Edge cases
        if (n == 1) {
            return nums[0];
        } else if (n == 2) {
            return Math.max(nums[0], nums[1]);
        }

        int sLast = nums[0];
        int last = Math.max(nums[0], nums[1]);

        for (int i = 2; i < n; i++) {
            int temp = Math.max(last, sLast + nums[i]);
            sLast = last;
            last = temp;
        }

        return last;
    }
}