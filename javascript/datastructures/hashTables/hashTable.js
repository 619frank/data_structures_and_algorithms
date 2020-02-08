{

    // SEPARATE CHAINING, LINEAR PROBING (google search this)

    
    // function hash(key,arrLen){
    //     let total = 0
    //     for(let char of key){
    //         let value = char.charCodeAt(0) - 96 
    //         total = (value + total) % arrLen
    //     }
    //     return total
    // }

    //improved version
    function hash(key, arrLen) {
        const PRIME = 31
        let total = 0
        for (let i = 0; i < Math.min(key.length, 100); i++) {
            let char = key[i]
            let value = char.charCodeAt(0) - 96
            total = (total * PRIME + value) % arrLen
        }
        return total
    }

    class HashTable {
        constructor(size=4) {
            this.keymap = new Array(size)
        }
        _hash(key) {
            const PRIME = 31
            let total = 0
            for (let i = 0; i < Math.min(key.length, 100); i++) {
                let char = key[i]
                let value = char.charCodeAt(0) - 96
                total = (total * PRIME + value) % this.keymap.length
            }
            return total
        }

        set(key, value) {
            let index = this._hash(key)
            if (!this.keymap[index]) {
                this.keymap[index] = []
            }
            this.keymap[index].push([key, value])
        }

        get(key) {
            let index = this._hash(key)
            if(this.keymap[index]){
                for(let i = 0; i < this.keymap[index].length;i++){
                    if(this.keymap[index][i][0] === key){
                        return this.keymap[index][i][1]
                    }
                }
            }
            return undefined
        }
        // 0 is the only difference
        keys(){
            let result = []
            for(let i = 0; i < this.keymap.length;i++){
                if(this.keymap[i]){
                    for(let j = 0; j < this.keymap[i].length; j++){
                        result.push(this.keymap[i][j][0])
                    }
                }
            }
            return result
        }
//         1 is the only difference
        values(){
            let result = []
            for(let i = 0; i < this.keymap.length;i++){
                if(this.keymap[i]){
                    for(let j = 0; j < this.keymap[i].length; j++){
                        result.push(this.keymap[i][j][1])
                    }
                }
            }
            return result
        }
    }
    console.clear()
    var hashTable = new HashTable
    hashTable.set('hi','hello')
    hashTable.set('h','hell')
    hashTable.set('i','ello')
    hashTable.set('fi','llo')
    hashTable.set('fg','lo')                
}

