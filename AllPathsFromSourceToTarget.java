class Solution {
    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
    List<List<Integer>> res = new ArrayList<>();
    findPaths(res, new ArrayList<>(), graph, 0, graph.length - 1);
    return res;
}

void findPaths(List<List<Integer>> res, List<Integer> path, int[][] graph, int start, int end) {
    path.add(start);

    if(start == end) 
        res.add(new ArrayList<>(path));
    else 
        for(int n : graph[start])
            findPaths(res, path, graph, n, end);
    
    path.remove(path.size() - 1);
}
}
