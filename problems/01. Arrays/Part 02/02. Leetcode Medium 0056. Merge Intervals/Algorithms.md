### 1. Sorting Approach
Sort Intervals:
* Sort the intervals based on their start times using a comparator.
Initialize:
* Create a list to store the merged intervals.
* Start with the first interval as the current interval to merge.

Loop through Sorted Intervals:
* For each interval, check if it overlaps with the current interval:
  * If it overlaps, merge them by updating the end of the current interval to the maximum end of both intervals.
  * If it doesn't overlap, add the current interval to the list of merged intervals and update the current interval to the next interval.
Add Last Interval:
* After the loop, add the last current interval to the list of merged intervals.
Return Result:
* Convert the list of merged intervals to an array and return it.

Time Complexity: O(n log n)
Space Complexity: O(n)

### 2. Optimized Sorting Approach Using LinkedList
Sort Intervals:
* Sort the intervals based on their start times using a comparator.

Initialize:
* Create a LinkedList to store the merged intervals.

Loop through Sorted Intervals:
* For each interval, check if it overlaps with the last interval in the LinkedList:
  * If it overlaps, merge them by updating the end of the last interval in the LinkedList to the maximum end of both intervals.
  * If it doesn't overlap, add the interval to the LinkedList.
Return Result:
* Convert the LinkedList of merged intervals to an array and return it.
Time Complexity: O(n log n)
Space Complexity: O(n)