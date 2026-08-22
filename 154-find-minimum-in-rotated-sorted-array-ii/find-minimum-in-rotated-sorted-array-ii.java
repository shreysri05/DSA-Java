class Solution {
    public int findMin(int[] arr) {
        int low=0, high =arr.length-1;
        if( low==high || arr[low]<arr[high]) return arr[low];
        if(arr[high]<arr[low] && arr[high]<arr[high-1]) return arr[high];
        while(low<=high){
            int mid  = low+(high-low)/2;
           if (arr[mid]>arr[high]) low=mid+1;
           else if(arr[mid]<arr[high]) high=mid;
           else high--;
        } return arr[low];
    }
}