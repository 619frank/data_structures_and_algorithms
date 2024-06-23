public class OptimalSolution202406Easy {

    public void setZeroes(int[][] matrix) {
        
        int rowLength = matrix.length;
        int colLength = matrix[0].length;

        boolean firstRowContainsZero = false;        
        boolean firstColumnContainsZero = false;

        // Checking if there is any zero in first row
        for(int col = 0; col < colLength; col++){
            if(matrix[0][col] == 0){
                firstRowContainsZero = true;
                break;
            }
        }

        // Checking if there is any zero in first column
        for(int row = 0; row < rowLength; row++){
            if(matrix[row][0] == 0){
                firstColumnContainsZero = true;
                break;
            }
        }

        // Use the first row and column to mark zeroes
        for(int row = 1; row < rowLength; row++){
            for(int col = 1; col < colLength; col++){
                if(matrix[row][col] == 0){
                    matrix[0][col] = 0;
                    matrix[row][0] = 0;
                }
            }
        }
        
        // Set the cells to zero based on markers in the first row and column
        for(int row = 1; row < rowLength; row++){
            for(int col = 1; col < colLength; col++){
                if(matrix[0][col] == 0 || matrix[row][0] == 0){
                    matrix[row][col] = 0;
                }
            }
        }

        // Set the first row to zero if first row contains zero
        if(firstRowContainsZero){
            for(int col = 0; col < colLength; col++){
                matrix[0][col] = 0;
            }
        }

        // Set the first column as zero if the first column contains zero
        if(firstColumnContainsZero){
            for(int row = 0; row < rowLength; row++){
                matrix[row][0] = 0;
            }
        }

    }
}