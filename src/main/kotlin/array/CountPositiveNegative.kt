package com.rakib.array

/**
 *Count Positive and Negative Numbers
 *Input: [1, -2, 3, -4, 5]
 *Output: Positive: 3, Negative: 2
 */

fun countPositiveNegative(numbers: Array<Int>): Pair<Int, Int>{
    var countPositive = 0
    var countNegative = 0
    for(num in numbers){
        if(num>0){
            countPositive++
        }else{
            countNegative++
        }
    }
    return Pair(countPositive, countNegative)
}