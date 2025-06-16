package com.rakib.list

/**
 *Rotate a List to the Right by K Steps
 *Input: [1, 2, 3, 4, 5], K: 2 → Output: [4, 5, 1, 2, 3]
 */

fun rotateList(numberList: List<Int>, n : Int): List<Int>{
    var rotationN = n % numberList.size
    return numberList.drop(rotationN) + numberList.take(rotationN)
}