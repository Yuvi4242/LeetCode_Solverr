class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        Set<Integer>set=new HashSet<>();
        int low=Integer.MAX_VALUE;
        int high=Integer.MIN_VALUE;
        for(int num:nums){
            set.add(num);
            low=Math.min(num,low);
            high=Math.max(num,high);
        }
        List<Integer>l=new ArrayList<>();
        for(int i=low;i<=high;i++){
            if(!set.contains(i)) l.add(i);
        }
        return l;
    }
}