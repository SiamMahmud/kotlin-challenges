package com.rakib.list

/**
 *Find First Non-Repeated Element
 *Input: [4, 5, 1, 2, 0, 1, 2] → Output: 4
 */

fun firstNonRepeatedElement(numbers: List<Int>): Int{
    val countNum = mutableMapOf<Int,Int>()
    var countN = 1
    var firstRepeated = 0
    for(num in numbers){
        countNum[num] = countNum.getOrDefault(num, 0) + 1
    }
    for((num, count) in countNum){
        if(countN == count){
            firstRepeated = num
            break
        }
    }
    return firstRepeated
}