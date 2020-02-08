class Node{
    constructor(val, left = null, right = null){
        this.left = left
        this.right = right
        this.val = val
    }
}

class BinarySearchTree{
    constructor(){
        this.root = null
    }
    insert(value){
        let newNode = new Node(value)
        if(!this.root){
            this.root = newNode
            return this
        }
        let current = this.root
        while(true){            
            if(current.val === value) return undefined
            if(current.val < value){
                if(current.left === null){
                    current.left = newNode
                    return this
                }
                current = current.left
            }else{
                if(current.right === null){
                    current.right = newNode
                    return this                   
                }
                current = current.right
            }
        }        
    
    }

    find(value){
        let find = false
        let current = this.root
        while(true){
            if(current.val === value) return current            
            if(current.val < value){
                if(current.left === null) return false
                current = current.left
            }else {
                if(current.right === null) return false
                current = current.right
            }
        }
    }
    // ITERATIVE IMPLEMENTATION OF BFS
    // 1. first put the node in queue
    // 2. then traverse its child if queue has node.
    // our output 10, 6, 15, 3, 8, 20
    breathFirstSearch() {
        if (!this.root)
            return false
        let current = this.root
        let values = []
        let queue = []
        queue.push(current)
        while (queue.length) {
            current = queue.shift()
            values.push(current.val)
            if (current.left)
                queue.push(current.left)
            if (current.right)
                queue.push(current.right)
        }
        return values
    }
    //ITERATIVE IMPLEMENTATION OF DFS PREORDER
    //the result is 10, 6, 3, 8, 15, 20
    depthFirstSearchPreOrder() {
        if (!this.root)
            return false
        let current = this.root
        let values = []
        let stack = []
        stack.push(current)
        let count = 0
        while (stack.length > 0) {
            count++
            if (count > 100)
                return 'exceeded'
            current = stack.pop()
            values.push(current.val)
            // the if condition here if very important ( current.right should come before current.right)  
            if (current.right) {
                stack.push(current.right)
            }
            if (current.left) {
                stack.push(current.left)
            }
        }
        return values
    }
    // ITERATIVE IMPLEMENTATION OF DFS POSTORDER
    //the result is 3,8,6,20,15,10
    depthFirstSearchPostOrder() {
        if (!this.root)
            return false
        let values = []
        let stack = []
        let count = 0
        let root = this.root
        while (true) {
            if(count > 100)
                return
            count++
            while(root != null){
                stack.push(root)
                stack.push(root)
                root = root.left
            }
            if(stack.length < 1){ 
                break
            }
            root = stack.pop()
            if(stack.length > 0 && stack[stack.length - 1] === root){
                root = root.right
            }else{
                console.log('atleast',root.val)
                values.push(root.val)
                root = null
            }

        }
        return values
    }
    //ITERATIVE IMPLEMENTATION OF DFS INORDER
    //the result is 3,6,8,10,15,20
    depthFirstSearchInOrder(){
        if(!this.root) return false
        let stack = []
        let current = this.root
        let values = []
        while(true){
            if(current){
                stack.push(current)
                current = current.left
            }else if(stack.length){
                current = stack.pop()
                values.push(current.val)
                current = current.right
            }else{
                break
            }

        }
        return values
    }
   var tree = new BinarySearchTree
    tree.insert(10);
    tree.insert(6);
    tree.insert(15);
    tree.insert(3);
    tree.insert(8);
    tree.insert(20);
}
