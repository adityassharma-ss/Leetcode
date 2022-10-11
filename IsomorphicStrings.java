// Approach 2: TC: O(n) || SC: O(N)

class Solution {
    public boolean isIsomorphic(String s, String t) {
     Map<Character, Integer> map1 = new HashMap<>();
     Map<Character, Integer> map2 = new HashMap<>();

     for(Integer i = 0; i <s.length(); i ++) {
         if(map1.put(s.charAt(i), i) != map2.put(t.charAt(i), i))
         return false;
     }
     return true;
    }
}

// Approach 2: TC: O(n) / SC: O(1)

class Solution {
    public boolean isIsomorphic(String s, String t) {
        HashMap<Character, Character> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            if (map.containsKey(s.charAt(i))) {
                if (t.charAt(i) != map.get(s.charAt(i)))
                    return false;
            } else {
                if (map.containsValue(t.charAt(i)))
                    return false;
                map.put(s.charAt(i), t.charAt(i));
            }
        }
        return true;
    }
}
