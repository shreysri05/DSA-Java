class Solution {
    public int smallestDivisor(int[] nums, int threshold) {
        int max=0,min=1;
        for(int ele: nums) max=Math.max(max,ele);
        while(min<=max){
            int mid=min+(max-min)/2;
            if(div(mid,nums)<=threshold) max=mid-1;
            else min=mid+1;
        } return min;  
    }
    long  div(int a,int[]arr)
    {long t=0;
        for(int ele:arr) t+= (ele+a-1L)/a;
        return t;
    }
}