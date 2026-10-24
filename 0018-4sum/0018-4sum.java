class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> res=new ArrayList<>();
        Arrays.sort(nums);
        HashSet<String>uniq=new HashSet<>();
        for(int i=0;i<nums.length-3;i++){
            for(int j=i+1;j<nums.length-2;j++){
                int l=j+1;
                int r=nums.length-1;
                while(l<r){
                    long sum=nums[i];
                    sum+=nums[j];
                    sum+=nums[l];
                    sum+=nums[r];
                    if(sum>target)r--;
                    else if(sum<target)l++;
                    else{
                        StringBuilder sb=new StringBuilder();
                        sb.append(nums[i]);
                        sb.append(nums[j]);
                        sb.append(nums[l]);
                        sb.append(nums[r]);
                        String code=sb.toString();
                        if(uniq.contains(code)==false){
                            uniq.add(code);
                            res.add(Arrays.asList(nums[i],nums[j],nums[l],nums[r]));
                        }
                        l++;
                        r--;
                    }
                }
            }
        }
        return res;
    }
}