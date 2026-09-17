class Solution {
    public int minSumOfLengths(int[] arr, int target) {
        int n=arr.length;
        int inf=n+1;
        int[]b=new int[n];
        Arrays.fill(b,inf);
        int l=0,sum=0,ans=inf,min=inf;
        for(int r=0;r<n;r++){
            sum+=arr[r];
            while(sum>target){
                sum-=arr[l++];
            }
            if(sum==target){
                int len=r-l+1;
                if(l>0&&b[l-1]!=inf){
                    ans=Math.min(ans,len+b[l-1]);
                }
                min=Math.min(min,len);
            }
            if(r>0)b[r]=Math.min(b[r-1],min);
            else b[r]=min;
        }
        return ans==inf?-1:ans;
    }
}