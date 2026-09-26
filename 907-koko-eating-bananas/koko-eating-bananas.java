class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int max =Integer.MIN_VALUE;
        int min =1;
      for(int ele:piles){
        max=Math.max(max,ele);
      } 
      while(min<=max){
        int mid= min+(max-min)/2;
        if(hours(mid,piles)<=h) max=mid-1;
        else min =mid+1;
        } return min;
    }
    long hours(int speed,int[]piles){
        long h=0;
        for(int ele:piles){
            h+=ele/speed;
            if(ele%speed!=0) h+=1;
        } return h;
    }
}