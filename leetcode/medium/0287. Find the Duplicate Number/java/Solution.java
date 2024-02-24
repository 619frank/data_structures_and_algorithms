class Solution {
    public int findDuplicate(int[] nums) {
        
        Set<Integer> hashSet = new HashSet();
        int result = 0;
        for(int i = 0; i < nums.length; i++){
            if(!hashSet.contains(nums[i])){
                hashSet.add(nums[i]);
            }else{
                result = nums[i];
                break;
            }
        }
        return result;
    }
}