class Solution {
    public int largestRectangleArea(int[]arr) {
        Stack<Integer> st = new Stack<>();
        int n = arr.length;
        int [] nse = new int [n];
        st.push(n-1);
        nse[n-1]=n;
        for(int i =n-2;i>=0;i--)
        {
            while(st.size()>0 && arr[st.peek()]>=arr[i]) st.pop();
            if(st.size()==0) nse[i]=n;
            else nse[i]=st.peek();
            st.push(i);
        }

        while(st.size()!=0) st.pop();
        st.push(0);
        nse[0]*=arr[0];
        int max=nse[0];
        for(int i =1;i<n;i++){
            while(st.size()>0 && arr[st.peek()]>=arr[i]) st.pop();
           if(st.size()==0) nse[i]*=arr[i];
           else{ nse[i]= arr[i]*(nse[i]-st.peek()-1); }
           st.push(i);
           if(nse[i]> max) max=nse[i];
        }
        return max;
    }
}