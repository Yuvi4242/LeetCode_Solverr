class Solution {
    public String decodeString(String s) {
        Stack<Character>st=new Stack<>();
        for(char ch:s.toCharArray()){
            if(ch!=']'){
                st.push(ch);
            }
            else{
                //for string
                StringBuilder str=new StringBuilder();
                while(st.peek()!='['){
                    str.insert(0,st.pop());
                }
                st.pop();
                //for number
                StringBuilder num=new StringBuilder();
                while(!st.isEmpty()&&Character.isDigit(st.peek())){
                    num.insert(0,st.pop());
                }
                int k=Integer.parseInt(num.toString());
                //for the repeated elements
                String repeated=str.toString().repeat(k);
                for(char c:repeated.toCharArray()){
                    st.push(c);
                }
            }
        }
        StringBuilder ans=new StringBuilder();
        while(!st.isEmpty()){
            ans.insert(0,st.pop());
        }
        return ans.toString();
    }
}