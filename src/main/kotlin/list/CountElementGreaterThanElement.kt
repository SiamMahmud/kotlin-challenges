package com.rakib.list

/**
 *Count Elements Greater Than a Given Value
 *Input: [4, 7, 1, 9, 3], Threshold: 5 → Output: 2
 */

fun countElementGreaterThanElement(numberList: List<Int>, givenElement: Int): Int {
    var count = 0
    for(num in numberList){
        if(num > givenElement){
            count++
        }
    }
    return count
}