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

// App2:

class Solution {
    public int[] sortedSquares(int[] nums) {
        int n = nums.length;
        int[] res = new int[n];
        int i = 0, j = n - 1;
        
        for (int k = n - 1; k >= 0; k--) {
            if (Math.abs(nums[i]) > Math.abs(nums[j])) {
                res[k] = nums[i] * nums[i];
                i++;
            } else {
                res[k] = nums[j] * nums[j];
                j--;
            }
        }
        return res;
    }
    }

