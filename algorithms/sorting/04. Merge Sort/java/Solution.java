import java.util.Arrays;

class Solution {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        long [] nums = {99, 9, 87, 0, -3, 1864, 32, 647};
        long[] sortedNums = mergeSort(nums);
        
        System.out.println(Arrays.toString(sortedNums));
    }
    
    public static long[] mergeSort(long arr[]){
        if(arr.length <= 1)
            return arr;
        int middle = arr.length/2;
        long left[] = mergeSort(Arrays.copyOfRange(arr, 0, middle));
        long right[] = mergeSort(Arrays.copyOfRange(arr, middle, arr.length));

        return merge(left, right);
    }

    public static long[] merge(long arr1[], long arr2[]){

        long mergedArray[] = new long[arr1.length + arr2.length];

        int i = 0;
        int j = 0;
        int mergedArrayPointer = 0;

        while(i < arr1.length && j < arr2.length){
            if(arr1[i] <= arr2[j]){
                mergedArray[mergedArrayPointer] = arr1[i];
                i++;            
            }else{
                mergedArray[mergedArrayPointer] = arr2[j];
                j++;
            }
            mergedArrayPointer++;
        }

        while(i < arr1.length){
            mergedArray[mergedArrayPointer] = arr1[i];
            i++;
            mergedArrayPointer++;
        }

        while(j < arr2.length){
            mergedArray[mergedArrayPointer] = arr2[j];
            j++;
            mergedArrayPointer++;
        }
        return mergedArray;
    }

}