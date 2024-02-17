import java.util.Arrays;
import java.util.Collections;

public class Solution {
    public static void main(String[] args){
        int[] a = {8, 21, 9, 1, 84, 3};

        Arrays.sort(a);
        
        Integer[] arr = {3, 1, 4, 1, 5, 9, 2, 6};
        Arrays.sort(arr, Collections.reverseOrder());

        System.out.println(Arrays.toString(a));
    }
}
