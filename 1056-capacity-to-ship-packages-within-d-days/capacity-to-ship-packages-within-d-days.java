class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int max=0,sum=0,ans=0;
        for(int ele:weights){
            max=Math.max(max,ele);
            sum+=ele;
        }
        while(max<=sum){
           int  mid=max+(sum-max)/2;
            if(day(mid,weights)<=days) {sum=mid-1; ans=mid;}
            else max=mid+1;
        } return ans;
    }
    int day(int capacity,int[]weights){
        int c=capacity,days=0;
        for(int ele:weights){
            if(c>=ele) c-=ele;
            else{
                days++;
                c=capacity-ele;
            }
        } return ++days;
    }
}