/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public boolean findTarget(TreeNode root, int k) {
        Set<Integer> set = new HashSet<>();
        return find(root, k, set);
    }
    public boolean find(TreeNode root, int k, Set<Integer> set) {
        if (root == null) {
            return false;
        }
        if (set.contains(k - root.val)) {
            return true;
        }
        set.add(root.val);
        return find(root.left, k, set) || find(root.right, k, set);
    }
}

//Approach 2: Inorder traversal

class Solution {
	List<Integer> list = new ArrayList<>();
	public boolean findTarget(TreeNode root, int k) {
		helper(root);
		int s = 0, e=list.size()-1;

		while(e>s){
			if(list.get(s)+list.get(e)==k) return true;
			else if(list.get(s)+list.get(e)>k) e--;
			else s++;
		}
		return false;
	}

	void helper(TreeNode root){
		if(root==null) return;

		helper(root.left);
		list.add(root.val);
		helper(root.right);
	}
}
