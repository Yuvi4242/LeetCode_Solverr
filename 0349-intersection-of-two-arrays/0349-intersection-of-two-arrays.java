class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer>set=new HashSet<>();
        HashSet<Integer>res=new HashSet<>();
        //store the elements of num1;
        for(int num:nums1){
            set.add(num);
        }
        //finding same unique elements
        for(int num:nums2){
            if(set.contains(num)){
                res.add(num);
            }
        }
        //convert karenge hashset ko int[] me
        int[]ans=new int[res.size()];
        int i=0;
        for(int num:res){
            ans[i++]=num;
        }
        return ans;
    }
}