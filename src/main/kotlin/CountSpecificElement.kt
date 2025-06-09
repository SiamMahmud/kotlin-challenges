package com.rakib

/**
 *Count Specific Element in Array
 * Input: [1, 2, 2, 3, 4], Target: 2
 */

fun countSpecificElement(numbers: Array<Int>,targetElement: Int): Int {
    var count = 0
    for(num in numbers){
        if(num==targetElement){
            count++
        }
    }
    return count
}