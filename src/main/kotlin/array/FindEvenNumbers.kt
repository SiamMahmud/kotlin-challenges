package com.rakib.array

/**
 *Find Even Numbers in Array
 *Input: [1, 2, 3, 4, 5]
 *Output: [2, 4]
 */

fun findEvenNumbers(numbers: Array<Int>):  Array<Int> {
    val evenNumbers = mutableListOf<Int>()
    for(num in numbers){
        if(num %2 == 0){
            evenNumbers.add(num)
        }
    }
    return evenNumbers.toTypedArray()
}