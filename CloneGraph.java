/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> neighbors;
    public Node() {
        val = 0;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val) {
        val = _val;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val, ArrayList<Node> _neighbors) {
        val = _val;
        neighbors = _neighbors;
    }
}
*/

class Solution {
    public Node cloneGraph(Node node) {
        if(node == null) return null;
        Map<Node, Node> map = new HashMap<Node, Node>();
        Queue<Node> queue = new LinkedList<Node>();
        queue.offer(node);
        map.put(node, new Node(node.val));
        while(!queue.isEmpty()){
            Node cur = queue.poll();
            for(Node n : cur.neighbors){
                if(!map.containsKey(n)){
                    map.put(n, new Node(n.val));
                    queue.offer(n);
                }
                map.get(cur).neighbors.add(map.get(n));
            }
        }
        return map.get(node);
        
        
    }
}
