package com.rakib.list

/**
 *Sum All Elements in a List
 *Input: [1, 2, 3, 4] → Output: 10
 */

fun sumAllElementsInList(numberList: List<Int>): Int{
    var sum = 0
    for(num in numberList){
        sum += num
    }
    return sum
}