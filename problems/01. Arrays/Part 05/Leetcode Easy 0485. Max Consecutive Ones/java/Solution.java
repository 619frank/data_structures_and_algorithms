public class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        
        int max = 0;
        int tempMax = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] == 1){
                tempMax += 1;
                max = Math.max(tempMax, max);
            }else{
                tempMax = 0;
            }
        }
        return max;
    }
}