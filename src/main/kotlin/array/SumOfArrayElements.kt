package com.rakib.array

/**
 *Sum of Elements in Array
 * Input: [1, 2, 3, 4, 5]
 * Output: 15
 */

fun sumOfArrayElements(numbers: Array<Int>): Int {
    var sum = 0
    for(num in numbers ){
        sum += num
    }
    return sum
}