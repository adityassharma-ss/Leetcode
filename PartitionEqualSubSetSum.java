class Solution{
        public boolean canPartition(int[] nums) {
        int n = nums.length;
        int sum = 0;
        for(int i = 0 ; i < n; i++) {
            sum += nums[i];
        }
        if(sum % 2 !=0 ) return false;
        
        int target = sum/2;
        boolean[] dp = new boolean[target + 1];
        dp[0] = true;
        
        for(int i = 0; i < n; i++) {
            int num = nums[i];
            
            for(int j = target; j >= num; --j) {
                dp[j] |= dp[j - num];
            }
        }
        return dp[target];
    }
}
