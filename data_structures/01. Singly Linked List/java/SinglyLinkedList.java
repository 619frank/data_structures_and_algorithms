class Node {
    Node next;
    int value;
    Node(int value){
        this.value = value;
        this.next = null;
    }
}

public class SinglyLinkedList {
    
    Node head;
    Node tail;
    int length;

    SinglyLinkedList(){
        this.head = null;
        this.tail = null;
        this.length = 0;
    }

    private Node push(int value){                
        Node newNode = new Node(value);
        if(this.head == null){
            this.head = newNode;
            this.tail = newNode;
        }else{
            this.tail.next = newNode;
            this.tail = newNode;
        }                
        this.length++;
        return this.head;
    }

    private Node pop(){
        if(this.head == null){
            return this.head;
        }

        Node currentNode = this.head;
        
        if(this.length == 1){
            this.head = null;
            this.tail = null;
            this.length--;
            return currentNode;
        }

        Node newTail = currentNode;
        while(currentNode.next != null){
            newTail = currentNode;
            currentNode = currentNode.next;            
        }

        newTail.next = null;
        this.tail = newTail;
        
        this.length--;
        return currentNode;
    }

    private Node shift(){
        if(this.length == 0) return null;

        if(this.length == 1){
            return this.pop();
        }

        Node oldHead = this.head;
        this.head = oldHead.next;

        oldHead.next = null;
        this.length--;
        return oldHead;
    }

    private Node unshift(int value){
        Node newHead = new Node(value);
        if(this.length == 0){
            this.head = newHead;
            this.tail = newHead;
        }else{
            newHead.next = this.head;
            this.head = newHead;
        }

        this.length++;
        return newHead;
    }

    private Node get(int index){
        if(this.length <= index || index < 0){
            return null;
        }
        int counter = 0;

        Node currentNode = this.head;
        while(counter < index){
            currentNode = currentNode.next;
            counter++;
        }
        return currentNode;

    }

    private boolean set(int index, int value){
        Node node = this.get(index);
        if(node != null){
            node.value = value;
            return true;
        }else{
            return false;
        }
        
    }

    private boolean insert(int index, int value){
        if(this.length <= index || index < 0){
            return false;
        }

        if(index == 0){
            this.unshift(value);
            return true;
        }

        if(index == this.length){
            this.push(value);
            return true;
        }

        Node node = this.get(index-1);
        
        Node tempNode = node.next; // 5
        Node newNode = new Node(value);
        node.next = newNode;
        newNode.next = tempNode;
        this.length++;
        return true;

    }

    private Node remove(int index){
        if(this.length <= index || index < 0){
           return null;
        }
        
        if(index == 0){
            this.shift();
            return null;
        }

        if(index == this.length-1){
            this.pop();
            return null;
        }

        Node node = this.get(index-1);
        Node nodeToRemove = node.next;
        node.next = nodeToRemove.next;
        length--;
        return nodeToRemove;
    }

    private void traverse(){
        Node current = this.head;
        while(current != null){
            System.out.println(current.value);
            current = current.next;
        }

    }

    private void reverse(){
        if(this.length <= 1) return;
        // 1, 2, 3, 4, 5, 6, 7, 8
        Node prev = this.head; 
        Node current = prev.next; 
        Node next = current.next; 
        

        while(next != this.tail){
            current.next = prev; // 2 -> 1
            prev = current;  // prev = 2
            current = next;  // current = 3
            next = next.next; // next = 4
        }

        current.next = prev;
        next.next = current;

        Node oldHead = this.head;
        this.head = this.tail;
        this.tail = oldHead;
        this.tail.next = null;
    }

    public static void main(String[] args) {
        SinglyLinkedList sll = new SinglyLinkedList();
        sll.push(1);
        sll.push(2);
        sll.push(3);
        sll.push(4);
        sll.push(5);
        sll.push(6);
        sll.traverse();
        sll.reverse();
        sll.traverse();
    }

}
