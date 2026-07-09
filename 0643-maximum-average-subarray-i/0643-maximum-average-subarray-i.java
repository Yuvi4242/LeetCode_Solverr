class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double sum=0;
        for(int i=0;i<k;i++){
            sum+=nums[i];
        }
        int left=0;
        double avg=sum/k;
        double max=avg;
        for(int i=k;i<nums.length;i++){
            sum+=nums[i];
            sum-=nums[left];
            left++;
            avg=sum/k;
            max=Math.max(max,avg);
        }
        return max;
    }
}