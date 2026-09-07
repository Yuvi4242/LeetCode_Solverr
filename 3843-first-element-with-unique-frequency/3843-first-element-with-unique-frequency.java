class Solution {
    public int firstUniqueFreq(int[] nums) {
        // HashMap<Integer,Integer>map=new HashMap<>();
        // for(int num:nums){
        //     map.put(num,map.getOrDefault(num,0)+1);
        // }
        // HashMap<Integer,Integer>freq=new HashMap<>();
        // for(int fre:map.values()){
        //     freq.put(fre,freq.getOrDefault(fre,0)+1);
        // }
        // for(int num:nums){
        //     int f=map.get(num);
        //     if(freq.get(f)==1)return num;
        // }
        // return -1;
        HashMap<Integer,Integer>map=new HashMap<>();
        HashMap<Integer,Integer>freq=new HashMap<>();
        for(int n:nums){
            map.put(n,map.getOrDefault(n,0)+1);
        }
        for(int m:map.values()){
            freq.put(m,freq.getOrDefault(m,0)+1);
        }
        for(int i=0;i<nums.length;i++){
            if(freq.get(map.get(nums[i]))==1)return nums[i];
        }
        return -1;
    }
}