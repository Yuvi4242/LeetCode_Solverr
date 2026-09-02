class Solution {
    public boolean buddyStrings(String s, String goal) {
       if(s.length()!=goal.length())return false;
       if(s.equals(goal)){
          HashSet<Character>set=new HashSet<>();
          for(char ch:s.toCharArray()){
            if(!set.add(ch))return true;
          }
          return false;
       }
       int cnt=0;
       char a=0,b=0,c=0,d=0;
       for(int i=0;i<s.length();i++){
            if(s.charAt(i)!=goal.charAt(i)){
                cnt++;
            if(cnt==1){
                a=s.charAt(i);
                b=goal.charAt(i);
            }
            else if(cnt==2){
                c=s.charAt(i);
                d=goal.charAt(i);
            }
            else return false;
            }  
       }
       return cnt==2&&a==d&&b==c;
    }
}