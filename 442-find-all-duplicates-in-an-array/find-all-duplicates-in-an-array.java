class Solution {
    public List<Integer> findDuplicates(int[]arr) {
        List<Integer> ans= new ArrayList<>();
        int i =0;
        while(i<arr.length){
            int index =arr[i];
            if(arr[i]==i+1||arr[i]==arr[index-1])  i++;
            else{     
              arr[i]=arr[index-1];
                arr[index-1]=index;
                
            }
        
        } for(i=0;i<arr.length;i++){
            if(arr[i]!=i+1)ans.add(arr[i]);
        }
          Collections.sort(ans);
        return ans;
    }
}