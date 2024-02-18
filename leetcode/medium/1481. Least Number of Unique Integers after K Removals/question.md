Given an array of integers arr and an integer k. Find the least number of unique integers after removing exactly k elements.  

 

Example 1:  

Input: arr = [5,5,4], k = 1  
Output: 1  
Explanation: Remove the single 4, only 5 is left.  
Example 2:  
Input: arr = [4,3,1,1,3,3,2], k = 3  
Output: 2  
Explanation: Remove 4, 2 and either one of the two 1s or three 3s. 1 and 3 will be left.  
 

Constraints:  

1 <= arr.length <= 10^5  
1 <= arr[i] <= 10^9  
0 <= k <= arr.length  


## Hint  
Imagine you have a bunch of numbers written down in a list (that's your array of integers).  
Now, someone tells you to pick out some numbers from that list, but you can only take away a certain number of them (that's your k).  
Your task is to figure out how to take away numbers so that you end up with the fewest different numbers left in your list.  
So, basically, you're trying to minimize the number of different numbers you have in your list after removing some.  

In order to achieve that we have to keep the numbers with maximum duplicates  