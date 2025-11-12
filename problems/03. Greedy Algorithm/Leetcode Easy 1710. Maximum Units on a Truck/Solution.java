import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        int[][] boxTypes = {{5,10},{2,5},{4,7},{3,9}};
        System.out.println(maximumUnits(boxTypes, 10));
    }

    public static int maximumUnits(int[][] boxTypes, int truckSize) {
        Arrays.sort(boxTypes, (a, b) -> b[1] - a[1]);
        int totalUnits = 0;
        for(int[] box: boxTypes){
            int boxCount = box[0];
            int unitsPerBox = box[1];
            if(truckSize >= boxCount){
                totalUnits = totalUnits + (boxCount * unitsPerBox);
                truckSize -= boxCount;
            }else{
                totalUnits = totalUnits + (truckSize * unitsPerBox);
                break;
            }
        }
        return totalUnits;
    }
}
