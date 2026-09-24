class Solution {
    public int smallestIndex(int[] nums) {

        for(int i =0;i<nums.length;i++)  if(digitSum(nums[i])==i)return i ;
        return -1;   
    }
    int digitSum(int n){
    if(n==0) return 0;
    return digitSum(n/10)+n%10;}
    
}