class Solution {
    public int removeDuplicates(int[] nums) {
        if(nums.length<=2) return nums.length;
        int j =2;
        for(int i=2;i<nums.length;i++){
            if(nums[j-2]!=nums[i] ) nums[j++]=nums[i];
           
        } return j ;

    }
}