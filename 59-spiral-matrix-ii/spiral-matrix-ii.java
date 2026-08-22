class Solution {
    public int[][] generateMatrix(int n) {
      int firstrow=0,firstcol=0,lastrow=n-1,lastcol=n-1,k=1;
      int [][] ans = new int [n][n];
      while(firstrow<=lastrow && firstcol<=lastcol) 
      {
        for(int j =firstcol;j<=lastcol;j++)
        { 
        ans[firstrow][j]=k++;
        }
         firstrow++;

        if(firstrow<=lastrow && firstcol<=lastcol){
            for( int i =firstrow;i<=lastrow;i++){
                ans[i][lastcol]=k++;
            }
        } 
        lastcol--;
       
        if(firstrow<=lastrow && firstcol<=lastcol){
            for( int j =lastcol;j>=firstcol;j--){
                ans[lastrow][j]=k++;
            }
       }  
       lastrow--;
       
       if(firstrow<=lastrow && firstcol<=lastcol){
            for( int  i =lastrow;i>=firstrow;i--){
                ans[i][firstcol]=k++;
            }
        } firstcol++;
      } return ans;
    }
}