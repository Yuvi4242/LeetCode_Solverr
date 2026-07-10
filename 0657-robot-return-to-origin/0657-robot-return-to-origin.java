class Solution {
    public boolean judgeCircle(String move) {
        int x=0,y=0;
        for(int i=0;i<move.length();i++){
            char ch=move.charAt(i);
            if(ch=='R') x++;
            else if(ch=='L')x--;
            else if(ch=='U')y++;
            else if(ch=='D')y--;
        }
        return x==0&&y==0;
    }
}