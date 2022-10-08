// Approach Using Map & Priority Queue:

class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        if(nums.length == k) return nums;
        
        Map<Integer,Integer> cmap = new HashMap<>();
        
        // it stores frequency of each element
        for(int i: nums)
            cmap.put(i, cmap.getOrDefault(i,0)+1);
        
        Queue<Integer> que = new PriorityQueue<>(k, (a,b) -> cmap.get(a)-cmap.get(b));

        for(int i: cmap.keySet()){
            que.add(i);
            if(que.size()>k)
                que.poll();
        }
        
        return que.stream().mapToInt(Integer::valueOf).toArray();
    }
}

// Approach 2:

class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        ArrayList<Integer> res = new ArrayList<>();
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for(int i = 0; i < nums.length; i++){
            if(map.containsKey(nums[i])){
                map.put(nums[i], map.get(nums[i]) + 1);
            }else{
                map.put(nums[i], 1);
            }
        }
        PriorityQueue<Map.Entry<Integer, Integer>> pq = new PriorityQueue<Map.Entry<Integer, Integer>>(new Comparator<Map.Entry<Integer, Integer>>(){
            public int compare(Map.Entry<Integer, Integer> a, Map.Entry<Integer, Integer> b){
                return b.getValue() - a.getValue();
            }
        });
        for(Map.Entry<Integer, Integer> entry : map.entrySet()){
            pq.add(entry);
        }
        for(int i = 0; i < k; i++){
            res.add(pq.poll().getKey());
        }
        return res.stream().mapToInt(i -> i).toArray();
        
    }
}
