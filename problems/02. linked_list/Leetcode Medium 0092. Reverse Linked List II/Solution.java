public class Solution {
    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
    
    public static void main(String args[]){

    }

    public ListNode reverseBetween(ListNode head, int left, int right) {
        if(head == null || head.next == null) 
            return head;
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode leftPrev = dummy;

        ListNode current = head;

        for(int i = 0; i < left -1; i++){
            leftPrev = leftPrev.next;
            current = current.next;
        }

        ListNode subListHead = current;
        ListNode previous = null;
        for(int i =0; i <= right - left; i++){
            ListNode next = current.next;
            current.next = previous;
            previous = current;
            current = next;
        }
        
        leftPrev.next = previous;
        subListHead.next = current;

        return dummy.next;
    }
}
