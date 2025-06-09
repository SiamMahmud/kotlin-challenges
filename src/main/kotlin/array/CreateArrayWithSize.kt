package com.rakib.array

import java.util.Scanner

/**
 *Create Array of 5 Integers and Print All
 *Input: [5, 10, 15, 20, 25]
 *Output: 5 10 15 20 25
 */

fun createArrayWithSize(numbers: Int): IntArray {

    val scanner = Scanner(System.`in`)
    val newArray = IntArray(5)
    for(i in 1..numbers){
        print("Enter ${i} numbers: ")
        newArray[i-1] = scanner.nextInt()
    }
    return newArray
}