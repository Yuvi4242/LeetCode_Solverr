class Solution {
    public int minSteps(String s, String t) {
        int[]fre=new int[26];
        for(char ch:s.toCharArray())fre[ch-'a']++;
        for(char ch:t.toCharArray())fre[ch-'a']--;
        int ans=0;
        for(int x:fre){
            //only positive number of character use honge;
            if(x>0)ans+=x;
        }
        return ans;
    }
}