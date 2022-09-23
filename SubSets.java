class Solution {
     public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        int index =0;
        getSubset(res, new ArrayList<>(), nums, index);
        return res;
        
    }
    
    public void getSubset(List<List<Integer>> res, List<Integer> list, int[] nums, int index) {

        res.add(new ArrayList<>(list));

        for(int i=index;i<nums.length;i++){
            list.add(nums[i]);
            getSubset(res, list,nums,i+1);
            list.remove(list.size()-1);
        }

    }
}
