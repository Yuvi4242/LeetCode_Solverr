class Solution {
    public List<String> summaryRanges(int[] nums) {
        List<String> ans=new ArrayList<>();
        int i=0;
        while(i<nums.length){
            int st=nums[i];
            while(i+1<nums.length&&nums[i+1]==nums[i]+1){
                i++;
            }
            if(st==nums[i]){
                ans.add(String.valueOf(st));
            }
            else{
                ans.add(st+"->"+nums[i]);
            }
            i++;
        }
        return ans;
    }
}