class Solution {
    public int maxDepth(String s) {
        int d=0;
        int r=0;
        for(char ch:s.toCharArray()){
            if(ch==')'){
                d--;
                continue;
            }
            if(ch!='(')continue;
            d++;
            if(d>r) r=d;
        }
        return r;
    }
}