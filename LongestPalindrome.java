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

