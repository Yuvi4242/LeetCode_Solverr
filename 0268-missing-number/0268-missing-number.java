class Solution {
    public int missingNumber(int[] nums) {
        // int n=nums.length;
        // int exp=n*(n+1)/2;
        // int real=0;
        // for(int num:nums){
        //     real+=num;
        // }
        // return exp-real;
        
        //using XOR
        int xor=nums.length;
        for(int i=0;i<nums.length;i++){
            xor^=i;
            xor^=nums[i];
        }
        return xor;
    }
}


