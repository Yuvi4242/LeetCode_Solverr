class Solution {
    public int findMaxLength(int[] nums) {
        HashMap<Integer,Integer>map=new HashMap<>();
        map.put(0,-1);
        int s=0,ans=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0)s--;
            else s++;
            if(map.containsKey(s)){
                ans=Math.max(ans,i-map.get(s));
            }
            else{
                map.put(s,i);
            }   
        }
        return ans;
    }
}