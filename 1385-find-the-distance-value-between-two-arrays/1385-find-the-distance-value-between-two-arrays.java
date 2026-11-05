class Solution {
    public int findTheDistanceValue(int[] arr1, int[] arr2, int d) {
        // int[]b=Arrays.copyOf(arr2,arr2.length+1);
        // b[arr2.length]=Integer.MAX_VALUE;
        // Arrays.sort(b);
        // Arrays.sort(arr1);
        // int cnt=0,j=0;
        // for(int a:arr1){
        //     while(b[j]<a-d) j++;
        //     if(b[j]>a+d) cnt++;
        // }
        // return cnt;
        int cnt=0;
        for(int i=0;i<arr1.length;i++){
            boolean valid=true;
            for(int j=0;j<arr2.length;j++){
                if(Math.abs(arr1[i]-arr2[j])<=d){
                    valid=false;
                    break;
                }
            }
            if(valid) cnt++;
        }
        return cnt;
    }
}