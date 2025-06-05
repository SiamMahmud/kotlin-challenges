package com.rakib.string

/**
 *Toggle the Case of Each Character
 * Input: "HeLLo" → Output: "hEllO"
 */

fun toggleCaseEachCharacter(str: String): String {

    var newString = ""

    for(char in str){
        if(char in 'a'..'z'){
            newString += char.uppercaseChar()
        }else{
            newString += char.lowercaseChar()
        }
    }

    return newString
}