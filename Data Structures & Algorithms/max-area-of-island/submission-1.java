class Solution {

    int[] xdir = {-1,1,0,0};
    int[] ydir = {0,0,-1,1};

    public int maxAreaOfIsland(int[][] grid) {
        int m = grid.length; int n = grid[0].length;
        int ans = 0;
        int[][] vis = new int[m][n];
        for(int i = 0 ; i < m; i++){
            for(int j = 0; j < n; j++){
                if(grid[i][j] == 1 && vis[i][j] == 0){
                    ans = Math.max(ans, dfs(grid,vis,i,j));   
                }
            }
        }
        return ans;
    }

    private int dfs(int[][] g, int[][] v, int x, int y){
        if(x < 0 || y < 0 || x >= g.length || y >= g[0].length) return 0;
        if(g[x][y] == 0 || v[x][y] == 1) return 0;
        v[x][y] = 1;
        int res = 1;
        for(int ij = 0; ij < 4; ij++){
            int xa = x+xdir[ij]; int ya = y+ydir[ij];
            res+=dfs(g,v,xa,ya);
        }
        return res;
    }

}
