class Solution {

    private int[][] grid;
    int rows, cols;
    int[][] directions = {{1,0}, {-1,0}, {0,1}, {0,-1}};
    public int maxAreaOfIsland(int[][] grid) {
        this.grid = grid;
        rows = grid.length;
        cols = grid[0].length;
        int area = 0;
        for(int i =0;i< rows;i++) {
            for(int j =0; j < cols;j++) {
                    area = Math.max(area, dfsRec(i,j));
            }
        }
        return area;
    }

    private int dfsRec(int i, int j) {
        if(i<0 || j<0 || i>=rows || j >=cols || grid[i][j] == 0){
            return 0;
        }
        grid[i][j] = 0;
        int res = 1;
        for(int[] dir : directions) {
            res += dfsRec(i + dir[0], j + dir[1]);
        }

        return res;
    }
}
