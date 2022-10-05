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
