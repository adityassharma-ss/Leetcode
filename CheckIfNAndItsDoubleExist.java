// Approach 1: SOrting With Binary Search || TC: O(nlogn) || SC: O(1)

class Solution {
    public boolean checkIfExist(int[] arr) {
        int n = arr.length;
        Arrays.sort(arr);
        for(int i=0;i<n;i++){
            int target=2*arr[i];
            int start=0;
            int end=arr.length-1;
            while(start<=end ){
                int mid=start+(end-start)/2;
                if(arr[mid]==target&& mid!=i){
                    return true;
                }
                else if(arr[mid]<target){
                    start=mid+1;
                }
                else{
                    end=mid-1;
                }
            }
            
        }
        return false;
    }
}

// Appraoch 2: Using HashSet || TC: O(n)

class Solution {
    public boolean checkIfExist(int[] arr) {
        int n = arr.length;
        Set<Integer> set = new HashSet<>();
        for(int i = 0; i < n; i++){
            if(set.contains(arr[i] * 2) || (arr[i] % 2 == 0 && set.contains(arr[i] / 2))){
                return true;
            }
            set.add(arr[i]);
        }
        return false;
    }
}
