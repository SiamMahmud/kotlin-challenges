package com.rakib.array

/**
 *Check if Array Contains a Specific Element
 *Input: [1, 2, 3, 4]
 *Search: 3
 * Output: true
 */

fun checkArrayContainsSpecificElement(numbers: Array<Int>, tElement: Int): Boolean {
    if(tElement !in numbers ){
        return false
    }
    return true
}