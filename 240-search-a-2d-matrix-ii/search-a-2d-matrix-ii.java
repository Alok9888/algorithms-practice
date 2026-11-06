class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int n = matrix.length;
        int m = matrix[0].length;
        int i = 0;
        int j = matrix[0].length - 1;

        while(i<n && j>=0){
            int mid = matrix[i][j];

            if(mid == target) return true;
            else if(mid < target) i++;
            else j--;
        }

        return false;
    }
}