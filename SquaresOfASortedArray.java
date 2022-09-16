class Solution {
    public int[] sortedSquares(int[] nums) {
        if(nums == null || nums.length == 0) return nums;
        int n = nums.length;
        int[] res = new int[n];
        
        int l = 0, r = n - 1;
        while(l<=r){
            if(nums[r]*nums[r] >= nums[l]*nums[l]){
                res[--n] = nums[r]*nums[r];
                r--;
            } else {                
                res[--n] = nums[l]*nums[l];
                l++;
            }
        }
        
        return res;
    }
}
