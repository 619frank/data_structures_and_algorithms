/*
 Time Complexity: O(m*n)
 Space Complexity: O(1)
 */
class OptimalSolution202402 {
    public void setZeroes(int[][] matrix) {
        
        int col0 = 1;
        int rowLength = matrix.length;
        int colLength = matrix[0].length;
        
        // Use First Row and Column as markers
        for(int i = 0; i < rowLength; i++){
            for(int j = 0; j < colLength; j++){
                if(matrix[i][j] == 0){
                    matrix[i][0] = 0;
                    
                    if(j != 0){
                        matrix[0][j] = 0;
                    }else{
                        col0 = 0;
                    }
                }
            }    
        }
        
        // Set matrix elements to zero based on markers
        for(int i = 1; i < rowLength; i++){
            for(int j = 1; j < colLength; j++){                
                if(matrix[i][j] != 0){
                    if(matrix[i][0] == 0 || matrix[0][j] == 0){
                        matrix[i][j] = 0;
                    }
                }
            }
        }
        
        //  Handle first row
        if(matrix[0][0] == 0){
            for(int i = 0; i < colLength; i++){
                matrix[0][i] = 0;
            }
        }
        
        // Handle first column
        if(col0 == 0){
            for(int i = 0; i< rowLength; i++){
                matrix[i][0] = 0;
            }
        }
        
    }
}