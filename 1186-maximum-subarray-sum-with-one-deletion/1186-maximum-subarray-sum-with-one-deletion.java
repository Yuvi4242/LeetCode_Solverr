class Solution {
    public int maximumSum(int[] arr) {
        int nodel=arr[0];
        int onedel=Integer.MIN_VALUE;
        int res=arr[0];
        for(int i=1;i<arr.length;i++){
           int  prevnodel=nodel;
           int  prevonedel=onedel;
           nodel=Math.max(nodel+arr[i],arr[i]);
           int v2;
           if(prevonedel==Integer.MIN_VALUE){
            v2=arr[i];
           }
           else {
            v2=prevonedel+arr[i];
           }
           onedel=Math.max(v2,prevnodel);
           res=Math.max(res,Math.max(onedel,nodel));
        }
        return res;
    }
}