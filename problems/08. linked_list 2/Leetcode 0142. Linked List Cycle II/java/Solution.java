class ListNode {
    int val;
    ListNode next;
    ListNode(int x) {
        val = x;
        next = null;
    }
}
 
public class Solution {
    public ListNode detectCycle(ListNode head) {
        
        ListNode slowPointer = head;
        ListNode fastPointer = head;

        while(fastPointer != null && fastPointer.next != null){
            slowPointer = slowPointer.next;
            fastPointer = fastPointer.next.next;
            if(slowPointer == fastPointer){                
                /* 
                    When slowPointer and fastPointer meet, it indicates that there is a cycle in the list. 
                    However, this meeting point is not necessarily the start of the cycle. 
                    Reset one of the pointers (slowPointer) to the head of the linked list.
                    Move both pointers one step at a time. The node at which they meet again will be the start of the cycle.
                */
                slowPointer = head;
                while(slowPointer != fastPointer){
                    slowPointer = slowPointer.next;
                    fastPointer = fastPointer.next;
                }
                return slowPointer;
            }
        }
        
        return null;
    }
}