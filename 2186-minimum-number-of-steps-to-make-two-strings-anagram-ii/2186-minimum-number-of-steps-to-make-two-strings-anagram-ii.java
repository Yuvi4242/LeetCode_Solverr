class Solution {
    public int minSteps(String s, String t) {
       //freq diff ka sum karna hai then output;
        int[]f=new int[26];
        for(char ch:s.toCharArray()) f[ch-'a']++;
        for(char ch:t.toCharArray()) f[ch-'a']--;
        int ans=0;
        for(int x:f){
            ans+=Math.abs(x);
        }
        return ans;
    }
}
//to isme hamm frequency array banake dono string ke character count karke dono  ko differene nikaal lenege 
//then unn difference ka sum karke ans me put kardenge with the help of  abs;