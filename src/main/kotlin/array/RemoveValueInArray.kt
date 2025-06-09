package com.rakib.array

/**
 *Remove a Value
 *Input: [1, 2, 3, 2], Remove: 2
 * Output: [1, 3] (remove all 2s)
 */

fun removeValueInArray(numbers: Array<Int>, removeElement: Int): Array<Int> {
    val newList = numbers.toMutableList()
    newList.removeAll{it == removeElement}

    return newList.toTypedArray()
}