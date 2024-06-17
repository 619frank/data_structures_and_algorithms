{
    function anagram(str1,str2){
        let lookup = {}

        for(let val of str1){
            lookup[val] = (lookup[val] || 0) + 1
        }
        console.log(lookup)
        for(let item of str2) {
            if(!(item in lookup)){
                return false
            }

            if(!lookup[item]){
                return false
            }else{
                lookup[item] -= 1 
            }
        }
        console.log(lookup)
        return true
    }

    anagram('abc','ca')
}
