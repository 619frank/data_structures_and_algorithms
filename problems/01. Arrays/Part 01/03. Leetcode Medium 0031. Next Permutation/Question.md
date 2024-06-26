Leetcode Medium 0031. Next Permutation
A permutation of an array of integers is an arrangement of its members into a sequence or linear order.  

For example, for arr = [1,2,3], the following are all the permutations of arr: [1,2,3], [1,3,2], [2, 1, 3], [2, 3, 1], [3,1,2], [3,2,1].  
The next permutation of an array of integers is the next lexicographically greater permutation of its integer. More formally, if all the permutations of the array are sorted in one container according to their lexicographical order, then the next permutation of that array is the permutation that follows it in the sorted container. If such arrangement is not possible, the array must be rearranged as the lowest possible order (i.e., sorted in ascending order).  

For example, the next permutation of arr = [1,2,3] is [1,3,2].  
Similarly, the next permutation of arr = [2,3,1] is [3,1,2].  
While the next permutation of arr = [3,2,1] is [1,2,3] because [3,2,1] does not have a lexicographical larger rearrangement.  
Given an array of integers nums, find the next permutation of nums.  

The replacement must be in place and use only constant extra memory.  

Example 1:  

Input: nums = [1,2,3]  
Output: [1,3,2]  
Example 2:  

Input: nums = [3,2,1]  
Output: [1,2,3]  
Example 3:  

Input: nums = [1,1,5]  
Output: [1,5,1]  

Constraints:  

1 <= nums.length <= 100  
0 <= nums[i] <= 100  

Hint:  https://www.youtube.com/watch?v=JDOXKqF60RQ -> Watch this to understand  
1. iterate from back and find the dip where n > n-1  
2. swap it with the immediate big number  -> again iterate from back and swap it when it is greater than n
2. reverse everything after n  

Example:  

2154300 -> here the dip is 5 -> 1  

output is 2300145  

Edge case -> if you couldn't able to find any dip then just reverse the list and return  