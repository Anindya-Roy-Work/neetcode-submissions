class Solution {
    public int islandPerimeter(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int[][] visited = new int[m][n];

        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                if(grid[i][j] == 1)
                return dfs(i,j,grid,visited);
            }
        }
        return 0;

    }

    private int dfs(int x, int y, int[][] grid, int[][] vis){
        if(x < 0 || y < 0 || x >= grid.length || y >= grid[0].length)
        return 1;
        if(grid[x][y]==0) return 1;
        if(vis[x][y] == 1) return 0;
        vis[x][y] = 1;
        return dfs(x-1,y,grid,vis)+dfs(x,y-1,grid,vis)+dfs(x+1,y,grid,vis)+dfs(x,y+1,grid,vis);
    }

}