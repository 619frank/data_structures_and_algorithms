Given a string s, return the longest palindromic substring in s.  

 

Example 1:  

Input: s = "babad"  
Output: "bab"  
Explanation: "aba" is also a valid answer.  
Example 2:  

Input: s = "cbbd"  
Output: "bb"  
 

Constraints:  

1 <= s.length <= 1000  
s consist of only digits and English letters.  

Hint:  
There are three ways to solve it  
1. O(n3) -> for each of all the substring see if its palindrome or not  
2. O(n2) -> Expand From middle Approach -> Check Nick White's video  
3. O(n) -> Manacher's Algorithm -> Very hard  