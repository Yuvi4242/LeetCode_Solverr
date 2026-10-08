class Solution {
    public int reachNumber(int target) {
        int sum=0,st=0;
        if(target==0)return 0;
        target=Math.abs(target);
        while(sum<target){
            sum+=st;
            st++;
        }
        while(((sum-target)%2!=0)){
            sum+=st;
            st++;
        }
        return st-1;
    }
}