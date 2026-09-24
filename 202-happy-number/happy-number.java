class Solution {
    public boolean isHappy(int n) {
       int check=0;
       int slow=n,fast=n;
       while(check!=1){
        slow=SquareSum(slow);
        fast=SquareSum(SquareSum(fast));
        if(fast==1||slow==1) return true;
        if(fast==slow) check++;
       } return false;
       }
       int SquareSum(int n){
        if(n==0) return 0;
        
        return SquareSum(n/10)+((n%10)*(n%10));
       }
        
    
}