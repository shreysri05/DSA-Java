class Solution {
    public String mergeAlternately(String word1, String word2) {
        String ans="";
        int i =0,j=0;
        while(i<word1.length()&& j<word2.length()){
             ans+=word1.charAt(i++);
             ans+=word2.charAt(j++);
            
        } if(j<word2.length()){
            for(int p=j;p<word2.length();p++) ans+=word2.charAt(p);}
         if(i<word1.length()){
            for(int p=i;p<word1.length();p++) ans+=word1.charAt(p);}
        
        return ans;
    }
}