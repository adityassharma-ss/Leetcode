class Solution {
    public int removeElement(int[] nums, int val) {
        // Initialize a variable c which will count the number of elements except val...
        int c = 0;
        // Loop through all the elements of the array from left to right...
        for(int i = 0; i < nums.length; i++) {
            // If the element is not val...
            if(nums[i] != val) {
                nums[c++] = nums[i];     // Add that element to the place of c..
            }        
        }
        return c;    // Return the number...
    }
}
