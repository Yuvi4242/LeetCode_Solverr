class Solution {
    public boolean checkString(String s) {
        // int n=s.length();
        // for(int i=0;i<n;i++){
        //     if(s.charAt(i)!='b') continue;
        //     for(int j=i+1;j<n;j++){
        //         if(s.charAt(j)=='a')return false;
        //     }
        // }
        // return true;

        // for(int i=0;i+1<s.length();i++){
        //     if(s.charAt(i)=='b'&&s.charAt(i+1)=='a')return false;
        // }
        // return true;

        return !s.contains("ba");
    }
}