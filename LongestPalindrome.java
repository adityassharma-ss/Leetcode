// TC: O(n)
class Solution {
    public int longestPalindrome(String s) {
        int count = 0;
        HashSet<Character> set = new HashSet<Character>();
        for (int i = 0; i < s.length(); i++) {
            char character = s.charAt(i);
            if (set.contains(character)) {
                count += 2;
                set.remove(character);
            }
            else {
                set.add(character);
            }
        }
        if (set.size() > 0) {
            count++;
        }
        return count;      
    }
}

// Approach 2: 
class Solution {
    public int longestPalindrome(String s) {
        int[] count = new int[128];
        for (char c: s.toCharArray())
            count[c]++;

        int ans = 0;
        for (int v: count) {
            ans += v / 2 * 2;
            if (ans % 2 == 0 && v % 2 == 1)
                ans++;
        }
        return ans;
    }
}

// Approach 3:

class Solution {
    public int longestPalindrome(String s) {
        HashMap<Character, Integer> map = new HashMap();
        for(int i=0; i<s.length(); i++){
            char temp = s.charAt(i);
            if(map.get(temp) != null) map.remove(temp);
            else map.put(temp, i);
        }
        if(map.size() <= 1) return s.length();
        return s.length() - map.size() + 1;
    }
}
