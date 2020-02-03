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
}
