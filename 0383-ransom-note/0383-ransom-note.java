class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        // int[]freq=new int[26];
        // for(char ch:magazine.toCharArray()){
        //     freq[ch-'a']++;
        // }
        // for(char ch:ransomNote.toCharArray()){
        //     if(--freq[ch-'a']<0) return false;
        // }
        // return true;
        HashMap<Character,Integer>map=new HashMap<>();
        for(char ch:magazine.toCharArray()){
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        for(char ch:ransomNote.toCharArray()){
            if(!map.containsKey(ch)||map.get(ch)==0) return false;
            map.put(ch,map.get(ch)-1);
        }
        return true;
    }
}