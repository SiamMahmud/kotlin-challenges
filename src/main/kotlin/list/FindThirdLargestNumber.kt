package com.rakib.list

/**
 *Find the Third-Largest Number in a List
 *Input: [5, 2, 9, 1, 6, 7] → Output: 6
 */

fun findThirdLargestNumber(numberList: List<Int>):  Int{
    val sortedNumber = numberList.sorted()
    return sortedNumber[sortedNumber.size-3]
}