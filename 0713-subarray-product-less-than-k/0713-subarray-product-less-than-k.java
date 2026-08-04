class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        int n=nums.length;
        int left=0;
       int right=0;
        int ans=0;
        int pr=1;
        for( right=0;right<n;right++){
            pr*=nums[right];
            while(left<n&&pr>=k){
                pr/=nums[left];
                left++;
            }
            ans+=(right-left+1);
        }
        return ans;
    }
}