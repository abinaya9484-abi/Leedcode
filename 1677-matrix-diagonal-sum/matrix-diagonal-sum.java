class Solution {
    public int diagonalSum(int[][] mat) {
        int m = mat.length;
        int n = mat[0].length - 1;
        int sum = 0;
        for (int i = 0; i < mat.length; i++) {
            // Primary diagonal
            sum += mat[i][i];
            // Secondary diagonal
            sum += mat[i][n--];
        }
        // Remove duplicate center element
        if (mat.length % 2 != 0)
            sum = sum - mat[m / 2][m / 2];
        return sum;
    }
}