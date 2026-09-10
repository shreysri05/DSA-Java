class Solution {
    public int maximumCount(int[] arr) {
        int k =arr.length;
     if(arr[0]>0) return k;
     if(arr[k-1]<0) return k;
     if(arr[0]==0&&arr[k-1]==0) return 0;
     int i =0,j =k-1;
     while(i<j){
        int mid=i+(j-i)/2;
        if(arr[mid]>=0) j=mid;
        else i=mid+1;
     }
     int neg=i;
      i=0;j =k-1;
     while(i<j){
        int mid=i+(j-i)/2;
        if(arr[mid]<=0) i=mid+1;
        else j=mid;
     }
     int pos=k-i;
     if(neg>=pos) return neg;
     return pos;

     
    }
}