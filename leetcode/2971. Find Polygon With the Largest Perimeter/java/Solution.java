import java.util.Arrays;
class Solution {

    public static void main(String[] args) {
        int[] a = {1,12,1,2,5,50,3};
        System.out.println(new Solution().largestPerimeter(a));
    }

    public long largestPerimeter(int[] nums) {
        
        Arrays.sort(nums);
        System.out.println(Arrays.toString(nums));
        
        long sum = 0;

        for(int i : nums) {
            sum += i;
        }

        for(int i = nums.length - 1; i >= 2; i--){
            long minusSum = sum - nums[i];            
            if(minusSum > nums[i]){
                return sum;
            }else{
                sum = minusSum;
            }
        }
        return -1;
    }
}