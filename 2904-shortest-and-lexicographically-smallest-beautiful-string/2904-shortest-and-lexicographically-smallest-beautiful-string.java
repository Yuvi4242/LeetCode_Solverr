class Solution {
    public String shortestBeautifulSubstring(String s, int k) {
        int l=0;
        int one=0;
        String ans="";
        for(int r=0;r<s.length();r++){
            if(s.charAt(r)=='1')one++;
            while(one>k){
               if(s.charAt(l)=='1')one--;
                l++;
            }
            while(one==k&&s.charAt(l)=='0')l++;
            if(one==k){
                String curr=s.substring(l,r+1);
                if(ans.equals("")||curr.length()<ans.length()||(curr.length()==ans.length()&&curr.compareTo(ans)<0))ans=curr;
            }
        }
        return ans;
    }
}