/*
 Time Complexity: O(n)
 Space Complexity: O(1)
 */
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val, Node next) {
        this.val = val;
        this.next = next;
        this.random = null;
    }
}


public class IterativeSolution {
    public Node copyRandomList(Node head) {
        if(head == null) return head;
    
        // Step 1 inserting the new nodes next to each of the current nodes
        Node current = head;
        while(current != null){
            Node newNode = new Node(current.val, current.next);
            current.next = newNode;
            current = newNode.next;
        }
        
        // Step 2 setting random
        current = head;
        while(current != null){
            if(current.random != null){
                current.next.random = current.random.next;
            }
            current = current.next.next;
        }

        // Step 3 removing the inserted new nodes
        current = head;
        Node newHead = current.next;

        while(current != null){
            Node newNode = current.next;
            current.next = newNode.next;
            if(newNode.next != null){
                newNode.next = newNode.next.next;
            }
            current = current.next;
        }
        return newHead;
    }
}
