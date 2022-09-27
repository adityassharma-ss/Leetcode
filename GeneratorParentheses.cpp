class Solution {
public:
    vector<string> generateParenthesis(int n) {
        vector<string> ans;
        string s;
        int open = n, close = n;
        solve(ans, s, open, close);
        return ans;
    }
    
    void solve(vector<string> &ans, string s, int open, int close){
        if(open == 0 && close == 0){
            ans.push_back(s);
            return;
        }
        if(open != 0){
            string op1 = s;
            op1.push_back('(');
            solve(ans, op1, open-1, close);
        }
        if(close > open){
            string op2 = s;
            op2.push_back(')');
            solve(ans, op2, open, close-1);
        }
}
};
