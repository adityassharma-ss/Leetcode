// Approach 1: 

class Solution {
    public int[] shuffle(int[] nums, int n) {

        int[] result = new int[nums.length];
        int left = 0;
        int right = n;

        for (int i = 0; i < result.length; i += 2) {
            result[i] = nums[left];
            left++;
        }
        
        for (int i = 1; i <= result.length; i += 2) {
            result[i] = nums[right];
            right++;
        }
        
        return result;
    }
}
