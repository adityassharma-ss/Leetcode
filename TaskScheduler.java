class Solution {
    public int leastInterval(char[] tasks, int n) {
        int[] count = new int[26];
        int max = 0, maxCount = 0;
        
        for(char ch : tasks){
            count[ch-'A']++;
            if(count[ch-'A']==max){
                maxCount++;
            }else if(count[ch-'A']>max){
                max=count[ch-'A'];
                maxCount=1;
            }
        }
        
        return Math.max(tasks.length, (max-1)*(n+1) + maxCount);
    }
}

// Time - Complexity : O(n)
// Space - Complexity: O(26)
