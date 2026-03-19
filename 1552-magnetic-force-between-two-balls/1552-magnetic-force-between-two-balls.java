class Solution {
     public static boolean isPossible(int[] nums, int m, int k){
        Arrays.sort(nums);
        int prev = nums[0];
        for(int i=1;i<nums.length;i++){
            int val = nums[i];
            if(val - prev >= k){
                m -= 1;
                prev = val;
            }
            if(m <= 1){
                return false;
            }
        }
        return true;
    }
    public int maxDistance(int[] position, int m) {
        int l = 1, r = (int)Math.pow(10,9);
        while(l <= r){
            int mid = l + (r - l) / 2;
            if(isPossible(position, m, mid)){
                r = mid - 1;
            }else{
                l = mid + 1;
            }
        }
        return r;
    }
}