class Solution {
    public String[] findWords(String[] words) {
        ArrayList<String>ans=new ArrayList<>();
        String one="qwertyuiop";
        String second="asdfghjkl";
        String third="zxcvbnm";
        for(String i:words){
            if(fn(i,one)||fn(i,second)||fn(i,third)) ans.add(i);
        }
        return ans.toArray(new String[0]);
    }
    private boolean fn(String s,String row){
        for(char ch:s.toCharArray()){
            if(row.indexOf(Character.toLowerCase(ch))==-1){
                return false;
            }
        }
        return true;
    }
}