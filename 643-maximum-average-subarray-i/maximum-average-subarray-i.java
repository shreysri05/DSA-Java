class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double sum=0;
        for(int i=0;i<k;i++)sum+=nums[i];
        if(nums.length!=k) {double csum=sum;int j =0;
        for(int i =k;i<nums.length;i++) {
            csum=csum-nums[j++]+nums[i];
            sum=Math.max(sum,csum);}
        }
        return sum/k;            
        
    }
}