class Solution {
    private int fn(int[]ls,int[]ld,int[]ws,int[]wd){
        int min=Integer.MAX_VALUE;;
        for(int i=0;i<ls.length;i++){
            min=Math.min(min,ls[i]+ld[i]);
        }
        int ans=Integer.MAX_VALUE;
        for(int i=0;i<ws.length;i++){
            ans=Math.min(ans,Math.max(min,ws[i])+wd[i]);
        }
        return ans;
    }
    public int earliestFinishTime(int[] landStartTime, int[] landDuration, int[] waterStartTime, int[] waterDuration) {
        return Math.min(
            fn(landStartTime,landDuration,waterStartTime,waterDuration),fn(waterStartTime,waterDuration,landStartTime,landDuration)
        );
    }
}