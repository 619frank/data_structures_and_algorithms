function frequencyCounter(arr1, arr2){
   if(arr1.length != arr2.length) return false

    let arr1Obj = {}
    let arr2Obj = {}

    for(let val of arr1){
        arr1Obj[val] = (arr1Obj[val] || 0) + 1
    }

    for(let val of arr2){
        arr2Obj[val] = (arr2Obj[val] || 0) + 1
    }
    console.log(arr1Obj,arr2Obj)
    for(let key in arr1Obj){
        if(!(key**2  in arr2Obj))
            return false
        console.log('h9')

        if(arr1Obj[key] !== arr2Obj[key**2])
            return false
    }
    return true
}

frequencyCounter([1,2,3],[9,4,1])
