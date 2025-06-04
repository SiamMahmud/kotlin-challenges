package com.rakib.string

/**
 *Compress a String (Run Length Encoding)
 * Input: "aaabbc" → Output: "a3b2c1"
 */

fun countEachCharacter(str: String): String {
    val frequency = mutableMapOf<Char, Int>()
    var countCharacter = ""

    for(ch in str){
        frequency[ch] = frequency.getOrDefault(ch, 0)+1
    }
    for((ch, count) in frequency){
        countCharacter += "$ch$count"
    }
    return countCharacter
}