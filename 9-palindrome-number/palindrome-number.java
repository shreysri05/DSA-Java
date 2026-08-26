class Solution {
    public boolean isPalindrome(int x) {
        int m =x;
        int n =0;
        if (x<0) return false;
        else{
           
           while(m>0){
            n=n*10+m%10;
            m=m/10;

           }
        }
        if(x==n) return true;
        return false;
        
    }
}