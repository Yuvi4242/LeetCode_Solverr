class Solution {
    public int stoneGameV(int[] stoneValue) {
        int n=stoneValue.length;
        int[]pre=new int[n+1];        
        for(int i=0;i<n;i++){
            pre[i+1]=pre[i]+stoneValue[i];
        }    
            int[][]dp=new int[n][n];
            for(int len=2;len<=n;len++){
                for(int l=0;l+len-1<n;l++){
                    int r=l+len-1;
                    for(int k=l;k<r;k++){
                        int ls=pre[k+1]-pre[l];
                        int rs=pre[r+1]-pre[k+1];
                        if(ls<rs){
                            dp[l][r]=Math.max(dp[l][r],ls+dp[l][k]);
                        }
                        else if(ls>rs){
                            dp[l][r]=Math.max(dp[l][r],rs+dp[k+1][r]);
                        }
                        else{
                            dp[l][r]=Math.max(dp[l][r],Math.max(ls+dp[l][k],rs+dp[k+1][r]));
                        }
                    }
                }
            }
        return dp[0][n-1];
    }
}