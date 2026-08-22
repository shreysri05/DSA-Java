class Solution {
    public int[] sortedSquares(int[] nums) {
      int i =0, j = nums.length-1, p =j;
      int [] ans= new int[nums.length];
        while(i<=j){
            int N1= nums[i]*nums[i];
            int N2= nums[j]*nums[j];
            if(N1>N2) {ans[p--]=N1; i++;}
            else{ ans[p--]=N2;j--;}
        } return ans;
    }
}