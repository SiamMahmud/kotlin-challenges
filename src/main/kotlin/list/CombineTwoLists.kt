package com.rakib.list

/**
 *Input: [1, 2, 2, 3], [3, 4, 4, 5]
 *Output: [1, 2, 3, 4, 5]
 */

fun combineTwoList(newListOne: List<Int>, newListTwo: List<Int>): List<Int>{
    return newListOne.union(newListTwo).toList()
}
