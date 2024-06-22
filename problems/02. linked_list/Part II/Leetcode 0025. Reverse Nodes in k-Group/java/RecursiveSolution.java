class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}
 
public class RecursiveSolution {
    public ListNode reverseKGroup(ListNode head, int k) {

        int count = 0;
        ListNode node = head;
        while(node != null && count < k){
            node = node.next;
            count++;
        }

        if(count == k){
            ListNode reversed_head = reverseLinkedList(head, k);
            head.next = reverseKGroup(node, k);
            return reversed_head;
        }

        return head;
        
    }

    private ListNode reverseLinkedList(ListNode head, int k){
        ListNode prev = null;
        ListNode current = head;
        
        while(k > 0){
            ListNode next = current.next;
            current.next = prev; // 1 , null
            prev = current;
            current = next;
            k -= 1;
        }
        return prev;
    }
}