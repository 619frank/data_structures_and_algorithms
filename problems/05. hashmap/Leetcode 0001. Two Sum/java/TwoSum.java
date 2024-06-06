import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public static void main(String[] args) {
        
        int[] nums = {2,7,11,15};
        int target = 9;

        int[] result = new int[2];
        Map<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i < nums.length; i ++){
            int complement = target - nums[i];
            if(map.containsKey(complement)){
                result[0] = map.get(complement);
                result[1] = i;
                break;
            }            
            map.put(nums[i], i);
        }
        
        System.out.println(Arrays.toString(result));
    }
}
