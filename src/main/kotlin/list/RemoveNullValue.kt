package com.rakib.list

/**
 *Remove All Null Values from a List
 *Input: [1, null, 2, null, 3] → Output: [1, 2, 3]
 */

fun removeNullValue(numbers: List<Int?>): List<Int>{
    val newList = mutableListOf<Int>()
    for(num in numbers){
        if(num != null){
            newList.add(num)
        }
    }
    return newList.toList()
}