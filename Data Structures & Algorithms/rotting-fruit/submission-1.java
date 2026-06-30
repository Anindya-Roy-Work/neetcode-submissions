class Solution {
    public int orangesRotting(int[][] grid) {
        int r = grid.length;
        int c = grid[0].length;

        Queue<int[]> q = new LinkedList<>();
        int fresh = 0; int time = 0;

        for(int i = 0; i < r; i++){
            for(int j = 0; j < c; j++){
                if(grid[i][j] == 1){
                    fresh++;
                }
                if(grid[i][j] == 2) q.offer(new int[]{i,j});
            }
        }

        int[][] dir = {{-1,0},{1,0},{0,1},{0,-1}};
        while(fresh > 0 && !q.isEmpty()){
            int len = q.size();
            for(int i = 0; i < len; i++){
                int[] cur = q.poll();
                for(int[]d : dir){
                    int row = d[0]+cur[0];
                    int col = d[1]+cur[1];
                    if(row >= 0 && row < r && col >= 0 && col < c){
                        if(grid[row][col] == 1){
                            grid[row][col] = 2;
                            q.offer(new int[]{row,col});
                            fresh--;
                        }
                    }
                }
            }
            time++;
        }
        return fresh > 0 ? -1:time;
    }
}
