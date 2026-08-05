class Solution {
    public int findDuplicate(int[] arr) {
        int i=0;
     while(i<arr.length)
     {
        if(arr[i]==i+1)i++;
        else {
           int index=arr[i];
            if(arr[i]==arr[index-1]) return arr[i];
            else {arr[i]=arr[index-1];
            arr[index-1]=index;}
        }
     } return 0;
    }
}