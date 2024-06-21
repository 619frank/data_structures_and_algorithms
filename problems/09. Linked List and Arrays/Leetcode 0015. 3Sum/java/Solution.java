/*
Two Pointers after Sorting
Algorithm:
1. Sort the array.
2. Iterate through the array, fixing one element and using two pointers to find pairs that sum up to the negative of the fixed element.
3. Skip duplicate elements to ensure unique triplets.
Time Complexity: O(n square)
Space Complexity: O(1) (ignoring the space required for the output)
*/
public class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        // Sort the array
        Arrays.sort(nums);

        List<List<Integer>> result = new ArrayList<List<Integer>>();

        for(int i = 0; i < (nums.length -2); i++){
            if(i > 0 && nums[i] == nums[i-1]){
                // Skip duplicates
                continue;
            }                

            int left = i + 1;
            int right = nums.length - 1;
            while(left < right){
                int total = nums[i] + nums[left] + nums[right];
                if(total == 0){
                    List<Integer> pair = new ArrayList<Integer>();
                    pair.add(nums[i]);
                    pair.add(nums[left]);
                    pair.add(nums[right]);
                    result.add(pair);

                    while(left < right && nums[left] == nums[left+1]){
                        // Skip duplicates
                        left += 1;
                    }

                    while(left < right && nums[right] == nums[right-1]){
                        // Skip duplicates
                        right -=1;
                    }
                    left +=1;
                    right -=1;
                }else if (total < 0){
                    left += 1;
                }else{
                    right -= 1;
                }
            }
        }
        return result;
    }
}