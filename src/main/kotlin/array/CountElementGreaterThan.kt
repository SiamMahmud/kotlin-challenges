package com.rakib.array

/**
 *Count Elements Greater Than 10
 *Input: [5, 15, 25, 2, 12]
 *Output: 3
 */

fun countElementGreaterThan(numbers: Array<Int>, n: Int): Int {
    var count = 0
    for(num in numbers){
        if(num>n){
            count++
        }
    }
    return count
}