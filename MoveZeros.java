class Solution {
    public void moveZeroes(int[] nums) {
        int k = 0;
        while (k < nums.length) {
          if (nums[k] == 0) {
    
            break;
          } else {
            k = k + 1;
          }
        }
        int i = k, j = k + 1;
    
        while (i < nums.length && j < nums.length) {
          if (nums[j] != 0) {
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
            i++;
    
          }
    
          j++;
    
        }
    }
}


// Approach 2:

class Solution {
    public void moveZeroes(int[] nums) {
int j = 0;
for(int i=0;i<nums.length;i++){
if(nums[i] != 0){
nums[j] = nums[i];
j++;
}
}
while(j < nums.length){
nums[j] = 0;
j++;
}
}
}
