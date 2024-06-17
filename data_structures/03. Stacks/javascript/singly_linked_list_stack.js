{
    //array has builtin implementaion
    stack = ['frank', 'felicia', 'david']
    stack.push('suganthi')
    console.log(stack)
    stack.pop()
    console.log(stack)

    // linked list stack implementaion
    class Node {
        constructor(val,next = null) {
            this.val = val
            this.next = next
        }
    }
    class Stack {
        constructor() {
            this.head = null
            this.tail = null
            this.length = 0
        }

        push(item) {
            let newNode = new Node(item)
            if(!this.head){
                this.head = newNode
                this.tail = newNode
            }else{
                let temp = this.head
                newNode.next = temp
                this.head = newNode
            }
            return this.length++
        }

        pop(){
            if(!this.head) return false
            if(this.head === this.tail){
                this.head = null
                this.tail = null
            }
            let removedNode = this.head
            this.head = removedNode.next
            this.length--
            return removedNode.val
        }
    }
    var stack = new Stack
}

