// Approach 1: HashSet

class Solution {
    class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> hs = new HashSet<>();
        int j = 0,len = 0,n = s.length();
        
        for(int i = 0;i<n;i++){
            while(j<n && hs.add(s.charAt(j))){
                j++;
            }
            len = Math.max(len,j-i);
            hs.remove(s.charAt(i));
        }
        return len;
    }
}

    // Approach 2:
    
    public static int lengthOfLongestSubstring(String s) {
        int n = s.length();
        int ans = 0;
        Map<Character, Integer> map = new HashMap<>();
        for(int j = 0, i = 0; j < n; j++) {
            if(map.containsKey(s.charAt(j))) {
                i = Math.max(map.get(s.charAt(j)), i);
            }
            ans = Math.max(ans, j - i + 1);
            map.put(s.charAt(j), j + 1);
        }
        return ans;
    }
