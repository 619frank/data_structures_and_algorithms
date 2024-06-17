function merge(arr1,arr2){
    
    let newArray = []
    let i = 0
    let j = 0
    while(i < arr1.length && j < arr2.length){
        if(arr1[i] < arr2[j]){
           newArray.push(arr1[i])
           i++
        }else{
            newArray.push(arr2[j])
            j++
        }
    }
    while(i < arr1.length){
        newArray.push(arr1[i])
        i++
    }
    while(j < arr2.length){
        newArray.push(arr2[j])
        j++
    }
    return newArray
}
// 1 loop through arr1 and compare it with arr2 and put the sorted element in the new array
// 2 if one of the array ends then put the rest of the values of remaining arry in the back of first 
//   finished array

function mergeSort(arr){
    if(arr.length <= 1) return arr
    let middle = Math.floor(arr.length/2)
    let left = mergeSort(arr.slice(0,middle))
    let right = mergeSort(arr.slice(middle))
    return merge(left,right)
}


console.log(mergeSort([2,5,52,6,1,8,85,29,60,35]))
