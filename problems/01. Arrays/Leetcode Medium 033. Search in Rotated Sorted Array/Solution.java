public class Solution {
    public static void main(String[] args) {
        int[] nums = {4,5,6,7,8,1,2,3};
        int target = 8;
        System.out.println(search(nums, target));
    }

    public static int search(int[] nums, int target) {
        int left = 0;
        int right = nums.length -1;

        while(left <= right){
            int mid = left + (right - left)/2;
            if(nums[mid] == target){
                return mid;
            }

            if(nums[mid] >= nums[left]){
                if(target >= nums[left] && target < nums[mid]){
                    right = mid -1;
                }else{
                    left = mid +1;
                }
            }else{
                if(target <= nums[right] && target > nums[mid]){
                    left = mid + 1;
                }else{
                    right = mid -1;
                }
            }
        }

        return -1;
    }
}
