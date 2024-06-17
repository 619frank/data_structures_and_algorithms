class Node{
    constructor(val,priority){
        this.val = val 
        this.priority = priority
    }
}
class PriorityQueue {

    constructor() {
        this.values = []
    }

//         insert(element) {
    enqueue(val,priority){
        let newNode = new Node(val,priority)
        this.values.push(newNode)
        this.bubbleUp()
    }

    bubbleUp() {
        if(this.values.length < 2 )return
        let index = this.values.length - 1
        let parentIdx = Math.floor((index - 1) / 2)
        let count = 0            
        console.log(index,parentIdx)
        while (this.values[parentIdx].hasOwnProperty('priority')  && 
        this.values[index].hasOwnProperty('priority')
        &&
        this.values[parentIdx].priority < this.values[index].priority && parentIdx > -1) {
            if (count > 100)
                break
            count++
            [this.values[parentIdx],this.values[index]] = [this.values[index], this.values[parentIdx]]
            index = parentIdx
            parentIdx = Math.floor((index - 1) / 2)
        }
        console.log(this.values)
    }

    //removing element from a head
//         extractMax() {
    dequeue(){
        let max = this.values[0]
        let end = this.values.pop()
        this.values[0] = end
        this.sinkDown()
        return max
    }

    sinkDown() {
        let idx = 0
        const length = this.values.length
        const element = this.values[0]
        let count = 0
        while (true) {
            if (count > 100)
                break
            count++
            let leftChildIdx = 2 * idx + 1
            let rightChildIdx = 2 * idx + 2
            let leftChild, rightChild
            let swap = null
            if (leftChildIdx < length) {
                leftChild = this.values[leftChildIdx]
                swap = leftChildIdx
                if (leftChild.priority > element.priority) {
                    swap = leftChildIdx
                }
            }
            if (rightChildIdx < length) {
                rightChild = this.values[rightChildIdx]
                if ((swap === null && rightChild.priority > element.priority) ||
                 (swap !== null && rightChild.priority > leftChild.priority )) {
                    swap = rightChildIdx
                }
            }
            if (swap === null)
                break
            this.values[idx] = this.values[swap]
            this.values[swap] = element
            idx = swap
        }
    }
}

var ER = new PriorityQueue();
ER.enqueue("common cold",5)
ER.enqueue("gunshot wound", 1)
ER.enqueue("high fever",4)
ER.enqueue("broken arm",2)
ER.enqueue("glass in foot",3)    
console.clear()
