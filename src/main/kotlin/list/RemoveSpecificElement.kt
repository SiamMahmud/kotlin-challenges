package com.rakib.list

/**
 *Remove All Occurrences of a Specific Element
 *Input: [1, 2, 3, 2, 4], Element: 2 → Output: [1, 3, 4]
 */

fun removeSpecificElement(numbers: List<Int>, n: Int): List<Int>{

    val newNumberList = mutableListOf<Int>()

    for(num in numbers){
        if(num !=n ){
            newNumberList.add(num)
        }
    }
    return newNumberList.toList()
}