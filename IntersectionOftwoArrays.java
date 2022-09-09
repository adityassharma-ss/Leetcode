// Approach 1: using Sets

class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set1 = new HashSet();
        for(int num : nums1){
            set1.add(num);
        }
        
        Set<Integer> set2 = new HashSet();
        for(int num : nums2){
            set2.add(num);
        }
        
        set1.retainAll(set2);
        
        int[] result = new int[set1.size()];
        int i=0;
        
        for(int num : set1){
            result[i++] = num;
        }
        return result;
        
    }
}

// Approach 2: Sort one array and use binary search to insert elements

class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Set<Integer> intersect = new HashSet();
        
        for(int num:nums2){
            if(find(num,nums1)){
                intersect.add(num);
        }
        }
        
        int[] result = new int[intersect.size()];
        
        int i=0;
        
        for(int num : intersect){
            result[i++] = num;
        }
        return result;
    }
    
    public boolean find(int target, int[] nums){
        int left =0;
        int right = nums.length-1;
        
        while(left<=right){
            int mid = left + (right-left)/2;
            
            if(nums[mid]==target){
                return true;
            }
            
            else if(nums[mid] > target){
                right = mid -1;
            }
            else{
                left = mid +1;
            }
        }
        return false;
    }
}
