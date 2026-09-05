class Solution {
    public String removeDuplicates(String s) {
        if(s.length()==1) return s;
        Stack <Character> st1 = new Stack<>();
        String ans="";
        for(int i =0;i<s.length();i++){
            if(st1.size()==0) st1.push(s.charAt(i));
            else{
                if(st1.peek()==s.charAt(i)) st1.pop();
                else st1.push(s.charAt(i));
            }
        }
        while(!st1.isEmpty()){
            
          ans=st1.pop()+ans; 

        } return ans;

    }
}