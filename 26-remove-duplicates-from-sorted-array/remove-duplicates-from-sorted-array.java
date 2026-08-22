class Solution {
    public int removeDuplicates(int[] arr) {
           int i =0,j=1, k =0;
           while(j<arr.length){
                if(arr[i]==arr[j]) j++;
                else{
                    arr[k]=arr[i];
                    k++;
                    i=j;
                    j++;
                }
           } arr[k]=arr[i];
           return k+1;
    }
}