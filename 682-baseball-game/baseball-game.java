class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> st = new Stack<>();
        int  sum=0;
        for (int i =0;i<operations.length;i++){
            if (operations[i].equals("+")){
                int ele1=st.pop();
                int ele2=st.pop();
                
                st.push(ele2);
                st.push(ele1);
                st.push(ele1+ele2);       
            }
           else if (operations[i].equals("C")) st.pop();
           else if (operations[i].equals("D")) st.push(st.peek()*2);
           else{
            st.push(Integer.parseInt(operations[i]));
           }


        } for(int ele:st) {
            sum+=ele;
        }
        return sum;
    }
}