/*
Multiple Pointers - isSubsequence
Write a function called isSubsequence which takes in two strings and checks whether the characters in the first string form a subsequence of the characters in the second string.In other words, the function should check whether the characters in the first string appear somewhere in the second string, without their order changing.

    Examples:

isSubsequence('hello', 'hello world'); // true
isSubsequence('sing', 'sting'); // true
isSubsequence('abc', 'abracadabra'); // true
isSubsequence('abc', 'acb'); // false (order matters)
Your solution MUST have AT LEAST the following complexities:

Time Complexity - O(N + M)

Space Complexity - O(1)
*/

function isSubsequence(string1, string2) {
    let string1Pointer = 0;
    let string2Pointer = 0;

    while (string1Pointer < string1.length && string2Pointer < string2.length) {
        if (string1[string1Pointer] === string2[string2Pointer]) {
            string1Pointer++;
        }
        string2Pointer++;
    }

    return string1Pointer === string1.length;
}

let result = null;
result = isSubsequence('hello', 'hello world'); // true
console.log(result)
result = isSubsequence('sing', 'sting'); // true
console.log(result)
result = isSubsequence('abc', 'abracadabra'); // true
console.log(result)
result = isSubsequence('abc', 'acb'); // false (order matters)
console.log(result)
result = isSubsequence("abc", "abacbc")
console.log(result)