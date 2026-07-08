class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer>ans =new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            int idx=Math.abs(nums[i])-1;
            if(nums[idx]>0){
                nums[idx]=-nums[idx]; //negative ho jayega value
            }
        }
        for(int i=0;i<nums.length;i++){
            if(nums[i]>0){//agar negative hai to as itis
            //varna positive hai to index me +1 kardenge too missing value mil jayegi.
                ans.add(i+1);
            }
        }
        return ans;
    }
}