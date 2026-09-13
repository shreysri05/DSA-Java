class Solution {
    public int pivotIndex(int[] nums) {
        int n =nums.length;
        int total=0;
        int leftsum =0;
        for(int i =0;i<n;i++) total+=nums[i];
      
        for(int i =0;i<n;i++){
            int sum =total-leftsum-nums[i];
           if (leftsum==sum) return i;
           leftsum+=nums[i];
        }      
         return -1;
    }
}