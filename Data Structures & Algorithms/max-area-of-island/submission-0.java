class Solution {

    int[][] dir = {{1,0},{0,1},{-1,0},{0,-1}};

    public int maxAreaOfIsland(int[][] grid) {
        int r = grid.length;
        int c = grid[0].length;
        int ans = 0;
        for(int i = 0; i < r; i++){
            for(int j = 0; j < c; j++){
                if(grid[i][j] == 1){
                    //int count = 0;
                    int count = dfs(grid,i,j);
                    ans = Math.max(ans,count);
                }
            }
        }
        return ans;
    }

    private int dfs(int[][] grid, int i, int j){
        //count++;
        if(i<0 || i >= grid.length || j < 0 || j>=grid[0].length || grid[i][j] == 0) return 0;
        grid[i][j] = 0;
        int res = 1;
        for(int[] x : dir){
            res+=dfs(grid,x[0]+i,x[1]+j);
        }
        return res;
    }

}
