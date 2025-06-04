package com.rakib.string

/**
 *Find the First Non-Repeating Character
 * Input: "swiss" → Output: "w"
 */

fun findFirstNonRepeatingCharacter(str: String): Char {
    var nonRepeatCharacters = ""
    val frequency = mutableMapOf<Char, Int>()

    for(ch in str){
        frequency[ch] = frequency.getOrDefault(ch, 0)+1
    }
    for((char, count) in frequency){
        if(count==1){
            nonRepeatCharacters += char
        }
    }
    return nonRepeatCharacters[0]
}