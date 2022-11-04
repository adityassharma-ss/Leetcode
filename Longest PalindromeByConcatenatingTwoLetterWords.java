
// Approach 1: Greedy Algo
// TC - O(n) || SC - O(1)

class Solution {
    public int longestPalindrome(String[] words) {
        // As there are only 2 lowercase English letters in each word, we can represent the word using a
        // 2D array, with the row representing the first letter, and column representing the second letter.
        int[][] counting = new int[26][26];
        int max = 0;
        for (String word : words) {
            // Convert the char to its relative integer by subtracting with 'a' (e.g. 'a' == 0, 'b' == 1, etc).
            int a = word.charAt(0) - 'a';
            int b = word.charAt(1) - 'a';
            // We can flip the letters by using counting[b][a], while counting[a][b] represents the original lettering.
            // If we found the pair corresponding to the flipped word, then we can increase the max by 4 and update
            // the frequency of the flipped word.
            // For Example: If "ab" is previously stored in counting[0][1], when the word "ba" came up later,
            //              the flipped word of "ba" which is "ab" in counting[0][1] is found.
            // This is also why it is a greedy algorithm, as we count pair in the final result as soon as it is found,
            // since the position of the pair in a palindrome is not important, as long as they are placed opposite of
            // each other.
            if (counting[b][a] > 0) {
                max += 4;
                counting[b][a]--;
            }
            // If no pair is found, store the occurrence of the word.
            else {
                counting[a][b]++;
            }
        }
        // For the odd word in the center of the palindrome (e.g. "aa", "bb", "cc", etc.),
        // Check for all 26 possible pairs, if any is found, increase the max by 2.
        // For Example: words = ["ab","ba","zz","yy"]
        //              With "ab" and "ba" form a pair, with max = 4,
        //              either "zz" or "yy" can fit in the center to expand the palindrome, forming "abzzba" or "abyyba".
        // Do note that the valid pairs formed previously is already counted, since a == b, counting[a][b] == counting[b][a].
        for (int i = 0; i < 26; i++) {
            if (counting[i][i] > 0) {
                max += 2;
                break;
            }
        }
        return max;
    }
}

