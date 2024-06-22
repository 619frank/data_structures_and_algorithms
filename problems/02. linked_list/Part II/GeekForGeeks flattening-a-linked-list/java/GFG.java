/*
 * Algorithm
 * 1. create method called merge which will merge two sorted linked lists
 * 2. Recursively cally the merge method 
 * 
 * Time Complexity: O(N log n)
 * Space Complexity: The auxiliary space due to recursion is O(n)
 */
public class GfG {
    Node flatten(Node root)
    {
	// Your code here
    	if(root == null || root.next == null){
    	    return root;
    	}
    	
    	root.next = flatten(root.next);
    	return merge(root, root.next);
    	
    }
    
    
    Node merge(Node head1, Node head2){
        if(head1 == null) return head2;
        if(head2 == null) return head1;
        
        Node dummy = new Node(0);
        
        Node tail = dummy;
        
        while(head1 != null && head2 != null){
            if(head1.data <= head2.data){
                tail.bottom = head1;
                head1 = head1.bottom;
            }else{
                tail.bottom = head2;
                head2 = head2.bottom;
            }
            tail = tail.bottom;
        }
        
        if(head1 != null){
            tail.bottom = head1;
        }else{
            tail.bottom = head2;
        }
        return dummy.bottom;
    }
}