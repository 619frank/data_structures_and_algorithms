
class Node {
    constructor(val, prev=null, next=null) {
        this.val = val
        this.prev = prev
        this.next = next
    }
}

class DoublyLinkedList {
    constructor() {
        this.head = null
        this.tail = null
        this.length = 0
    }

    push(item) {
        let newNode = new Node(item)
        if (!this.head) {
            this.head = newNode
            this.tail = newNode
        } else {
            this.tail.next = newNode
            newNode.prev = this.tail
            this.tail = newNode                
        }
        this.length++
        return this
    }
    pop(){
        if(!this.head) return false
        if(this.length === 1){
             this.head = null
             this.tail = null              
        }else{
            let newTail = this.tail.prev
            this.tail.prev.next = null
            this.tail = newTail
        }
        this.length--
    }

    shift(){
        if(!this.head) return false
        let removedNode = this.head            
        if(this.head === this.tail){
            this.head = null
            this.tail = null
        }else{
            let newHead = this.head.next
            this.head = newHead
            this.head.prev = null
        }
        this.length--
        return removedNode
    }

    unshift(item){
        if(!this.head) return false
        let newNode = new Node(item)
        this.head.prev = newNode
        newNode.next = this.head
        this.head = newNode
        this.length++
        return this.head
    }

    get(index){
       if(index < 0 || index > this.length-1) return null
       let node = this.head
       if(index <= this.length/2){
            for(let i = 0; i <= this.length/2; i++){
                if(i === index){
                    break
                }
                node = node.next
            }
       }else{
            for(let i = this.length/2; i < this.length/2; i++){
                if(i === index){
                    break
                }
                node = node.next
            }
       }
       return node
    }

    set(index,value){
        if(index < 0 || index > this.length-1) return false
        let node = this.get(index)
        node.val = value
        return true
    }
    insert(){

    }
    reverse(){
        
    }

}
var dll = new DoublyLinkedList
dll.push(1)
console.clear()


