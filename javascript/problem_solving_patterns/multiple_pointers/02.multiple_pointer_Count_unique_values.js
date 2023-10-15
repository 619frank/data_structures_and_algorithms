    function countUniqueValues(arr) {
        let i = 0

        for (let j = 1; j < arr.length; j++) {
            if (arr[j] > arr[i]) {
                i++
                arr[i] = arr[j]
                //             i++
            }
        }
        return i+1
    }

    console.log(countUniqueValues([1, 1, 2, 2, 2, 3, 4, 4]))
