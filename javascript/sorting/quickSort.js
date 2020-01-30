function quickSort(arr, left = 0,right =  arr.length -1){
    if(left < right){
        let pivotIdx = pivot(arr, left,right)
        //left 
        quickSort(arr, left, pivotIdx-1)
        //right
        quickSort(arr,pivotIdx + 1, right)
    }
    return arr
}

function pivot(arr,start = 0, end = arr.length - 1){
  // We are assuming the pivot is always the first element
    let pivot = arr[start]
    let swapIdx = start 

    for(let i = start + 1; i < arr.length; i ++){

        if(arr[i] < pivot){
            swapIdx++
            //swapping all the elements which are lesser than the pivot element, right next to the -
            //-pivot element
            [arr[i],arr[swapIdx]] = [arr[swapIdx],arr[i]]
        }
    }
    //finally swapping the pivot element from the first place to its correct position
    [arr[start],arr[swapIdx]] = [arr[swapIdx],arr[start]]

    return swapIdx
}

console.log(quickSort([12,8,9,90,23,64,2,83,89]))
