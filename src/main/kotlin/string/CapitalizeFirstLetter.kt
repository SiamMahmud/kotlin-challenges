package com.rakib.string

/**
 *Capitalize First Letter of Each Word
 * Input: "kotlin is awesome"
 * Output: "Kotlin Is Awesome"
 */

fun capitalizeFirstLetter(str: String): String {

    val splitString = str.split(" ")
    var newString = ""

    for(word in splitString){
        newString += word[0].uppercaseChar()+ word.substring(1) + " "
    }

    return newString
}