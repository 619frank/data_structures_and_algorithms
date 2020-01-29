// insertion sort just runs from back

function insertionSort(arr){

    for(let i = arr.length - 1; i < arr.length; i--){
        let noswap = true
        for(let j = i -1 ; j > -1; j --){
            if(arr[i] < arr[j]){
                [arr[j],arr[i]] = [arr[i],arr[j]]
                noswap = false 
            }
        }
        
        if(noswap) break;
        console.log(arr)

    }
    return arr
}

console.log(insertionSort([1,2,4,3]))
