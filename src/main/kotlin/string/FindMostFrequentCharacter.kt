package com.rakib.string

/**
 *Find the Most Frequent Character
 * Input: "success" → Output: 's' occurs 3 times
 */

fun findMostFrequentCharacter(str: String): String {
    val frequency = mutableMapOf<Char, Int>()

    for(char in str){
        frequency[char] = frequency.getOrDefault(char, 0)+1
    }

    var maxChar = ' '
    var maxCount = 0

    for((ch, count) in frequency){
        if(count>maxCount){
            maxChar = ch
            maxCount = count

        }
    }
    return "$maxChar : $maxCount"
}