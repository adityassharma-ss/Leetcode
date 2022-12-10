// Approach 1: Recursion

class Solution {
    public void flatten(TreeNode root) {
        if (root == null) return;

        // Flatten the left subtree
        flatten(root.left);

        // Flatten the right subtree
        flatten(root.right);

        // Save the right subtree as a temporary variable
        TreeNode right = root.right;

        // Append the left subtree to the end of the flattened right subtree
        root.right = root.left;
        root.left = null;

        // Find the end of the flattened right subtree
        TreeNode cur = root;
        while (cur.right != null) cur = cur.right;

        // Append the temporary right subtree to the end of the flattened right subtree
        cur.right = right;
    }
}

// Approach 2: Stack

class Solution {
    public void flatten(TreeNode root) {
        if(root == null) return;
        Stack<TreeNode> stack = new Stack<TreeNode>();
        stack.push(root);
        while(!stack.isEmpty()){
            TreeNode node = stack.pop();
            if(node.right != null) stack.push(node.right);
            if(node.left != null) stack.push(node.left);
            if(!stack.isEmpty()) node.right = stack.peek();
            node.left = null;
        }
    }
}
