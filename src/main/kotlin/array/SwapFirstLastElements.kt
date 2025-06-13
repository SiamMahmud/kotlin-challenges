package com.rakib.array

import kotlin.collections.toMutableList

//26. Swap First and Last Elements
//Input: [10, 20, 30, 40]
//Output: [40, 20, 30, 10]

fun swapFirstLastElements(numbers: Array<Int>): Array<Int> {
    val newList = numbers.toMutableList()
    val temp = newList[0]
    newList[0] = newList[newList.size-1]
    newList[newList.size-1] = temp

    return newList.toTypedArray()
}
