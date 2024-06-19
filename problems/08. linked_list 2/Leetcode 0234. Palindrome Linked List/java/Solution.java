class ListNode {

  int val;
  ListNode next;

  ListNode() {}

  ListNode(int val) {
    this.val = val;
  }

  ListNode(int val, ListNode next) {
    this.val = val;
    this.next = next;
  }
}

class Solution {

  public boolean isPalindrome(ListNode head) {
    ListNode secondHalfOfList = getStartOfSecondHalf(head);

    ListNode reversedSecondHalfOfList = reverseLinkedList(secondHalfOfList);

    while (reversedSecondHalfOfList.next != null) {
      if (reversedSecondHalfOfList.val != head.val) return false;

      reversedSecondHalfOfList = reversedSecondHalfOfList.next;
      head = head.next;
    }

    return true;
  }

  private ListNode getStartOfSecondHalf(ListNode head) {
    ListNode slow = head;
    ListNode fast = head;

    while (fast.next != null && fast.next.next != null) {
      slow = slow.next;
      fast = fast.next.next;
    }

    return slow;
  }

  private ListNode reverseLinkedList(ListNode head) {
    ListNode prev = null;
    ListNode current = head;

    while (current != null) {
      ListNode next = current.next;
      current.next = prev;
      prev = current;
      current = next;
    }

    return prev;
  }
}
