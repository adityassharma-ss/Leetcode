class Solution {
    public int[][] merge(int[][] intervals) {
        int n = intervals.length;
        if(intervals == null || n == 0) return intervals;
        
        Arrays.sort(intervals, new Comparator<int[]>(){
            public int compare(int[] a, int[] b){
                return a[0]-b[0];
            }
        });
        
        List<int[]> result = new ArrayList<int[]>();
        
        int[] temp = intervals[0];
        
        for(int i=1;i<n;i++){
            if(intervals[i][0] <= temp[1]){
                temp[1] = Math.max(temp[1], intervals[i][1]);
            }
            else{
                result.add(temp);
                temp = intervals[i];
            }
        }
        result.add(temp);
        return result.toArray(new int[result.size()][]);
    }
}
