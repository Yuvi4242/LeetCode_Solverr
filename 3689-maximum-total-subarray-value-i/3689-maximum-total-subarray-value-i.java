class Solution {
    public long maxTotalValue(int[] nums, int k) {
        int min=nums[0];
        int max=nums[0];
        for(int x:nums){
            min=Math.min(min,x);
            max=Math.max(max,x);
        }
        return 1L*(max-min)*k;
    }
}