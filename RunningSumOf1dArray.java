// 1480

class Solution {
    public int[] runningSum(int[] nums) {
    int[] ans = new int[nums.length];
    ans[0] = nums[0];
    for (int i = 1; i < nums.length; i++)
        ans[i] = ans[i-1] + nums[i];
    return ans;
    }
}

// Optimised Approach:

class Solution {
    public int[] runningSum(int[] nums) {
    int n = nums.length;
  
    for(int i=1;i<n;i++){
        nums[i] = nums[i]+nums[i-1];
    }
        return nums;
    }
}



// App 3:

class Solution {
    public int[] runningSum(int[] nums) {
    int n = nums.length;
        if(n<2){
            return nums;
        }
    for (int i = 1; i < n; i++)
        nums[i] = nums[i-1] + nums[i];
    return nums;
    }
}
