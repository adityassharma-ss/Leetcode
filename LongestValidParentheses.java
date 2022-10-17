// Approach 1: Stack

class Solution {
    public int longestValidParentheses(String s) {
        Stack<Integer> stack = new Stack<>();
		int res = 0;

		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == '(') {
				stack.push(i);
			} else if (!stack.isEmpty() && s.charAt(stack.peek()) == '(') {  // inside valid substring, update res
				stack.pop();
				int validLen = stack.isEmpty() ? i + 1 : i - stack.peek();
				res = Math.max(res, validLen);
			} else {   // valid substring breaks
				stack.push(i);
			}
		}

		return res;
	}
}

// Approach 2: Dynamic Programming

public class Solution {
    public int longestValidParentheses(String s) {
        int[] dp = new int[s.length()];
        int result = 0;
        int leftCount = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                leftCount++;
            } else if (leftCount > 0){
                dp[i] = dp[i - 1] + 2;
                dp[i] += (i - dp[i]) >= 0 ? dp[i - dp[i]] : 0;
                result = Math.max(result, dp[i]);
                leftCount--;
            }
        }
        return result;
    }
}
