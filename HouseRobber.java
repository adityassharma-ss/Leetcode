class Solution {
    public int rob(int[] nums) {
        int prev = 0;
        int curr = 0;
        
        for(int num:nums){
            int temp = curr;
            curr = Math.max(prev+num,curr);
            prev = temp;
        }
        return curr;
    }
}

// App 2:

class Solution {
    public int rob(int[] nums) {
        int n = nums.length;
        if(n == 1)
            return nums[0];
        if(n == 2)
            return Math.max(nums[0] ,nums[1]);
        if(n == 3)
            return Math.max(nums[0]+nums[2] , nums[1]);
        int[] dp = new int[n];
        dp[0] = nums[0];
        dp[1] = nums[1];
        dp[2]= nums[2]+dp[0];
        for(int i=3;i<nums.length;i++)
        {
            dp[i] = nums[i] + Math.max(dp[i-2],dp[i-3]);
            
        }
        return Math.max(dp[dp.length-1] , dp[dp.length-2]);
    }
}
