import java.util.Arrays;

class Solution {

    public static void main(String[] args) {
        
        int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
        // int[] nums = {-1};
        // To print just the sum
        System.out.println(maxSubArraySum(nums));

        // To print the actual subArray
        System.out.println(Arrays.toString(maxSubArray(nums)));
    }

    // To just get the maxSubArraySum
    public static int maxSubArraySum(int[] nums) {
        int maxSum = nums[0];
        
        int currentSum = 0;
        
        for(int i = 0; i < nums.length; i++){            
            if(currentSum < 0){
                currentSum = 0;
            }
            currentSum += nums[i];
            maxSum = Math.max(maxSum, currentSum);
        }
        
        return maxSum;
    }

    public static int[] maxSubArray(int[] nums){
        int maxSum = nums[0];
        int currentSum = 0;
        int start = 0;
        int end = 0;
        int tempStart = 0;
        for(int i = 0; i < nums.length; i++){
            if(currentSum < 0){
                currentSum = 0;
                tempStart = i;
            }

            currentSum += nums[i];
            if(currentSum > maxSum){
                maxSum = currentSum;
                start = tempStart;
                end = i;                
            }
        }
        System.out.println(maxSum);
        System.out.println("start: "+ start);
        System.out.println("end: "+ end);
        return Arrays.copyOfRange(nums, start, end+1);
    }
}