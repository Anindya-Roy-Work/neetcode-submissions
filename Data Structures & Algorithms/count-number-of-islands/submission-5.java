class Solution {

    int[] xarr = {-1,1,0,0};
    int[] yarr = {0,0,1,-1};

    public int numIslands(char[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int ans = 0;
        int[][]visited = new int[m+1][n+1];
        for(int i = 0 ; i < m; i++){
            for(int j = 0; j < n; j++){
                if(grid[i][j] == '1' && visited[i][j] == 0){
                    dfs(grid,visited,i,j);
                    ans++;
                }
            }
        }
        return ans;
    }

    private void dfs(char[][] grid, int[][] vis, int x, int y){
        vis[x][y] = 1;
        for(int i = 0; i < 4; i++){
            int xar = x+xarr[i];
            int yar = y+yarr[i];
            if(xar >= 0 && yar >= 0 && xar < grid.length && yar < grid[0].length
             && grid[xar][yar] == '1' && vis[xar][yar] == 0){
                dfs(grid,vis,xar,yar);
            }
        }
    }

}
