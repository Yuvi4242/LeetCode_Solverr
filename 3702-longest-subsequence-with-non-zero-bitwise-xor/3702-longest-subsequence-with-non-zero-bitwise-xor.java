class Solution {
    public int longestSubsequence(int[] nums) {
        int total=0;
        int len=nums.length;
        boolean nz=false;
        for(int num:nums){
            total^=num;
            if(num>0){
                nz=true;
            }
        }
        if(total!=0)return len;
        if(nz)return len-1;
        return 0;
    }
}