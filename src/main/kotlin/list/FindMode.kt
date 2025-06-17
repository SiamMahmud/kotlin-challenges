package com.rakib.list

/**
 *Find the Mode (Most Frequent Element)
 *Input: [1, 2, 2, 3, 3, 3] → Output: 3
 */

fun findMode(numberList: List<Int>): Int{
    val wordCount = mutableMapOf<Int, Int>()
    for(num in numberList){
        wordCount[num] = wordCount.getOrDefault(num, 0) + 1
    }
    var numValue = 0
    var countValue = 0
    for((num, count) in wordCount){
        if(count > countValue){
            numValue = num
        }
    }
    return numValue
}