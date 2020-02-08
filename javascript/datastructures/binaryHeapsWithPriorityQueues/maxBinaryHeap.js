class MaxBinaryHeap{

    constructor(){
        this.values = [41,39,33,18,27,12]
    }

    insert(element){
        this.values.push(element)
        bubbleUp()        
    }

    bubbleUp(){
        let index = this.values.length - 1
        let parentIdx = Math.floor((index -1)/2)
        while(this.values[parentIdx] < this.values[index] && parentIdx > 0){
            [this.values[parentIdx], this.values[index]] = [this.values[index],this.values[parentIdx]]
            index = parentIdx 
            parentIdx = Math.floor((index - 1)/2)
        }
    }
    //removing element from a head
    extractMax() {
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
                if (leftChild > element) {
                    swap = leftChildIdx
                }
            }
            if (rightChildIdx < length) {
                rightChild = this.values[rightChildIdx]
                if ((swap === null && rightChild > element) || (swap !== null && rightChild > leftChild)) {
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
