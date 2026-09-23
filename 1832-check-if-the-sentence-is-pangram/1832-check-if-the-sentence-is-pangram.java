class Solution {
    public boolean checkIfPangram(String s) {
        // HashSet<Character>set=new HashSet<>();
        // for(char ch:s.toCharArray()){
        //     set.add(ch);
        // }
        // return set.size()==26;

        // boolean[]freq=new boolean[26];
        // for(char ch:s.toCharArray()){
        //     freq[ch-'a']=true;
        // }
        // for(boolean b:freq){
        //     if(!b)return false;
        // }
        // return true;

        for(char st='a';st<='z';st++){
            if(s.indexOf(st)==-1)return false;
        }
        return true;
    }
}