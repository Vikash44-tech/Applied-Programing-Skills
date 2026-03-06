class Solution {
    public static int leftMost(int[] nums, int t){
        int l = 0, r = nums.length - 1;
        while(l <= r){
            int m = l + (r - l) / 2;
            if(nums[m] >= t){
                r = m - 1;
            }else{
                l = m + 1;
            }
        }
        return l;
    }
    public int maximumCount(int[] nums) {
        int neg = leftMost(nums, 0);
        int one = leftMost(nums, 1);
        int pos = nums.length - one;
        return Math.max(neg, pos);
    }
}