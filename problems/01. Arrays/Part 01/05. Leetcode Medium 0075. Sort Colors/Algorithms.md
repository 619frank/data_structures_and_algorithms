Problem Statement
Given an array nums with n objects colored red, white, or blue, sort them in-place so that objects of the same color are adjacent, with the colors in the order red, white, and blue.

Here, we will use the integers 0, 1, and 2 to represent the color red, white, and blue, respectively.

Solution Approaches
1. Brute Force (Counting Sort)
Approach:

Count the number of 0s, 1s, and 2s in the array.
Overwrite the array with the counted number of 0s, followed by 1s, and then 2s.
Time Complexity: O(n)
Space Complexity: O(1)

Steps:

Initialize counters for 0s, 1s, and 2s.
Traverse the array and update the counters.
Rewrite the array based on the counters.


2. One-Pass Algorithm (Dutch National Flag)
Approach:
Use three pointers: low, mid, and high.

low to track the position for 0s.
mid to track the current element.
high to track the position for 2s.
Time Complexity: O(n)
Space Complexity: O(1)

Steps:

Initialize low to 0, mid to 0, and high to n - 1.
Traverse the array with mid:
If nums[mid] is 0, swap nums[low] and nums[mid], increment both low and mid.
If nums[mid] is 1, just increment mid.
If nums[mid] is 2, swap nums[mid] and nums[high], decrement high.