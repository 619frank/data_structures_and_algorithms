import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class PermutationsHeapsAlgorithm {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        // list.add(4);
        
        List<List<Integer>> result = generatePermutations(list);
        
        // Print the result
        for (List<Integer> perm : result) {
            System.out.println(perm);
        }
    }

    public static List<List<Integer>> generatePermutations(List<Integer> list) {
        List<List<Integer>> result = new ArrayList<>();
        int n = list.size();
        int[] indexes = new int[n];

        // Add the first permutation
        result.add(new ArrayList<>(list));
        int resultAddIteration = 1;
        int i = 0;
        while (i < n) {
            if (indexes[i] < i) {
                int swapIndex = (i % 2 == 0) ? 0 : indexes[i];
                swap(list, swapIndex, i);
                result.add(new ArrayList<>(list));
                indexes[i]++;
                i = 0;
                System.out.println("Result Adding iteration: " + resultAddIteration);
            } else {
                indexes[i] = 0;
                i++;
            }

            System.out.println("Iteration: "+ resultAddIteration+ " indexes: " + Arrays.toString(indexes) + " i: " +i);
            resultAddIteration++;
        }        
        return result;
    }

    private static void swap(List<Integer> list, int i, int j) {
        int temp = list.get(i);
        list.set(i, list.get(j));
        list.set(j, temp);
    }
}
