Approach 1: Brute Force
  1. Think of a pendulum
  2. Iterate throuh the array
  3. caluculate left max and right max
  4. take the minimum of left max and right max
  5. subtract it from current value
  6. Add it to the result

Time Complexity: O(n{2})
Space Complexity: O(1)

Approach 2: Extra Space Complexity
  1. create two new array for calculating the left max and right max for each of the nodes -> two while loops
  2. iterate through the array and take the minimm of left max and right max
  3. subtract it from current value
  4. Add it to the result

Time Complexity: O(3n)
Space Complexity: O(2n)

Approach 3: Two Pointers
Use two pointers to scan from both ends of the elevation map towards the center.

Algorithm:

  1. Initialize two pointers, left and right, at the start and end of the array respectively.
  2. Initialize two variables, left_max and right_max, to keep track of the maximum heights encountered so far from the left and right.
  3. Iterate until the two pointers meet:
    * Compare the heights at the two pointers.
    * If the height at the left pointer is less than or equal to the height at the right pointer:
      * If the height at the left pointer is greater than or equal to left_max, update left_max.
      * Else, add left_max - height[left] to the water.
      * Move the left pointer to the right.
    * Else:
      * If the height at the right pointer is greater than or equal to right_max, update right_max.
      * Else, add right_max - height[right] to the water.
      * Move the right pointer to the left.

Time Complexity: O(n)
Space Complexity: O(1)
