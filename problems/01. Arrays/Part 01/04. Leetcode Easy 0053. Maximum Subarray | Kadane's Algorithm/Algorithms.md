### Brute Force Approach
Algorithm: Instead of calculating the sum of each subarray from scratch, keep a running sum of the subarray.

Time Complexity: O(n^2)

Space Complexity: O(1)

### Kadane’s Algorithm (Optimal)
Algorithm: Iterate through the array while keeping track of the maximum subarray sum ending at the current position. Update the global maximum if the current subarray sum is higher.

Time Complexity: O(n)

Space Complexity: O(1)

