import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution {
    public static void main(String[] args) {
        int[] arr = {4,3,1,1,3,3,2};
        int k = 3;
        System.out.println(findLeastNumOfUniqueInts(arr, k));
    }

    public static int findLeastNumOfUniqueInts(int[] arr, int k) {
        // Create a frequency counter
        Map<Integer, Integer> map = new HashMap<>();

        for(int num : arr){
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        // Sort the frequence counter
        List<Map.Entry<Integer, Integer>> elements = new ArrayList<>(map.entrySet());
        elements.sort((a, b) -> a.getValue() - b.getValue());

        for(Map.Entry<Integer, Integer> entry : elements){
            if(entry.getValue() <= k){                
                k -= entry.getValue();
                map.remove(entry.getKey());
            }else{
                break;
            }
        }
        return map.size();
    }
}
