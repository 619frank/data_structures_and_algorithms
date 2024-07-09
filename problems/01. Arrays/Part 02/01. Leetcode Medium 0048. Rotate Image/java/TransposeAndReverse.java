import java.util.Arrays;
public class TransposeAndReverse {
    public static void main(String[] args) {
        int[][] nums = {
            {1,2,3},
            {4,5,6},
            {7,8,9}
        };
        
        int rowLength = nums.length;
        int colLength = nums[0].length;

        // Transpose the multi-dimensional -> Transpose means simply change row to column and column to row
        /*{
            {1,4,7},
            {2,5,8},
            {3,6,9}
          }
         */
        for(int i = 0; i < rowLength; i++){
            for(int j = i+1; j < colLength; j++){
                int temp = nums[i][j];
                nums[i][j] = nums[j][i];
                nums[j][i] = temp;
            }
        }     
        
        for(int row = 0; row < rowLength; row++){
            reverse(nums[row]);
        }

        System.out.println(Arrays.deepToString(nums));
    }

    private static void reverse(int nums[]){
        int left = 0;
        int right = nums.length-1;

        while(left < right){
            int temp = nums[left];
            nums[left] = nums[right];
            nums[right] = temp;
            left++;
            right--;
        }
    }
}
