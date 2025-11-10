public class Solution {
    public static void main(String[] args) {
        int target = 1;

        int[] nums = {1,2,4,5};
        System.out.println(binarySearch(nums, 4));
    }

    public static int binarySearch(int[] nums, int target){
        int left = 0;
        int right = nums.length-1;

        while(left <= right){
            int mid = left + (right - left)/2;
            if(nums[mid] == target){
                return mid;
            }

            if(target < nums[mid]){
                right = mid-1;
            } else{
                left = mid+1;
            }
            
        }
        return -1;
    }
}
