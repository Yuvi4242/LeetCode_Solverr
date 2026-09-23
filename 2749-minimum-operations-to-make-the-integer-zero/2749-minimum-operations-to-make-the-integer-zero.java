class Solution {
    public int makeTheIntegerZero(int num1, int num2) {
        for(long k=1;k<=60;k++){
            long target=num1-k*(long)num2;

            if(target<0) break;
            
            if(Long.bitCount(target)<=k &&  k<=target) return (int)k;
        }
        return -1;
    }
}