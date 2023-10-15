/*
Multiple Pointers - averagePair

Write a function called **averagePair.** Given a sorted array of integers and a target average, determine if there is a pair of values in the array where the average of the pair equals the target average. There may be more than one pair that matches the average target.

**Bonus Constraints:**

Time: O(N)

Space: O(1)

Sample Input:

1. averagePair([1,2,3],2.5) // true
2. averagePair([1,3,3,5,6,7,10,12,19],8) // true
3. averagePair([-1,0,3,4,5,6], 4.1) // false
4. averagePair([],4) // false
*/

function averagePair(array, average) {
    if (array.length < 2) {
        return false;
    }

    let left = 0;
    let right = array.length - 1;

    while (left < right) {
        const currentAverage = (array[left] + array[right]) / 2;

        if (currentAverage === average) {
            return true;
        } else if (currentAverage > average) {
            right--;
        } else {
            left++;
        }
    }

    return false;
}


console.log(averagePair([1, 2, 3], 2.5)) // true
console.log(averagePair([1,3,3,5,6,7,10,12,19],8)) // true
console.log(averagePair([-1,0,3,4,5,6], 4.1)) // false
console.log(averagePair([],4)) // false