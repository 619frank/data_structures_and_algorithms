public class Solution {
    class ListNode {
        ListNode next;
        int value;
        ListNode(int value){
            this.value = value;
            this.next = null;
        }
    }
    
    public boolean hasCycle(ListNode head) {
        ListNode slowPointer = head;
        ListNode fastPointer = head;
        boolean flag = false;

        while(slowPointer != null && fastPointer != null && fastPointer.next != null){
            slowPointer = slowPointer.next;
            fastPointer = fastPointer.next.next;
            if(slowPointer == fastPointer){
                flag = true;
                break;
            }
        }
        return flag;
    }
}
