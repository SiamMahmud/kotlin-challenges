package com.rakib.list

/**
 *Count Even and Odd Numbers in a List
 *Input: [1, 2, 3, 4, 5, 6] → Output: Even: 3, Odd: 3
 */

fun countEvenOddInList(numbers: List<Int>): Pair<Int, Int> {
    var countEven = 0
    var countOdd = 0
    for(num in numbers){
        if(num %2 == 0){
            countEven++
        }else{
            countOdd++
        }
    }
    return Pair(countEven, countOdd)
}