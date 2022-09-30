// Q NO 202: Google

class Solution {
    public boolean isHappy(int n) {
        int slow=n;
        int fast=n;
        do{
            slow=sum(slow);
            fast=sum(sum(fast));
            if(slow==1)
                return true;
        }while(slow!=fast);
        return false;
    }
     public int sum(int n)
     {
         int sum =0;
         while(n>0){
         int rem = n%10;
         sum+=(rem*rem);
         n=n/10;
         }
         return sum;
     }
}
