class Solution {
    public boolean stoneGame(int[] piles) {
        int n=piles.length;
        int[][]dp=new int[n][n];
        for(int[]d:dp) Arrays.fill(d,-1);
        return fn(piles,0,piles.length-1,dp)>=0;
    }
    public int fn(int[]p,int i,int j,int[][]dp){
        if(i==j) return p[i];
        if(dp[i][j]!=-1) return dp[i][j];
        return dp[i][j]=Math.max(p[i]-fn(p,i+1,j,dp),p[j]-fn(p,i,j-1,dp));
    }
}