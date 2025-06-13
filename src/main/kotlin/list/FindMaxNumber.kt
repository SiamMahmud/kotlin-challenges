package com.rakib.list

/**
 *Find the Maximum Number in a List
 *Input: [3, 5, 2, 9, 1] → Output: 9
 */

fun findMaximum(listNumber: List<Int>): Int{
    var maxNum = listNumber[0]
    for (i in 1..listNumber.size-1){
        if(listNumber[i] > maxNum){
            maxNum = listNumber[i]
        }
    }
    return maxNum
}
