class Solution {
public:
    int findSecondMinimumValue(TreeNode* root) {
        if(root == NULL) return -1;
        if(root->left == NULL && root->right == NULL) return -1;
    
       int left = root->left->val;
       int right = root->right->val;
        
       if(left == root->val) {
           left = findSecondMinimumValue(root->left);
       }
       
       if(right == root->val) {
           right = findSecondMinimumValue(root->right);
       }
        
       if(left != -1 && right != -1) {
           return min(left, right);
       } else if(left != -1) {
           return left;
       } else {
           return right;
       }
    }
};
