package com.rakib.list

/**
 *Group Elements by Even and Odd
 *Input: [1, 2, 3, 4, 5] → Output: Even: [2, 4], Odd: [1, 3, 5]
 */

fun groupEvenOdd(numberList: List<Int>): Pair<MutableList<Int>,MutableList<Int>>{
    var evenNum = mutableListOf<Int>()
    var oddNum = mutableListOf<Int>()
    for(num in numberList){
        if(num %2 == 0){
            evenNum.add(num)
        }else{
            oddNum.add(num)
        }
    }
    return Pair(evenNum, evenNum)

}