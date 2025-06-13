package com.rakib.list

/**
 *Remove Duplicates from a List
 *Input: [1, 2, 2, 3, 4, 4, 5] → Output: [1, 2, 3, 4, 5]
 */

fun removeDuplicates(numberList: List<Int>): List<Int> {
    return numberList.distinct()
}