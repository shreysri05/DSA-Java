class Solution {
    public int[] plusOne(int[] digits) {
        int carry=1,i=digits.length-1;
        while(i>=0 && carry==1){
        digits[i]+=carry;
        carry=digits[i]/10;
        digits[i]%=10;
        i--;
        }
        if(carry==1){
            int []ans= new int [digits.length+1];
            ans[0]=1;
            return ans;
        }
        return digits;
        
    }
}