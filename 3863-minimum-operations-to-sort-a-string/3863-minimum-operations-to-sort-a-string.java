class Solution {
    public int minOperations(String s) {
        int n=s.length();
        //pehele case ke liye 
        boolean sorted=true;
        for(int i=1;i<n;i++){
            if(s.charAt(i)<s.charAt(i-1)){
                sorted=false;
                break;
            }
        }

        if(sorted) return 0;
        //can't sort a reversed string length2
        if(n==2)return -1;
        char min='z';
        char max='a';
        for(char ch:s.toCharArray()){
            min=(char)Math.min(min,ch);
            max=(char)Math.max(max,ch);
        }

        //case3 one operation is enough
        if(s.charAt(0)==min||s.charAt(n-1)==max)return 1;

        //case4 min or max is in the middle'
        
        for(int i=1;i<n-1;i++){
            if(s.charAt(i)==min||s.charAt(i)==max) return 2;
        }

        //case5 all unsorted strings ke liye
        return 3;
    }
}