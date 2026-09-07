class Solution {
    public String largestGoodInteger(String num) {
        // String ans="";
        // for(int i=0;i<num.length()-2;i++){
        //     if(num.charAt(i)==num.charAt(i+1)&&num.charAt(i)==num.charAt(i+2)){
        //         String curr=num.substring(i,i+3);
        //         if(ans.equals("")||curr.compareTo(ans)>0) ans=curr;
        //     }
        // }
        // return  ans;
        String[] goodInteger = {"999","888","777","666","555","444","333","222","111","000"};
        for(String g: goodInteger){
            if(num.contains(g)){
                return g;
            }
        }
        return "";
    }
}