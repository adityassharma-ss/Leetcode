class Solution {
    public int longestIncreasingPath(int[][] matrix) {
        if (matrix == null || matrix.length == 0) {
            return 0;
        }
        int rows = matrix.length;
        int cols = matrix[0].length;
        int[][] cache = new int[rows][cols];
        int longestPath = 0;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                longestPath = Math.max(longestPath, dfs(matrix, i, j, cache));
            }
        }
        return longestPath;
    }
    
    public int dfs(int[][] matrix, int i, int j, int[][] cache){
        if(cache[i][j] != 0){
            return cache[i][j];
        }
        
        int rows = matrix.length;
        int cols = matrix[0].length;
        
        int max=1;
        
        if (i > 0 && matrix[i - 1][j] > matrix[i][j]) {
            max = Math.max(max, 1 + dfs(matrix, i - 1, j, cache));
        }
        if (i < rows - 1 && matrix[i + 1][j] > matrix[i][j]) {
            max = Math.max(max, 1 + dfs(matrix, i + 1, j, cache));
        }
        if (j > 0 && matrix[i][j - 1] > matrix[i][j]) {
            max = Math.max(max, 1 + dfs(matrix, i, j - 1, cache));
        }
        if (j < cols - 1 && matrix[i][j + 1] > matrix[i][j]) {
            max = Math.max(max, 1 + dfs(matrix, i, j + 1, cache));
        }
        cache[i][j] = max;
        return max;
    }
}
