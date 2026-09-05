class Solution {
    public int maxPower(String s) {
        if(s.length()==1)return 1;
        int maxcount=0, i=0,j=1;

        while(i<s.length()){
            if(j>=s.length()) break;
            if(s.charAt(i)==s.charAt(j)) 
                j++;
            else{
                if(maxcount<j-i) maxcount=j-i;
                i=j;
                j++;

            }
            if(maxcount<j-i) maxcount=j-i;
        } return maxcount;
    }
}