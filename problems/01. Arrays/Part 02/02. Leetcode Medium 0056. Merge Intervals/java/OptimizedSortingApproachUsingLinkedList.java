import java.util.Arrays;
import java.util.LinkedList;

public class OptimizedSortingApproachUsingLinkedList {
    public static void main(String[] args) {
        int[][] intervals = {{1,3},{2,6},{8,10},{15,18}};
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));

        LinkedList<int[]> mergedIntervals = new LinkedList<int[]>();

        for(int[]interval : intervals) {
            if(mergedIntervals.isEmpty() || mergedIntervals.getLast()[1] < interval[0]){
                mergedIntervals.add(interval);
            }else{
                mergedIntervals.getLast()[1] = Math.max(mergedIntervals.getLast()[1], interval[1]);
            }
        }

        int[][] arrayMergedIntervals = mergedIntervals.toArray(new int[mergedIntervals.size()][]);
        System.out.println(Arrays.deepToString(arrayMergedIntervals));
    }
}
