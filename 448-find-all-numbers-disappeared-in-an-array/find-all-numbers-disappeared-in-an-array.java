class Solution {
    public List<Integer> findDisappearedNumbers(int[] arr) {
        List <Integer> ans=  new ArrayList<>();
        int i=0;
       while(i<arr.length)
        {
          if(arr[i]==i+1 || arr[i]==arr[arr[i]-1]) i++;
          else {
            int idx=arr[i];
           
            arr[i]=arr[idx-1];
            arr[idx-1]=idx;
          }
        }
      for ( i =0;i<arr.length;i++){
      if(arr[i]!=i+1) {ans.add(i+1);}
     } return ans;
    }
}