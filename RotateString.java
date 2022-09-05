class Solution {
    public boolean rotateString(String s, String goal) {
        return (s.length() == goal.length() && (s+s).contains(goal));
    }
}

// s+s= 'abcdeabcde'
// goal = cdeab 
// s+s contains every single shifts for A
