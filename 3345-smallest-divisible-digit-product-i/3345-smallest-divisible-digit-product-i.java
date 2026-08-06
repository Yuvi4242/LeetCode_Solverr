class Solution {
    public int smallestNumber(int n, int t) {
       while(true){
            int num=n;
            int pr=1;
            while(num>0){
                pr*=num%10;
                num/=10;
            }
            if(pr%t==0) return n;
            n++;
       }
    }
}