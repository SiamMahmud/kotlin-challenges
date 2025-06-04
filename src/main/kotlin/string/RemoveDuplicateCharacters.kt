package com.rakib.string

/**
 *Remove Duplicate Characters from a String
 * Input: "programming"
 * Output: "progamin"
 */

fun removeDuplicateCharacters(str: String): String {
    var newString = ""

    for (ch in str){
        if (ch !in newString){
            newString += ch
        }
    }
    return newString
}