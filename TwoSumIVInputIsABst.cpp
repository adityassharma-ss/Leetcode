class Solution {
public:
    unordered_set<int>s;
    bool solve(TreeNode* root,int& k)
    {
        if(!root)return false;
        int ans=k-root->val;
        if(s.find(ans)!=s.end())
        {
            return true;
        }
        s.insert(root->val);
        return solve(root->left,k) || solve(root->right,k);
    }
    
    bool findTarget(TreeNode* root, int k) {
       
        return solve(root,k);
        
    }
};
