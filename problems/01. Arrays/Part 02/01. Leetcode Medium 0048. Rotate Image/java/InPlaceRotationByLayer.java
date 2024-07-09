import java.util.Arrays;

public class InPlaceRotationByLayer {
    public static void main(String[] args) {
        int[][] nums = {
            {1,2,3},
            {4,5,6},
            {7,8,9}
        };

        int left = 0;
        int right = nums.length -1;

        while (left < right) {
            for(int i = 0; i < (right - left); i++) {
                int top = left;
                int bottom = right;
                // save top left
                int topLeft = nums[top][left + i];

                // move bottom left to top left
                nums[top][left + i] = nums[bottom - i][left];

                // move top bottom right to bottom left
                nums[bottom - i ][left] = nums[bottom][right -i];

                // move top right to bottom right
                nums[bottom][right - i] = nums[top + i][right];

                // move top left to top right
                nums[top + i][right] = topLeft;
            }
            left++;
            right--;
        }
        System.out.println(Arrays.deepToString(nums));
    }
}
