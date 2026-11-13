class Solution {
    public int climbStairs(int n) {
        if(n<=3) return n;

        int start=0;
        int n1=3;
        int n2=2;
        for(int i=3;i<n;i++){
            start=n1+n2;
            n2=n1;
            n1=start;
        }
        return start;
        // return climbStairs(n-1)+climbStairs(n-2);
    }
}