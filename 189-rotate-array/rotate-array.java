class Solution {
    public void rotate(int[] nums, int k) {
      k=k%nums.length;
      if(k==0) return ;
       reverse(nums,0,nums.length);
       reverse(nums,0,k);
       reverse(nums,k,nums.length);
    }
    void reverse(int []nums,int i,int k )
    {
        int j=k-1;
    while(i<j){
        int temp=nums[i];
        nums[i++]=nums[j];
        nums[j--]=temp;
       } 
      }
    }