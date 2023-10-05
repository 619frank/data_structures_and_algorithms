    function maxSubArraySum(arr, num) {
        let maxSum = 0

        for (let i = 0; i < num; i++) {
            maxSum += arr[i]
        }
        let temp = maxSum

        for (let j = num; j < arr.length; j++) {
            temp = arr[j] + (temp - arr[j - num])
            maxSum = maxSum < temp ? temp : maxSum
        }
        return maxSum

    }

    maxSubArraySum([9, 3, 4, 9, 9, 8, 5, 8, 3], 3)
