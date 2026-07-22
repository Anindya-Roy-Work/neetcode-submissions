class Solution {
    public int numIslands(char[][] grid) {
        
        int m = grid.length;
        int n = grid[0].length;
        int count = 0;        
        int[][] visited = new int[m][n];


        for(int i = 0 ; i < m; i++){
            for(int j = 0; j < n; j++){
                if(grid[i][j] == '1' && visited[i][j] == 0){
                    dfs(grid,visited,i,j,m,n);
                    count++;
                }
            }
        }
        return count;

    }

    void dfs(char[][] grid, int[][] visited, int x, int y, int m, int n){
        if(x >=m || x < 0 || y >= n || y < 0) return;
        if(grid[x][y] == '0') return;
        if(visited[x][y] == 1) return;
        visited[x][y] = 1;
        
        int[] xx = {0,0,1,-1};
        int[] yy = {1,-1,0,0};

        for(int i = 0; i < 4; i++){
            int x1 = x+xx[i];
            int y1 = y+yy[i];
            dfs(grid,visited,x1,y1,m,n);
        }

    }

}
