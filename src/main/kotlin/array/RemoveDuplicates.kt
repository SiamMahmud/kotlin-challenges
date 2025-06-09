package com.rakib.array

/**
 *Remove Duplicates in Array
 * Input: [1, 2, 2, 3, 1]
 * Output: [1, 2, 3]
 */

fun removeDuplicates(numbers: Array<Int>): Array<Int> {
    return numbers.toSet().toTypedArray()
}