class Node{

    Node next;
    Node prev;
    int val;

    public Node(int val){
        this.val = val;
    }
}

public class DoublyLinkedList {
    
    int length;
    Node head;
    Node tail;

    public DoublyLinkedList(){
        this.head = null;
        this.tail = null;
        this.length = 0;
    }

    private Node push(int val){
        
        Node newNode = new Node(val);
        
        if(this.head == null){
            this.head = newNode;
            this.tail = newNode;
        }else{
            this.tail.next = newNode;
            newNode.prev = this.tail;
            this.tail = newNode;
        }

        this.length++;
        return newNode;
    }

    private Node pop(){
        if(this.length == 0){
            return null;
        }
        
        Node popNode = this.tail;
        if(this.length == 1){
            this.head = null;
            this.tail = null;
        }else{
            this.tail = this.tail.prev;
            this.tail.next = null;
        }

        this.length--;
        return popNode;
    }

    private Node shift(){
        if(this.length == 0){
            return null;
        }

        Node popHead = this.head;

        if(this.length == 1){
            this.head = null;
            this.tail = null;
        }else{
            this.head = this.head.next;
            this.head.prev = null;
        }
        this.length--;
        return popHead;
    }

    private Node unshift(int val){
        Node newNode = new Node(val);
        if(this.length == 0){
            this.head = newNode;
            this.tail = newNode;
        }else{
            newNode.next = this.head;
            this.head.prev = newNode;
            this.head = newNode;
        }

        this.length++;
        return newNode;
    }

    private Node get(int idx){
        if(idx >= this.length) return null;

        Node node = null;
        if(idx/2 <= this.length/2){
            node = this.head;
            for(int i = 0; i < idx; i++){
                node = node.next;
            }
        }else{
            node = this.tail;
            for(int i = this.length -1; i > idx; i--){
                node = node.prev;
            }
        }
        return node;
    }

    private boolean set(int idx, int val){
        Node node = this.get(idx);
        if(node != null){
            node.val = val;
            return true;
        }else{
            return false;
        }
        
    }

    private void traverse(){
        Node node = this.head;

        while(node != null){
            System.out.println(node.val);
            node = node.next;
        }
    }

    public static void main(String[] args) {
        DoublyLinkedList dll = new DoublyLinkedList();
        dll.push(1);
        dll.push(2);
        dll.push(3);
        dll.push(4);
        // dll.traverse();
        // dll.pop();
        // dll.traverse();
        // dll.set(0, 10);
        // dll.traverse();
        // dll.shift();
        // dll.traverse();
        // dll.unshift(1);
        // dll.traverse();
        Node node = dll.get(3);
        System.out.println(node.val);
    }
}
