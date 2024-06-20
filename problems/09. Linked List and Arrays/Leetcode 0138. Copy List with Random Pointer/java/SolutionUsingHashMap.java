/*
 HashMap for Node Mapping
Step 1: Traverse the original list and create a copy of each node. 
        Store the mapping from original node to copied node in a HashMap.
Step 2: Traverse the original list again and use the HashMap to set the next
        and random pointers for the copied nodes.
Time Complexity: O(N), where N is the number of nodes in the linked list.
Space Complexity: O(N) for the HashMap that stores the node mapping.
 */
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}

public class SolutionUsingHashMap {
    public Node copyRandomList(Node head) {
        if(head == null) return head;
        
        Node current = head;

        Map<Node, Node> hashMap = new HashMap<>();

        while(current != null){
            Node copy = new Node(current.val);
            hashMap.put(current, copy);
            current = current.next;
        }

        current = head;

        while(current != null){
            Node copy = hashMap.get(current);
            copy.next = hashMap.get(current.next);
            copy.random = hashMap.get(current.random);
            current = current.next;
        }

        return hashMap.get(head);
    }
}