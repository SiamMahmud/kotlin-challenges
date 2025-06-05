package com.rakib.string

/**
 *Count Uppercase and Lowercase Letters in a String
 * Input: "HeLLo" → Output: Uppercase: 3, Lowercase: 2
 */

fun countUppercaseLowercase(str: String): Pair<Int, Int> {
    var uppercase = 0
    var lowercase = 0

    for(ch in str){
        if(ch in 'A'..'Z'){
            uppercase++
        }else{
            lowercase++
        }
    }
    return Pair(uppercase, lowercase)

}