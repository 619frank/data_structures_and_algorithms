public class OptimalSolution202406 {
    public void setZeroes(int[][] matrix) {
        
        //  int[][] exampleMultiDimentionalArray = {
        //                                             {0, 1, 2, 0}, 
        //                                             {3, 4, 5, 2}, 
        //                                             {1, 3, 1, 5}
        //                                         };

        int rowLength = matrix.length;
        int colLength = matrix[0].length;
        
        int row0 = 1;

        // Use first Row and Column as markers
        for(int row = 0; row < rowLength; row++){
            for(int col = 0; col < colLength; col++){
                if(matrix[row][col] == 0){
                    // Marking the row which needs to turned to zero
                    matrix[0][col] = 0;
                    if(row > 0){
                        // Marking the column which needs to be zero
                        matrix[row][0] = 0;
                    }else{
                        // Marking the first column
                        row0 = 0;
                    }                    
                    
                }                
            }
        }

        // Set matrix elements to zero based on markers
        for(int row = 1; row < rowLength; row++){
            for(int col = 1; col < colLength; col++){
                if(matrix[0][col] == 0 || matrix[row][0] == 0){
                    matrix[row][col] = 0;
                }
            }
        }

        // Making the first col to zero if matrix[0][0] == 0
        if(matrix[0][0] == 0){
            for(int row = 0; row < rowLength; row++){
                matrix[row][0] = 0;
            }

        }
        
        // Making the first row to zero if row0 is 0
        if(row0 == 0){
            for(int col = 0; col < colLength; col++){
                matrix[0][col] = 0;
            }
        }        
    }
}
