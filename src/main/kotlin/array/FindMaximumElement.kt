package com.rakib.array

/**
 *Find Maximum Element in Array
 * Input: [10, 50, 20, 40]
 * Output: 50
 */

fun findMaximumElement(numbers: Array<Int>): Int {
    var maxElement = numbers[0]

    for(i in 1..numbers.size-1){
        if(numbers[i]>maxElement){
            maxElement = numbers[i]
        }
    }
    return maxElement
}