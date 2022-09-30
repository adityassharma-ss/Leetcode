class Solution {
    public int change(int amount, int[] coins) {
        int[] count = new int[amount+1];
        count[0] = 1;
        for(final int coin:coins){
            for(int i=coin;i<=amount;i++){
                count[i]+=count[i-coin];


            }
        }
        return count[amount];
    }
}
