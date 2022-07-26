class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        if(nums == null || nums.length < 3) return result;
        Arrays.sort(nums);
        for(int i = 0; i < nums.length - 2; i++){
            if(i == 0 || nums[i] > nums[i - 1]){
                int j = i + 1;
                int k = nums.length - 1;
                while(j < k){
                    if(nums[i] + nums[j] + nums[k] == 0){
                        List<Integer> temp = new ArrayList<Integer>();
                        temp.add(nums[i]);
                        temp.add(nums[j]);
                        temp.add(nums[k]);
                        result.add(temp);
                        j++;
                        k--;
                        while(j < k && nums[j] == nums[j - 1]) j++;
                        while(j < k && nums[k] == nums[k + 1]) k--;
                    }else if(nums[i] + nums[j] + nums[k] < 0){
                        j++;
                    }else{
                        k--;
                    }
                }
            }
        }
        return result;
}
}


// Approach 2: HashSet & ThreePointer

class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
      Set<List<Integer>> set = new HashSet<>();
       if(nums.length < 3) return new ArrayList<>(set);
       Arrays.sort(nums);
       for(int i = 0; i <nums.length - 2; i ++) {
           int j = i + 1;
           int k = nums.length - 1;

           while(j < k) {
               int sum = nums[i] + nums[j] + nums[k];
               if(sum == 0) 
                set.add(Arrays.asList(nums[i] , nums[j ++], nums[k --]));
               else if(sum > 0) k --;
               else j ++; 
           }
       }
       return new ArrayList<>(set); 
    }
}





