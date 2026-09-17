class Solution {
    public boolean findRotation(int[][] mat, int[][] target) {
        int n=mat.length;
        for(int r=0;r<4;r++){
           if(same(mat,target))return  true;
           rotate(mat);
        }
        return false;
    }
    public boolean same(int[][]mat,int[][]target){
        int n=mat.length;
        for(int i=0;i<n;i++){
           for(int j=0;j<n;j++){
            if(mat[i][j]!=target[i][j])return false;
           }
        }
        return true;
    }
     public void rotate(int[][] matrix) {
        int n=matrix.length;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                int temp=matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i]=temp;
            }
        }

        for(int i=0;i<n;i++){
            int l=0,r=matrix.length-1;
            while(l<r){
                int temp=matrix[i][l];
                matrix[i][l]=matrix[i][r];
                matrix[i][r]=temp;
                l++;
                r--;
            }
        }
    }
}