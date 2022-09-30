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

// Appraoch 2 Optimised: Contant Space:

class Solution {
    public int[] shuffle(int[] nums, int n) {
        
        int len = nums.length;
		
		// to store the pair of numbers in right half of the original array
        for(int i = n; i < len; i++) {
            nums[i] = (nums[i] * 1024) + nums[i - n];
        }
        
        int index = 0;
		// to retrive values from the pair of numbers and placing those retrieved value at their desired position
        for(int i = n; i < len; i++, index += 2) {
            nums[index] = nums[i] % 1024;
            nums[index + 1] = nums[i] / 1024;
        }
        
        return nums;
    }
}
