package com.rakib.array

/**
 *Multiply Each Element by another number
 *Input: [1, 2, 3] by 2
 *Output: [2, 4, 6]
 */

fun multiplyEachNumber(numbers: Array<Int>, n: Int): Array<Int>{
    return numbers.map{it * n}.toTypedArray()
}