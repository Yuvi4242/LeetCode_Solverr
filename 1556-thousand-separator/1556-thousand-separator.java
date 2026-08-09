class Solution {
    public String thousandSeparator(int n) {
        if(n==0)return "0";
        StringBuilder sb=new StringBuilder();
        while(n>0){
            int digit=n%10;
            sb.append(digit);
            n/=10;
            if(n>0&&sb.length()%4==3){
                sb.append(".");
            }
        }
        return sb.reverse().toString();
    }
}