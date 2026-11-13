class Solution {
    public int fib(int n) {
        // if(n==0||n==1)return n;
        // int f1=fib(n-1);
        // int f2=fib(n-2);
        // return f1+f2;

        if(n<=1)return n;
        int p1=1;
        int p2=0;
        int curr=0;
        for(int i=2;i<=n;i++){
            curr=p1+p2;
            p2=p1;
            p1=curr;
        }
        return curr;
    }
}