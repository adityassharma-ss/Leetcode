class Solution {
public:
    int longestValidParentheses(string s) {
        int n = s.size();
		
		// dp[i] denotes the length of the longest valid parentheses ending with index i
        vector<int> dp(n + 1, 0);
        stack<int> st;
        for(int i = 0; i < n; i++){
            if(st.empty()) {
                if(s[i] == '(') st.push(i);
                continue;
            }
            if(s[i] == '(') st.push(i);
            else{
                int len = i - st.top() + 1;
                st.pop();
                dp[i + 1] = len + dp[i - len + 1];
            }
        }
        int ans = 0;
        for(int i = 1; i <= n; i++) ans = max(ans, dp[i]);
        return ans;
    }
};
