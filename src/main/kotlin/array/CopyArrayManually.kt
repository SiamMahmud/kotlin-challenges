package com.rakib.array

/**
 *Copy Array Manually
 *Input: [5, 10, 15]
 *Output: [5, 10, 15] (new array with same values)
 */

fun copyArrayManually(numberArray: Array<Int>): Array<Int>{

    val newArray = Array(numberArray.size){0}
    for(i in numberArray.indices){
        newArray[i] = numberArray[i]
    }
    return newArray
}