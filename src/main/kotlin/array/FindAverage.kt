package com.rakib.array

/**
 *Find Average of Array Elements
 *Input: [10, 20, 30]
 *Output: 20.0
 */

fun findAverage(numbers: Array<Int>): Double {
    var result = 0
    for(num in numbers){
        result += num
    }
    return (result.toDouble()/numbers.size)
}