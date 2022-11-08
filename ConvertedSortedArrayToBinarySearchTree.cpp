class Solution {
 public:
  TreeNode* sortedArrayToBST(vector<int>& nums) {
    return helper(nums, 0, nums.size() - 1);
  }

 private:
  TreeNode* helper(const vector<int>& nums, int l, int r) {
    if (l > r)
      return nullptr;

    const int m = (l + r) / 2;
    return new TreeNode(nums[m], helper(nums, l, m - 1), helper(nums, m + 1, r));
  }
};
