class Node
{
    constructor(value)
    {
        this.value = value 
        this.next = null
    }
}


class SinglyLinkedList
{
    constructor()
    {
        this.head = null
        this.tail = null
        this.length = 0
    }

    push(item)
    {
        let newNode = new Node(item)
        if (this.length === 0)
        {
            this.head = newNode
            this.tail = newNode 
        }else if (this.tail)
        {
            //this is colt steele's version 
            //this.tail.next = newNode
            //this.tail = newNode
            
            //this is my version
             let current = this.head
             while (current.next)
             {
                 current = current.next
             }
             current.next = newNode
             this.tail = newNode;
        }        
        this.length +=1
    } 

    pop()
    {
       if(!this.head)
        {
            return
        }
        
        let newTail = this.head
        let current = newTail
        while (current.next)
        {
            newTail = current
            current = current.next
        }
        newTail.next = null
        this.tail = newTail 
        this.length --
        
        return current
    }
}


sll = new SinglyLinkedList

sll.push(1)

sll.push(2)

sll.push(3)

console.log(sll)
console.log(sll.pop())

console.log(sll)
