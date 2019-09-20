class Stack
{
    constructor()
    {
        this.items = []
    }

    push(item)
    {
        this.items.push(item)
    }

    pop()
    {
       return this.items.pop()
    }

    peek()
    {
        return this.items[this.items.length -1]
    }

}

let stack = new Stack

stack.push(1)
stack.push(2)
stack.push(3)

console.log(stack)

console.log(stack.pop())

console.log(stack.peek())
