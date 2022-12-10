class Solution {
    public Node connect(Node root) {
        // base case: if the root node is null, then there is nothing to do
        if (root == null) {
            return null;
        }

        // if the root node has a left child, then set its next pointer to the root's right child
        if (root.left != null) {
            root.left.next = root.right;
        }

        // if the root node has a right child and a next pointer,
        // then set the right child's next pointer to the next node's left child
        if (root.right != null && root.next != null) {
            root.right.next = root.next.left;
        }

        // recursively connect the left and right subtrees of the root node
        connect(root.left);
        connect(root.right);

        // return the root node
        return root;
    }
}
