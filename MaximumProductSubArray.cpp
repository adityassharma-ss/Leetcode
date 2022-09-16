class Solution {
public:
    int maxProduct(vector<int>& nums) {
        int n = nums.size();
        int product = 1;
        int result = INT_MIN;
        for(int i=0; i<n; i++){
            product = product * nums[i];
            result = max(product, result);
            if(product==0){
                product =1;
            }
        }
        product = 1;
        for(int i=n-1; i>=0; i--){
            product = product * nums[i];
            result = max(product, result);
            if(product==0){
                product =1;
            }
        }
        return result;
    }
};
