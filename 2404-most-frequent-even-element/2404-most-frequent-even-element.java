class Solution {
    public int mostFrequentEven(int[] nums) {
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int num:nums){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        int maxfre=0,ans=-1;
        for(int num:map.keySet()){
            if(num%2==0){
                int fre=map.get(num);
                if(fre>maxfre||(fre==maxfre&&num<ans)){
                    maxfre=fre;
                    ans=num;
                }
            }
        }
        return ans;
    }
}