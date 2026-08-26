class Solution {
    public double myPow(double x, int n) {
        long N=n;
        double ans=1;
        if(N==0 || x==1) return ans ;
        if(x==0 ) return x ;
        if(N<0) {x=1/x;
         N*=-1;}
        
        
        while(N>0){
           if(N%2==0){ x*=x;
            N=N/2;}
            else{ans*=x;
            N--;}
        } 
        return ans;
    }
}