class Solution {
    public int firstUniqueFreq(int[] nums) {
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int num:nums){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        HashMap<Integer,Integer>freq=new HashMap<>();
        for(int fre:map.values()){
            freq.put(fre,freq.getOrDefault(fre,0)+1);
        }
        for(int num:nums){
            int f=map.get(num);
            if(freq.get(f)==1)return num;
        }
        return -1;
    }
}