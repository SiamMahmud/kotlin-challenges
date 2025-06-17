package com.rakib.list

/**
 *Find Elements Appearing Only Once
 *Input: [4, 5, 4, 6, 7, 6] → Output: [5, 7]
 */

fun findElementsAppearingOnce(numbers: List<Int>): List<Int>{
    val elementOnceList = mutableMapOf<Int, Int>()
    var countValue = 1
    val newList = mutableListOf<Int>()
    for(num in numbers){
        elementOnceList[num] = elementOnceList.getOrDefault(num, 0) + 1
    }
    for((num, count) in elementOnceList){
        if(countValue == count){
            newList.add(num)
        }
    }
    return newList.toList()
}