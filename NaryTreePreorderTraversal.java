class Solution {
    public List<Integer> preorder(Node root) {
        List<Integer> list = new ArrayList<>();
        if (root == null) {
            return list;
        }
        list.add(root.val);
        for (Node child : root.children) {
            list.addAll(preorder(child));
        }
        return list;
    }
}

// Approach 2:

class Solution {
    public List<Integer> preorder(Node root) {
        List<Integer> list = new LinkedList<>();
        binary(root, list);
        
        return list;
    }
    
    void binary(Node node, List<Integer> list){
        if(node == null)
            return;
        list.add(node.val);
        for(int i = 0; i < node.children.size(); i++){
            binary(node.children.get(i), list);
        }
    }
}
