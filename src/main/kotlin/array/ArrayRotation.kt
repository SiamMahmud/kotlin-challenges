package com.rakib.array

/**
 *Rotate Array by N Positions (Left)
 *Input: [1, 2, 3, 4, 5], N: 2
 *Output: [3, 4, 5, 1, 2]
 */

fun arrayRotation(numbers: Array<Int>, rotateN : Int): Array<Int> {
    val n = rotateN % numbers.size
    val numbersList = numbers.toList()

    return (numbersList.drop(n)+ numbersList.take(n)).toTypedArray()
}