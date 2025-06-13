package com.rakib.list

/**
 *Subtract Elements of One List from Another using subtract()
 *Input: [1, 2, 3, 4, 5], [3, 4]
 *Output: [1, 2, 5]
 */

fun subtractListElements(newListOne: List<Int>, newListTwo: List<Int>): List<Int>{
    return newListOne.subtract(newListTwo).toList()
}
