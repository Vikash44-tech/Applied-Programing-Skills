class Solution {
    // public static boolean isPossible(int[] nums, int target, int k){
    //     boolean found = true;
    //     for(int i=0;i<nums.length;i++){
    //         int val = nums[i];
    //         if(k == target){
    //             return true;
    //         }
    //         if(!found){
    //             k++;
    //         }
    //     }
    //     return false;
    // }

    public int searchInsert(int[] nums, int target) {
        int l = 0, r = nums.length -1;
        while(l <= r){
            int mid = l + (r - l) / 2;
            if(nums[mid] == target){
                return mid;
            }else if(nums[mid] > target){
                r = mid - 1;
            }else{
                l = mid + 1;
            }
        }
        return l;
    }
}