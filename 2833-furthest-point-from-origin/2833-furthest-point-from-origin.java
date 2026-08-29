class Solution {
    public int furthestDistanceFromOrigin(String moves) {
        int pos=0;
        int cnt=0;
        for(char ch:moves.toCharArray()){
            if(ch=='L')pos--;
            else if(ch=='R')pos++;
            else cnt++;
        }
        return Math.abs(pos)+cnt;
    }
}