// Use 1st row/col as marker
//Step 1: check 1st row/col has zero -> save in flags
//Step 2: mark -> if `matrix[i][j]==0`, mark `matrix[0][j]=0`, `matrix[i][0]=0`
//Step 3: zero inner matrix using markers
//Step 4: zero 1st row/col at end from flags
//Don't use `matrix[0][0]` for zeroing - it zeroes the marking row and column

class Solution {
    public void setZeroes(int[][] matrix) {
        int n = matrix.length;
        int m = matrix[0].length;

        boolean firstRowHasZero = false;
        boolean firstColHasZero = false;

        // Step 1: Check if first row and column contain zero
        for (int j = 0; j < m; j++) {
            if (matrix[0][j] == 0) firstRowHasZero = true;
        }

        for (int i = 0; i < n; i++) {
            if (matrix[i][0] == 0) firstColHasZero = true;
        }

        // Step 2: Mark corresponding rows and columns
        for (int i = 1; i < n; i++) {
            for (int j = 1; j < m; j++) {
                if (matrix[i][j] == 0) {
                    matrix[0][j] = 0;
                    matrix[i][0] = 0;
                }
            }
        }

        // Step 3: Zero marked columns
        for (int fr = 1; fr < m; fr++) {
            if (matrix[0][fr] == 0) {
                for (int j = 1; j < n; j++) {
                    matrix[j][fr] = 0;
                }
            }
        }

        // Zero marked rows
        for (int fc = 1; fc < n; fc++) {
            if (matrix[fc][0] == 0) {
                for (int j = 0; j < m; j++) {
                    matrix[fc][j] = 0;
                }
            }
        }

        // Step 4: Zero first row and column if originally required
        if (firstRowHasZero) {
            for (int i = 0; i < m; i++) matrix[0][i] = 0;
        }

        if (firstColHasZero) {
            for (int j = 0; j < n; j++) matrix[j][0] = 0;
        }
    }
}