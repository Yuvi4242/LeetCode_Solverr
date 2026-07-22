class Solution {
    public int scoreOfParentheses(String s) {
       Stack<Integer>st=new Stack<>();
       st.push(0);
       for(char ch:s.toCharArray()){
            if(ch=='('){
               st.push(0);
            }
            else{
                int curr=st.pop();
                int prev=st.pop();
                st.push(prev+Math.max(2*curr,1));
            }
       }
       return st.pop();
    }
}