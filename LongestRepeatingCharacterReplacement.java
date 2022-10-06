class Solution {
    public int characterReplacement(String s, int k) {
        Map<Character,ArrayDeque<Integer>> map = new HashMap<>();
        int ans=0;
        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            if(!map.containsKey(c)) map.put(c,new ArrayDeque<Integer>());
            map.get(c).add(i);
            ArrayDeque<Integer> q = map.get(c);
            while(i-q.peekFirst()+1-q.size()>k){
                q.pollFirst();
            }
            int cur = Math.min(q.size()+k,s.length());
            ans=Math.max(cur,ans);
            map.put(c,q);
        }
        return ans;
    }
}
