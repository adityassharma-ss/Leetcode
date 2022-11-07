class Solution {
	public int pathSum(TreeNode root, int targetSum) {
		if(root==null)
			return 0;
		return dfs(root,targetSum,0)+pathSum(root.left,targetSum)+pathSum(root.right,targetSum);
	}
	public int dfs(TreeNode root, int targetSum, long currentSum)
	{
		int count=0;
		if(root==null)
			return count;
        
		currentSum= currentSum+root.val;
		if(currentSum==targetSum)
			count++;
		
        count=count+dfs(root.left,targetSum,currentSum);
		count=count+dfs(root.right,targetSum,currentSum);
		
        currentSum=currentSum-root.val;
		return count;
	}
}
