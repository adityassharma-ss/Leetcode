class Solution {
    private int found = 0;
    private int getPos ( TreeNode root, int x, int y, int depth ) {
        if ( root == null ) return -1;
        if ( root.val == x || root.val == y ) {
            this.found++;
            return depth;
        }
        int f1 = this.getPos(root.left, x, y, depth + 1);
        int f2 = this.getPos(root.right, x, y, depth + 1);
        if (f1 == -1 || f2 == -1 ) return Math.max(f1, f2);
        if ( f1 == f2 && depth < f1 - 1 ) return depth;
        return -1;
    }
    public boolean isCousins(TreeNode root, int x, int y) {
        int pos = this.getPos(root, x, y, 0);
        return pos != -1 && this.found == 2;
    }
}
