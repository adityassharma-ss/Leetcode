class Solution {
  public List<List<Integer>> levelOrder(TreeNode root) {
    if (root == null)
      return new ArrayList<>();

    List<List<Integer>> ans = new ArrayList<>();
    Queue<TreeNode> q = new ArrayDeque<>(Arrays.asList(root));

    while (!q.isEmpty()) {
      List<Integer> currLevel = new ArrayList<>();
      for (int sz = q.size(); sz > 0; --sz) {
        TreeNode node = q.poll();
        currLevel.add(node.val);
        if (node.left != null)
          q.offer(node.left);
        if (node.right != null)
          q.offer(node.right);
      }
      ans.add(currLevel);
    }

    return ans;
  }
}

// Approach 2: Recursion

class Solution {
    List<List<Integer>> ans = new ArrayList<>();
    public List<List<Integer>> levelOrder(TreeNode root) {
        levelorder( root, 0 );
        return ans;
    }
       public void levelorder(TreeNode root, int level){
           if (root == null) return;
           if (ans.size() < level+1)
               ans.add(new ArrayList<>());
           ans.get(level).add(root.val);
           
           levelorder(root.left, level+1);
           levelorder(root.right, level+1);
       }
}
