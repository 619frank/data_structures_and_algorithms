 public class ListNode {
     int val;
     ListNode next;
     ListNode(int x) {
         val = x;
         next = null;
     }
 }



/*
3. Two Pointer Technique
Approach:

Initialize two pointers, one for each linked list.
Move each pointer forward one step at a time.
When a pointer reaches the end of its list, redirect it to the head of the other list.
If the lists intersect, the pointers will meet at the intersection node after at most 

m+n steps.

If they do not intersect, both pointers will reach the end (None) simultaneously.
Time Complexity: O(m+n)

Space Complexity: O(1)
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        
        if(headA == null || headB == null){
            return null;
        }

        ListNode pointerA = headA;
        ListNode pointerB = headB;

        while (pointerA != pointerB){
            if(pointerA == null){
                pointerA = headB;                
            }else{
                pointerA = pointerA.next;
            }

            if(pointerB == null){
                pointerB = headA;                
            }else{
                pointerB = pointerB.next;
            }
        }

        return pointerA;
    }
}
