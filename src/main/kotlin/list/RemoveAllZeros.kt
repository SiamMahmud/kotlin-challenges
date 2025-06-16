package com.rakib.list

/**
 *Remove All Zeros from a List
 *Input: [0, 1, 0, 2, 3, 0] → Output: [1, 2, 3]
 */

fun removeAllZeros(numberList: List<Int>): List<Int>{
    val newList = mutableListOf<Int>()
    for(num in numberList){
        if(num != 0){
            newList.add(num)
        }
    }
    return newList.toList()
}