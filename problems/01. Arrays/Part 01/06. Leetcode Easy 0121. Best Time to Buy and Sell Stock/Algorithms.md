### 1. Brute Force Approach
Time Complexity: O(n^2)
Space Complexity: O(1)
Algorithm: Iterate through each pair of days, calculate the profit for each pair, and keep track of the maximum profit.

### 2. One Pass Approach
Time Complexity: O(n)
Space Complexity: O(1)
Algorithm: Track the minimum price as we iterate through the array. Calculate the profit for each day by subtracting the minimum price from the current price, and update the maximum profit if the current profit is higher.

### 3. Divide and Conquer Approach
Time Complexity: O(n log n)
Space Complexity: O(log n)