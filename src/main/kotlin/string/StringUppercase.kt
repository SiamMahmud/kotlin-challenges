package com.rakib.string

/**
 *Convert a String to Uppercase Without Using Built-In Functions
 * Input: "kotlin" Output: "KOTLIN"
 * (Note: you would need to manually convert characters from 'a'..'z' to 'A'..'Z')
 */

fun stringUppercase(str: String): String {
    var newString = ""
    for(char in str){
        newString += (char.code-32).toChar()
    }
    return newString
}