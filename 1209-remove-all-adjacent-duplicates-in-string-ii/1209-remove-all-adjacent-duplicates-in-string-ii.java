class Solution {
    class pair{
        char ch;
        int cnt;
        pair(char ch,int cnt){
            this.ch=ch;
            this.cnt=cnt;
        }
    }
    public String removeDuplicates(String s, int k) {
        Stack<pair>st=new Stack<>();
        for(char ch:s.toCharArray()){
            if(!st.isEmpty()&&st.peek().ch==ch){
                st.peek().cnt++;
                if(st.peek().cnt==k){
                st.pop();
                }
            }
            else{
                st.push(new pair(ch,1));
            }
        }
        StringBuilder ans=new StringBuilder();
        while(!st.isEmpty()){
            pair p=st.pop();
            while(p.cnt-->0){
                ans.append(p.ch);
            }
        }
        return ans.reverse().toString();
    }
}