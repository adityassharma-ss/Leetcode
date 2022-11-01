class Solution {
    public int[] findBall(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        
        int[] ans = new int[n];
        
        for (int i = 0; i < n; i++) {
            int row = 0, col = i;
            
            while (row < m) {
                int currentCell = grid[row][col];
                col += currentCell;
                
                if (col < 0 || col >= n || grid[row][col] != currentCell) {
                    col = -1;
                    break;
                }
                
                row++;
            }
            
            ans[i] = col;
        }
        
        return ans;
    }
}
