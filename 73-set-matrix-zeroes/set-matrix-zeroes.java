class Solution {
    public void setZeroes(int[][] matrix) {
        int n = matrix.length;
        int m = matrix[0].length;
        boolean firstRowHasZero = false;
        boolean firstColHasZero = false;

        for(int j=0; j<m; j++){
            if(matrix[0][j] == 0){
                firstRowHasZero = true;
            }
        }

        for(int i=0; i<n; i++){
            if(matrix[i][0] == 0){
                firstColHasZero = true;
            }
        }


        for(int i=1; i<n; i++){
            for(int j=1; j<m; j++){
                if(matrix[i][j] == 0){
                    matrix[0][j] = 0;
                    matrix[i][0] = 0;
                }
            }
        }
        
        for(int fr = 1; fr<m; fr++){
            if(matrix[0][fr] == 0){
                for(int j=1; j<n; j++){
                    matrix[j][fr] = 0;
                }
            }
        }

        for(int fc = 1; fc<n; fc++){
            if(matrix[fc][0] == 0){
                for(int j=0; j<m; j++){
                    matrix[fc][j] = 0;
                }
            }
        }

        if(firstRowHasZero){
            for(int i=0; i<m; i++){
                matrix[0][i] = 0;
            }
        }

        if(firstColHasZero){
            for(int j=0; j<n; j++){
                matrix[j][0] = 0;
            }
        }
    }
}