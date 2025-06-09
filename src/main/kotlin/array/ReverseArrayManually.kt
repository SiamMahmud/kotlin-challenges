package com.rakib.array

/**
 *Reverse Array Manually
 *Input: [1, 2, 3, 4]
 *Output: [4, 3, 2, 1]
 */

fun reverseArrayManually(numbers: Array<Int>): Array<Int>{
    val newReversedList = mutableListOf<Int>()
    for(i in numbers.size-1 downTo 0){
        newReversedList.add(numbers[i])
    }
    return newReversedList.toTypedArray()
}