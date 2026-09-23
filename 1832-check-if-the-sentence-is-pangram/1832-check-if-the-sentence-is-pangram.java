class Solution {
    public boolean checkIfPangram(String s) {
        HashSet<Character>set=new HashSet<>();
        for(char ch:s.toCharArray()){
            set.add(ch);
        }
        return set.size()==26;
    }
}