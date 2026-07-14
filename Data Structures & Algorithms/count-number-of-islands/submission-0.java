class Solution {
    private char[][] grid;
    private int rows, cols;
    private static final int[][] directions = {{1,0}, {-1,0}, {0,1}, {0,-1}};
    public int numIslands(char[][] grid) {
        int islandCount = 0;
        this.rows = grid.length;
        this.cols = grid[0].length;
        this.grid = grid;
        for(int i =0;i< rows;i++) {
            for(int j = 0;j< cols;j++) {
                if(grid[i][j] == '1') {
                    dfsRec(i,j);
                    islandCount++;
                }
            }
        
        }
        return islandCount;
    }

    private void dfsRec(int i,int j) {
        if(i < 0 || j < 0 || i >= rows || j >= cols || grid[i][j] == '0') {
            return ;
        }
    
        grid[i][j] = '0';
        for(int[] dir : directions) {
                dfsRec(i + dir[0], j + dir[1]);
        }
    }
}
