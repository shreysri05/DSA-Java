class Solution {
    public boolean isPowerOfTwo(int n) {
        if(n==1) return true;
        if(n%2!=0) return false;
        n=n/2;
        int x=1;
        
        while(x<=n){
            if (x==n) return true;
        
            else x=x<<1;
        } return false;
    }
}