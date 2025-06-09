package com.rakib.array

/**
 *Common Elements Between Three Arrays
 *Input: [1, 2, 3], [2, 3, 4], [3, 5, 2]
 *Output: [2, 3]
 */

fun findCommonElements(arrayOne: Array<Int>, arrayTwo: Array<Int>, arrayThree: Array<Int>): Array<Int> {
    return arrayOne.intersect(arrayTwo.toSet()).intersect(arrayThree.toSet()).toTypedArray()
}