class Solution {
    public void islandsAndTreasure(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        Queue<int[]> q = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (grid[i][j] == 0) {
                    q.offer(new int[] {i, j});
                }
            }
        }
        int d[][] = {{1, 0}, {0, 1}, {-1, 0}, {0, -1}};
        while (!q.isEmpty()) {
            int curr[] = q.poll();
            int x = curr[0];
            int y = curr[1];
            for (int i = 0; i < d.length; i++) {
                int nx = x + d[i][0];
                int ny = y + d[i][1];
                if (nx >= 0 && ny >= 0 && nx < n && ny < m) {
                    if (grid[nx][ny] > grid[x][y] + 1) {
                        grid[nx][ny] = grid[x][y] + 1;
                        q.offer(new int[] {nx, ny});
                    }
                }
            }
        }
    }
}
