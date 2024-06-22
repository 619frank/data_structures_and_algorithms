class OptimalSolution {

    /*
     * Floyd Warshall solution
     */
    public int findDuplicate(int[] nums) {
        
        // OptimalSolution
        int slow = 0;
        int fast = 0;

        while(true){
            slow = nums[slow];
            fast = nums[nums[fast]];
            if(slow == fast){
                break;
            }
        }

        int slowedFast = 0;

        while(true){
            slow = nums[slow];
            slowedFast = nums[slowedFast];

            if(slow == slowedFast){
                break;
            }
        }

        return slow;
    }
}