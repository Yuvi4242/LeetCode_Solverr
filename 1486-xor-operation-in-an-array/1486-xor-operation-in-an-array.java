class Solution {
    public int xorOperation(int n, int start) {
        int []arr= new int[n];
        int ans=start;
        for(int i=0;i<n;i++){
            arr[i]=start;
            start+=2;
        }
        for(int i=1;i<n;i++){
            ans^=arr[i];
        }
        return ans;
    }
}