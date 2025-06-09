package com.rakib.array

/**
 *Replace Odd Numbers
 *Input: [1, 2, 3, 4, 5]
 *Output: [0, 2, 0, 4, 0]
 */

fun replaceOddNumber(numbers: Array<Int>, replaceNum: Int): Array<Int>{
    val newArray = IntArray(numbers.size)
    for(i in numbers.indices){
        if(numbers[i] %2 != 0){
            newArray[i] = replaceNum
        }else{
            newArray[i] = numbers[i]
        }
    }
    return newArray.toTypedArray()
}