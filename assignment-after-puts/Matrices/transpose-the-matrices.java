class Solution {
    public int[][] transpose(int[][] matrix) {
        int[][] t = new int[matrix[0].length][matrix.length];
        int m = matrix.length;
        int n = matrix[0].length;
        for(int i = 0;i<m;i++)
        {
            for(int j = 0;j<n;j++){
              t[j][i] = matrix[i][j];
            }
        }
        return t;
    }
}