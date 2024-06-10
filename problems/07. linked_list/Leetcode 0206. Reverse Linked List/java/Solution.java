class Solution {
    class ListNode {
        ListNode next;
        int value;
        ListNode(int value){
            this.value = value;
            this.next = null;
        }
    }

    public ListNode reverseList(ListNode head) {
        if(head == null || head.next == null) return head;

        ListNode current = head;
        ListNode previous = null;
        while(current != null){
            ListNode next = current.next; // next = 2, 3, 4, ...
            current.next = previous; // 1 -> null, 2 -> 1 -> null
            previous = current; // previous = 1 -> null
            current = next; // current = 2, 3, 4 ...
        }
        head = previous;
        return head;
    }
}