// App 1:

class Solution {
    public boolean isSubsequence(String s, String t) {
        int i = 0;
        int j = 0;
        while (i < s.length() && j < t.length()) {
            if (s.charAt(i) == t.charAt(j)) {
                i++;
            }
            j++;
        }
        return i == s.length();
    }
}

// App 2: Recursion


class Solution{
    public boolean isSubsequence(String s, String t) {
        return solve(s , 0 , t, 0);
    }
    private boolean solve(String s , int i , String t, int j){
        if(i == s.length()){
            return true;
        }
        if(i < s.length() && j == t.length()) return false;
        if(s.charAt(i) == t.charAt(j)){
            return solve(s , i+1, t , j+1);
        }else {
            return solve(s , i, t, j+1);
        }
        
    }
}
