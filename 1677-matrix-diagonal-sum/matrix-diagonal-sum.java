public class Solution {
    public int diagonalSum(int[][] mat) {
        int n = mat.length;
        int totalSum = 0;

        for (int i = 0; i < n; i++) {
            // Add primary diagonal element
            totalSum += mat[i][i];

            // Add secondary diagonal element
            totalSum += mat[i][n - 1 - i];
        }

        // If 'n' is odd, the middle element was counted twice; subtract it once
        if (n % 2 != 0) {
            totalSum -= mat[n / 2][n / 2];
        }

        return totalSum;
    }
}