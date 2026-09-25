class Solution {
    public boolean makeEqual(String[] words) {
        int[]freq=new int[26];
        for(String word:words){
            for(char ch:word.toCharArray()){
                freq[ch-'a']++;
            }
        }
        for(int cnt:freq){
            if(cnt%words.length!=0)return false;
        }
        return true;
    }
}