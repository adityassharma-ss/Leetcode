class Solution {
    public boolean isPowerOfFour(int num) {
        // return n > 0 && Integer.bitCount(n) == 1 && (n - 1) % 3 == 0;
        
        if(num<1){
            return false;
        }
        int n=num;
        int count =0;
        while(n>1){
            n >>=2;
            count += 2;
            
        }
        return (n<<count) == num;
    }
}
