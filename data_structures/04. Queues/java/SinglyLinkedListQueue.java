class Node{
    int val;
    Node next;
    Node(int val){
        this.val = val;
        this.next = null;
    }
}

public class SinglyLinkedListQueue {
    int length;
    Node head;
    Node tail;

    public SinglyLinkedListQueue(){
        this.head = null;
        this.tail = null;
        this.length = 0;
    }

    private void enqueue(int val){
        Node newNode = new Node(val);

        if(this.length == 0){
            this.head = newNode;
        }else{
            this.tail.next = newNode;
            
        }
        this.tail = newNode;
        this.length++;
    }

    private Integer dequeue(){
        
        if(this.length == 0){
            return null;
        }

        Node node = this.head;
        if(this.length == 1){            
            this.head = null;
            this.tail = null;
        }else{
            this.head = this.head.next;
        }

        node.next = null;
        length--;
        return node.val;
    }

    public static void main(String[] args) {
        SinglyLinkedListQueue sllq = new SinglyLinkedListQueue();
        sllq.enqueue(0);
        sllq.enqueue(2);
        sllq.enqueue(3);
        System.out.println(sllq.dequeue());
        System.out.println(sllq.dequeue());
        System.out.println(sllq.dequeue());
        System.out.println(sllq.dequeue());
    }
}
