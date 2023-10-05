/*
Frequency Counter - sameFrequency
Write a function called sameFrequency.Given two positive integers, find out if the two numbers have the same frequency of digits.

Your solution MUST have the following complexities:

Time: O(N)

Sample Input:

sameFrequency(182, 281) // true
sameFrequency(34, 14) // false
sameFrequency(3589578, 5879385) // true
sameFrequency(22, 222) // false
*/

function sameFrequency(firstInteger, secondInteger) {
    // good luck. Add any arguments you deem necessary.
    let firstIntegerCount = Math.floor(Math.log10(Math.abs(firstInteger)))
    let secondIntegerCount = Math.floor(Math.log10(Math.abs(secondInteger)))
    if (!(firstIntegerCount == secondIntegerCount)) {
        return false;
    }
    let lookup = {}
    for (let i = 0; i <= firstIntegerCount; i++) {
        let digit = getDigit(firstInteger, i)
        lookup[digit] = (lookup[digit] || 0) + 1
    }

    for (let i = 0; i <= firstIntegerCount; i++) {
        let digit = getDigit(secondInteger, i)

        if (!(digit in lookup)) {
            return false
        }

        if (!(lookup[digit])) {
            return false
        } else {
            lookup[digit] -= 1
        }

    }

    return true
}

function getDigit(number, i) {
    return Math.floor((Math.abs(number) / Math.pow(10, i)) % 10)
}
