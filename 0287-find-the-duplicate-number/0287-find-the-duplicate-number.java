class Solution {
    public int findDuplicate(int[] nums) {
        // Arrays.sort(nums);
        // for(int i=1;i<nums.length;i++){
        //     if(nums[i]==nums[i-1]) return nums[i];
        // }
        // return -1;

//by slow fast pointer approch
        // int slow=nums[0];
        // int fast=nums[0];
        // do{
        //     slow=nums[slow];
        //     fast=nums[nums[fast]];
        // }
        // while(slow!=fast);
        //     slow=nums[0];
        
        // while(slow!=fast){
        //     slow=nums[slow];
        //     fast=nums[fast];
        // }
        // return slow;
        int slow=0;
        int fast=0;
        while(true){
            slow=nums[slow];
            fast=nums[fast];
            fast=nums[fast];
            if(slow==fast){
                slow=0;
                while(slow!=fast){
                    slow=nums[slow];
                    fast=nums[fast];
                }
                 return slow;
            }
        }
        //return 0;
    }
}