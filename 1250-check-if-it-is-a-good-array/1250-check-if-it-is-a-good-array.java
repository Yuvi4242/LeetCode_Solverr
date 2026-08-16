class Solution {
    public boolean isGoodArray(int[] nums) {
        int gcd=nums[0];
        for(int num:nums){
            gcd=fn(gcd,num);
            if(gcd==1)return true;
        }
        return false;
    }
    private int fn(int a,int b){
        while(b!=0){
            int temp=a%b;
            a=b;
            b=temp;
        }
        return a;
    }
}