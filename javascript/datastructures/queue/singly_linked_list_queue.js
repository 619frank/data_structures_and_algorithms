//this is a queue implemented with singly linked list

class Node{
    constructor(val,next = null){
        this.val = val
        this.next = next
    }
}

class Queue{

    constructor(){
        this.head = null
        this.tail = null
        this.length = 0
    }
    //this is push equivalent in a singly linked list
    enqueue(item){
        let newNode = new Node(item)
        if(!this.head){
            this.head = newNode
            this.tail = newNode
        }else{
            this.tail.next = newNode            
        }
        this.tail = newNode
        this.length++
        return this            
    }
    // removing the element from the front
    dequeue(){
        if(!this.head) return false
        let removingItem = this.head
        if(this.head === this.tail){
            this.head = null
            this.tail = null
        }else{
            this.head = removingItem.next
        }
        this.length--
        return removingItem
    }

}

