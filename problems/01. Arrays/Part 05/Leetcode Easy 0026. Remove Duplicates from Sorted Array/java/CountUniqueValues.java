import java.util.Arrays;

public class CountUniqueValues {

    public static void main(String[] args) {
        CountUniqueValues countUniqueValues = new CountUniqueValues();
        // int[] nums = new int[] {1,1,1,1,1,2};
        int[] nums = new int[] {1,2,3,4,4,4,7,7,12,12,13};        
        int result = countUniqueValues.countUniqueValues(nums);
        System.out.println(result);

    }

    private int countUniqueValues(int [] nums){
        int uniqueValues = 1;
        
        // we are going to build up the unique values in the beginning
        int pointer_1 = 0;
        int pointer_2 = 1;
        while(pointer_2 < nums.length){
            if(nums[pointer_1] == nums[pointer_2]){                
                pointer_2++;
            }else{
                pointer_1++;
                nums[pointer_1] = nums[pointer_2];                
                pointer_2++;
                uniqueValues++;
            }
        }
        System.out.println(Arrays.toString(nums));
        return uniqueValues;        
    }
    
}

/*
 * 1, 1, 1, 2
 * p1, p2
 * 1, 1, 1, 2
 * p1,   p2
 * 1, 1, 1, 2
 * p1,      p2
 */