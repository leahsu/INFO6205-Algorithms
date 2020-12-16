package edu.northeastern.Leahsu;

/*Q8
Given a 2d grid map of '1's (land) and '0's (water), count the number of islands. An island is surrounded by water and is formed by connecting adjacent lands horizontally or vertically. You may assume all four edges of the grid are all surrounded by water.
*/

public class numIslands {

        public int numIslands(char[][] grid) {

            if(grid == null) {
                return 0;
            }
            int cnt = 0;
            for (int i = 0; i < grid.length; i++) {
                for (int j = 0; j < grid[0].length; j++) {
                    if (grid[i][j] == '0') {
                        continue;
                    }
                    cnt++;
                    clearIsland(grid, grid.length, grid[0].length,  i, j);
                }
            }
            return cnt;
        }

    private void clearIsland(char[][] grid, int x, int y, int i, int j) {
        if(i < 0 || j < 0 || i == x || j == y || grid[i][j] == '0') {
            return;
        }
        grid[i][j] = '0';
        clearIsland(grid, x, y, i, j + 1);
        clearIsland(grid, x, y, i + 1, j);
        clearIsland(grid, x, y, i - 1, j);
        clearIsland(grid, x, y, i, j - 1);
    }

}
