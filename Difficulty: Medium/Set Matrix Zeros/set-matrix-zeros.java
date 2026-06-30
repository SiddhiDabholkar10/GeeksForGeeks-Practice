class Solution {
    public void setMatrixZeroes(int[][] matrix) {
        // code here
        int col0=matrix[0][0];
        int row_l = matrix.length;
        int col_l = matrix[0].length;
        for(int i=0;i<row_l;i++){
            for(int j=0;j<col_l;j++){
                if(matrix[i][j] == 0){
                    matrix[i][0] = 0;
                    if(j!=0){
                    matrix[0][j] = 0;
                }
                    else{
                        col0=0;
                    }
                }
                
            }
        }
        for(int i=1;i<row_l;i++){
            for(int j=1;j<col_l;j++){
                if(matrix[0][j] == 0 || matrix[i][0] == 0){
                    matrix[i][j] = 0;
                }
            }
        }
        if(matrix[0][0] == 0){
            for(int j=0;j<col_l;j++){
                matrix[0][j] = 0;
            }
        }
        if(col0==0){
            for (int i = 0; i < row_l; i++){
                matrix[i][0] = 0;
            }
        }
    }
}