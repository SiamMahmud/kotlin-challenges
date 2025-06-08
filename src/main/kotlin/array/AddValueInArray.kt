package com.rakib.array

/**
 *Add a Value to the Array
 *Input: [1, 2, 3], Add: 4
 *Output: [1, 2, 3, 4]
 */

fun addValueInArray(numbers: Array<Int>, addElement: Int): Array<Int> {

    val newList = numbers.toMutableList()
    newList.add(addElement)

    return newList.toTypedArray()
}