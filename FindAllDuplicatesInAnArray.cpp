class Solution {
public:
    vector<int> findDuplicates(vector<int>& nums) {
        int n = nums.size();
        vector<int> result;
        for(int i=0;i<n;i++){
            int j = abs(nums[i])-1;
            if(nums[j]<0){
                result.push_back(j+1);
            }
            else{
                nums[j] = -nums[j];
            }
        }
        return result;
    }
};
