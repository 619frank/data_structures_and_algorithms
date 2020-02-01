function getDigit(number,position){
    return Math.floor( Math.abs(number) / Math.pow(10,position)) % 10
}

function digitCount(num){
    if(num === 0) return 1
    return Math.floor(Math.log10(num)) + 1
}

function getMostDigits(arr){
    let mostDigitCount = 0
    let digit = 0
    for(let i = 0; i < arr.length; i++){
        digit = digitCount(arr[i])
        if(mostDigitCount < digit){
            mostDigitCount = digit
        }
    }
    return mostDigitCount 

}

function radixSort(arr){
    let k = getMostDigits(arr)
    for(let i = 0; i < k; i++){
        
        let tempStore = Array.from({length:10},()=>[])
        for(let j = 0; j < arr.length; j++){
            
           tempStore[getDigit(arr[j],i)].push(arr[j])
        }
        arr= [].concat(...tempStore)
    }
    return arr
}
//console.log(getDigit(189024,5))
//console.log(digitCount(0))
//console.log(getMostDigits([123,122,23455,9,90]))

console.log(radixSort([19,23,45,2982,35,29,9,30,222335,8]))
