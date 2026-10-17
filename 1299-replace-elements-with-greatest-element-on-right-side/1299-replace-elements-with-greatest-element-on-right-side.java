class Solution {
    public int[] replaceElements(int[] arr) {
        int n=arr.length;
        int mx=-1;
        for(int i=n-1;i>=0;i--){
            int curr=arr[i];
            arr[i]=mx;
            if(curr>mx) mx=curr;
        }
        return arr;
    }
}