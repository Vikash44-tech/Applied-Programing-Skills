class Solution {
    public static boolean isPossible(int[] nums, int n, int limit){
        for(int i=0;i<nums.length;i++){
            int val = nums[i];
            int temp = val / limit;
            if(val % limit != 0){
                temp++;
            }
            n-=temp;

            if(n < 0){
                return false;
            }
        }
        return true;
    }
    public int minimizedMaximum(int n, int[] quantities) {
        int l = 1,r = (int)Math.pow(10,5);
        while(l <= r){
            int mid = l + (r - l) / 2;
            if(isPossible(quantities,n,mid)){
                r = mid - 1;
            }else{
                l = mid + 1;
            }
        }
        return l;
    }
}