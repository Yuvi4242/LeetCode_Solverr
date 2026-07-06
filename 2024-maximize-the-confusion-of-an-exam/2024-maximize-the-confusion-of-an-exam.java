class Solution {
    public int maxConsecutiveAnswers(String answerKey, int k) {
        int left=0;
        int ct=0,cf=0;
        int ans=0;
        int n=answerKey.length();
        for(int right=0;right<n;right++){
            if(answerKey.charAt(right)=='T'){
                ct++;
            }
            else {
                cf++;
            }
            while(Math.min(ct,cf)>k){
                if(answerKey.charAt(left)=='T') ct--;
                else cf--;
                left++;
            }
            ans=Math.max(ans,right-left+1);
        }
        return ans;
    }
}