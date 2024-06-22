class Solution {
    public void nextPermutation(int[] nums) {
        int dipIndex = -1;
        
        // We are starting with nums.length -2 just o avoid index out of bounds
        for(int i = nums.length -2; i >= 0; i--){
            if(nums[i] < nums[i+1]){
                dipIndex = i;
                break;
            }
        }
        
        // No dips found, so just reverse the nums and return
        if(dipIndex == -1){
            reverse(nums, 0, nums.length-1);
        }else{
            // Swap the index of the dip with the next big num you find from the last
            for(int i = nums.length -1; i > dipIndex; i--){
                if(nums[i] > nums[dipIndex]){
                    int temp = nums[dipIndex];
                    nums[dipIndex] = nums[i];
                    nums[i] = temp;
                    break;
                }
            }

            reverse(nums, dipIndex + 1, nums.length -1);
        }
    }
    
    public static void reverse(int[] nums, int start, int end){
        
        while(start < end){
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }
}