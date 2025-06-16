package com.rakib.list

/**
 *Check if Two Lists Are Equal (Same Elements in Same Order)
 *Input: [1, 2, 3], [1, 2, 3,] → Output: true
 */

fun isTwoListEqual(numbersListOne: List<Int>, numbersListTwo: List<Int>,): Boolean{

    for(i in numbersListOne.indices){
        if(numbersListOne[i] != numbersListTwo[i] || numbersListOne.size != numbersListTwo.size){
            return false
        }
    }

    return true
}