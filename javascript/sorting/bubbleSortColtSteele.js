function bubbleSort(arr){
    let noswap;
    for(let i = arr.length; i > 0; i--){
        noswap = true
        for(let j = 0; j < i - 1; j++){
            if( arr[j+1] < arr[j]){
                [arr[j+1],arr[j]] = [arr[j], arr[j+1]]
                noswap = false
            }
        }
        if(noswap) break
    }
    return arr
}

console.log(bubbleSort([234,7,2,98,8,37]))
