package com.rakib.list

/**
 *Find Common Elements Between Two Lists using intersect()
 *Input: [1, 2, 3, 4], [3, 4, 5, 6]
 *Output: [3, 4]
 */

fun findCommonElement(newListOne: List<Int>, newListTwo: List<Int>): List<Int>{
    return newListOne.intersect(newListTwo).toList()
}
