class Solution {
    public int numTrees(int n) {
        int[] dp = new int[n + 1];
        dp[0] = 1;
        dp[1] = 1;
        for(int i = 2; i <= n; i++){
            for(int j = 1; j <= i; j++){
                dp[i] += dp[j - 1] * dp[i - j];
            }
        }
        return dp[n];
    }
}



class Solution {
    
    public int numTrees(int n) {
        return solution(n);
    }
    int solution(int n)
    {
        if(n <= 1)
            return 1;
        int res = 0;
        for(int i=0;i<=n-1;i++)
        {
            res += (solution(i) * solution(n-i-1));
        }
        return res;
    }
}
