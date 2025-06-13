package com.rakib.list

/**
 *Filter Out Negative Numbers
 *Input: [-1, 2, -3, 4] → Output: [2, 4]
 */

fun filterOutNegativeNumbers(listNumber: List<Int>): List<Int>{
    return listNumber.filter{it > 0}
}