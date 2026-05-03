class Solution {
    private void dfs(char[][] grid, int sr, int sc){
        int rows = grid.length;
        int cols = grid[0].length;

        if(sr < 0 || sr >= rows || sc < 0 || sc >= cols || grid[sr][sc] != '1'){
            return;
        }

        if(grid[sr][sc] == '1') {
            grid[sr][sc] = '0';
        }

        dfs(grid, sr+1, sc);
        dfs(grid, sr-1, sc);
        dfs(grid, sr, sc+1);
        dfs(grid, sr, sc-1);

    }

    public int numIslands(char[][] grid) {
        int rows = grid.length;
        int cols = grid[0].length;
        int count = 0;
        for(int i = 0; i<rows; i++){
            for(int j = 0; j<cols; j++){
                if(grid[i][j] == '1'){
                    count++;
                    dfs(grid, i, j);
                }
            }
        }

        return count;
    }
}