import java.util.Arrays;

public class SumZeroTwoPointer {
    public static void main(String[] args) {
        SumZeroTwoPointer sumZeroTwoPointer = new SumZeroTwoPointer();
        String result = Arrays.toString(sumZeroTwoPointer.sumZero(5));
        System.out.println(result);
    }
    
    public int[] sumZero(int n) {
        int[] result = new int[n];
        
        // Initialize pointers
        int left = 0;
        int right = n - 1;
        
        int num = 1;
        while (left < right) {
            result[left] = num;
            result[right] = -num;
            num++;
            left++;
            right--;
        }
        
        // If n is odd, the middle element should be 0, which is already handled by initialization
        
        return result;
    }
}
