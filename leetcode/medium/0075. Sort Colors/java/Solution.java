import java.util.Arrays;

class Solution {

    public static void main(String[] args){
        // int nums[] = {2,0,2,1,1,0};
        int nums[] = {1, 2, 0};
        sortColors(nums);
        System.out.println(Arrays.toString(nums));
    }

    public static void sortColors(int[] nums) {
        int low = 0;
        int mid = 0;
        int high = nums.length -1;

        System.out.println("Before start");
        while(mid <= high){
            if(nums[mid] == 0){
                int temp = nums[mid]; // 0
                nums[mid] = nums[low]; // num[1] = 0
                nums[low] = temp; // num[0] = 0
                low++;
                mid++;
            }else if(nums[mid] == 1){                
                mid++;
            }else if(nums[mid] == 2){
                int temp = nums[mid]; // 2 // 2 
                nums[mid] = nums[high]; // nums[0] = 0 // num[2] = 1
                nums[high] = temp; // nums[5] = 0 // num [4] = 2
                high--;
            }
            System.out.println(nums);
        }
    }
}