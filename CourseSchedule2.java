class Solution {
   public int[] findOrder(int numCourses, int[][] pre) {
       int[] res=new int[numCourses];//array to keep track of incoming edges
       //create graph from given array
       ArrayList<ArrayList<Integer>> graph=graph_creator(numCourses,pre);
       Arrays.fill(res,0);
       for(int i=0;i<numCourses;i++){
           for(int j:graph.get(i)){
           res[j]++;//increase if incoming edge to this node found
           }
       }
       Queue<Integer> q=new LinkedList<>();
       for(int i=0;i<numCourses;i++){
           if(res[i]==0) q.add(i);//add all the root nodes to the queue as the starting points of traversal cause there is nothing which lie before them.
       }
       ArrayList<Integer> ans=new ArrayList<>();
       while(!q.isEmpty()){
           int node=q.poll();
           ans.add(node);//here is why traversal means addition to answer.
           for(int i:graph.get(node)){
               res[i]--;//decrease the incoming edge count it won't drop below 0.
               if(res[i]==0) q.add(i);//only add those whose parents have been added.
           }
       }
       if(ans.size()!=numCourses) return new int[0];//if we failed to add all node into answer there existed a cycle
       int[] output=new int[ans.size()];
       for(int i=0;i<ans.size();i++){
           output[i]=ans.get(i);
       }
       return output;
   }
   ArrayList<ArrayList<Integer>> graph_creator(int n,int[][]pre){
       ArrayList<ArrayList<Integer>> graph=new ArrayList<>(n);
       for(int i=0;i<n;i++) graph.add(new ArrayList<>());
       for(int[] temp:pre) graph.get(temp[1]).add(temp[0]);
       return graph;
   }
}
