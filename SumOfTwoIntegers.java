// class Solution {
//     public int getSum(int a, int b) {
//         return a+b;
//     }
// }

class Solution {
    public int getSum(int a, int b) {
        while(b!=0){
            final int c = a&b;
            a^=b;
            b=c<<1;
        }
        return a;
    }
}
