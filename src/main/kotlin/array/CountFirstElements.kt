package com.rakib.array

/**
 *Count How Many Times First Element Appears
 *Input: [3, 2, 3, 4, 3]
 *Output: 3
 */

fun countFirstElements(numbers: Array<Int>, firstElements: Int): Int{
    var count = 0
    for(num in numbers){
        if(num == firstElements){
            count++
        }
    }
    return count
}
