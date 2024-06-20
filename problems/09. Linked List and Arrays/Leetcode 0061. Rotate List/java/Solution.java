/*
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */

 /*
   Algorithm:
    1. Compute the length of the list n.
    2. Compute k = k % n to handle cases where k is larger than n.
    3. Use two pointers, fast and slow, both starting at the head.
    4. Move the fast pointer k steps ahead.
    5. Move both fast and slow pointers one step at a time until fast reaches the end of the list.
    6. The slow pointer will be at the new tail position.
    7. Adjust the links to set the new head and break the circular connection.
*/

class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}
 
public class Solution {
    public ListNode rotateRight(ListNode head, int k) {

        if(head == null || head.next == null || k == 0) return head;
        
        // Compute the length of the list
        int length = 0;
        ListNode current = head;
                
        while(current != null){
            current = current.next;
            length++;
        }
        
        // Compute the effective number of rotations
        k = k % length;                
        
        if(k == 0) return head;        
        
        // Initialize two pointers
        ListNode fast = head;
        ListNode slow = head;
        
        // Move the fast pointer k steps ahead
        for(int i = 0; i < k; i++){
            fast = fast.next;
        }

        // Move both pointers until fast reaches the end
        while(fast.next != null){
            slow = slow.next;
            fast = fast.next;
        }

        // slow is now at the new tail, fast is at the old tail
        ListNode new_head = slow.next;
        slow.next = null;
        fast.next = head;

        return new_head;
    }
}