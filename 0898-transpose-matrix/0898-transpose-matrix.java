class Solution {
    public int[][] transpose(int[][] A) {
        int rows = A.length;
        int columns = A[0].length;

        int[][] new_matrix = new int [columns][rows];
        for(int i = 0; i<rows; i++){
            for(int j=0; j<columns; j++){
                new_matrix[j][i] = A[i][j];
            }
        }
        return new_matrix;
    }
}