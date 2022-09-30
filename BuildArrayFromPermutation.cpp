// Approach 1: Simply Storing Values

class Solution {
public:
    vector<int> buildArray(vector<int>& nums) {
        int n = nums.size();
        vector<int> ans(n);
        
        for(int i=0;i<n;i++){
            ans[i] = nums[nums[i]];
        }
        return ans;
    }
};

// Appraoch 2: Constant Space[Optimised] 

class Solution {
public:
    vector<int> buildArray(vector<int>& nums) {
        int n = nums.size();
        vector<int> ans(n);
        
        for(int i=0;i<n;i++){
            ans[i]+= n*(nums[nums[i]]%n);
        }
        for(int i=0;i<n;i++){
            ans[i] = ans[i]/n;
        }
        return ans;
    }
};
