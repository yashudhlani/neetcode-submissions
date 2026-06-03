class Solution {
    private int[] directions = new int[]{0, 1, 0, -1, 0};

    private void bfs(char[][] grid, int i, int j) {
        Deque<int[]> queue = new ArrayDeque<>();
        queue.offer(new int[] {i, j});
        while(!queue.isEmpty()) {
            int size = queue.size();

            for (int num = size; num > 0; num--) {
                int[] node = queue.pop();
                grid[node[0]][node[1]] = '0';
                for (int k = 0; k < 4; k++) {
                    int r = node[0] + directions[k];
                    int c = node[1] + directions[k + 1];
                    if (r >= 0 && r < grid.length && c >=0 && c < grid[0].length && grid[r][c] == '1') {
                        queue.offer(new int[] {r, c});
                    }
                }
            }
        }
    }

    public int numIslands(char[][] grid) {
        int rows = grid.length;
        int cols = grid[0].length;

        int ans = 0;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (grid[i][j] == '1') {
                    bfs(grid, i, j);
                    ans++;
                }
            }
        }
        return ans;
    }
}
