package com.rakib.array

/**
 *Print Elements at Even Indices
 *Input: [11, 22, 33, 44, 55]
 *Output: [11, 33, 55]
 */

fun findElementsEvenIndices(numbers: Array<Int>): Array<Int> {
    val newArrayList = mutableListOf<Int>()

    for(i in numbers.indices){
        if(i %2 == 0){
            newArrayList.add(numbers[i])
        }
    }
    return newArrayList.toTypedArray()
}