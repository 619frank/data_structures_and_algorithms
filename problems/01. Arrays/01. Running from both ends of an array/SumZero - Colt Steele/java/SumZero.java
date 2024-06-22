import java.util.Arrays;

public class SumZero {
    public static void main(String[] args) {
        // int[] nums = {-3, -2, -1, 0, 1, 3, 2, 3};
        int[] nums = {-4,-3,-2,-1,0,1,2,3,10};

        int left = 0;
        int right = nums.length - 1;
        int[] result = new int[2];

        while(left < right){
            int sum = nums[left] + nums[right];
            if(sum == 0){
                result[0] = nums[left];
                result[1] = nums[right];
                break;
            }else if(sum > 0){
                right--;
            }else if(sum < 0){
                left++;
            }
        }
        System.out.println(Arrays.toString(result));
    }
}
