//this algorithm only works with sorted data

function binarySearch(arr,num){
    
    let start = 0
    let end = arr.length - 1
    let middle = Math.floor((start + end)/2)

    while(arr[middle] !== num && start <= end){
        
        if(num > arr[middle]){
            start = middle + 1
        }else if(num < arr[middle]){
            end = middle -1
        }
        middle = Math.floor((start + end)/2)
    }
    if(arr[middle] === num){
        return middle
    }else{
        return -1
    }
}


console.log(binarySearch([1,2,3,4,5,6,7],5)) //3
