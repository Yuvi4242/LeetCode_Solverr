class Solution {
    public List<List<Integer>> shiftGrid(int[][] grid, int k) {
        for(int i=0;i<k;i++){
            OneShift(grid);
        }
    List<List<Integer>> list = new ArrayList<>();
    for (int[] row : grid) {
         List<Integer> temp = new ArrayList<>();
        for (int num : row) {
            temp.add(num);
    }
    list.add(temp);
    }
    return list;
    }
    public void OneShift(int[][]grid){
        int m=grid.length;
        int n=grid[0].length;
        int prev=grid[m-1][n-1];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                int curr=grid[i][j];
                grid[i][j]=prev;
                prev=curr;
            }
        }
    }
}