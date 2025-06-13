package com.rakib.list

/**
 *Check if a List Is Sorted
 *Input: [1, 2, 3, 4, 5] → Output: true
 *Input: [1, 3, 2] → Output: false
 */

fun checkListSorted(numberList: List<Int>): Boolean{
    return numberList == numberList.sorted()
}