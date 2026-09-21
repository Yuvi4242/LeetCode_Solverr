class Solution {
    public long[] resultArray(int[] nums, int k) {
        long[]ans=new long[k];
        long[]dp=new long[k];
        for(int num:nums){
            long[]nxt=new long[k];
            int mod=num%k;
            nxt[mod]++;

            for(int r=0;r<k;r++){
                int nmod=(r*mod)%k;
                nxt[nmod]+=dp[r];
            }
            for(int r=0;r<k;r++){
                ans[r]+=nxt[r];
            }
            dp=nxt;
        }
        return ans;
    }
}