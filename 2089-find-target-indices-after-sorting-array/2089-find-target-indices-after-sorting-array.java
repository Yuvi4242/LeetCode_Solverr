class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
        // Arrays.sort(nums);
        // List<Integer>ans=new ArrayList<>();
        // for(int i=0;i<nums.length;i++){
        //     if(nums[i]==target){
        //         ans.add(i);
        //     }
        // }
        // return ans;

        List<Integer>ans=new ArrayList<>();
        int small=0,equal=0;
        for(int num:nums){
            if(num<target) small++;
            else if(num==target)equal++;
        }
        for(int i=0;i<equal;i++){
            ans.add(small+i);
        }
        return ans;
    }
}