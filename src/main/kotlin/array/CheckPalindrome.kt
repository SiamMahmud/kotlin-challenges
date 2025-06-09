package com.rakib.array

/**
 *Check if Array is Palindrome
 *Input:[1, 2, 3, 2, 1]
 *Output: true
 */

fun checkPalindrome(numbers: Array<Int>): Boolean {
    return numbers.contentEquals(numbers.reversedArray())
}