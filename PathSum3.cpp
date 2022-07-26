/**
 * Definition for a binary tree node.
 * struct TreeNode {
 *     int val;
 *     TreeNode *left;
 *     TreeNode *right;
 *     TreeNode() : val(0), left(nullptr), right(nullptr) {}
 *     TreeNode(int x) : val(x), left(nullptr), right(nullptr) {}
 *     TreeNode(int x, TreeNode *left, TreeNode *right) : val(x), left(left), right(right) {}
 * };
 */
class Solution {
public:
    int pathSum(TreeNode* root, int targetSum) {
        if(root==NULL)
			return 0;
		return dfs(root,targetSum,0)+pathSum(root->left,targetSum)+pathSum(root->right,targetSum);
	}
public:
    int dfs(TreeNode* root, int targetSum, long currentSum)
	{
		int count=0;
		if(root==NULL)
			return count;
        
		currentSum= currentSum+root->val;
		if(currentSum==targetSum)
			count++;
		
        count=count+dfs(root->left,targetSum,currentSum);
		count=count+dfs(root->right,targetSum,currentSum);
		
        currentSum=currentSum-root->val;
		return count;
	}
    
};
