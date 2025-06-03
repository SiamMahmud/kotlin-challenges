package com.rakib.string

/**
 *Convert to a Char Array and Swap Characters In-Place
 * Input: "abcd"
 * Operation: Swap first and last, second and second-last, etc.
 * Output: "dcba"
 */

fun swapStringChar(str: String): String {
    val arrayStr = str.toCharArray()
    val newCharArray = CharArray(arrayStr.size)

    for(i in arrayStr.indices){
        newCharArray[i] = arrayStr[arrayStr.size-1-i]
        newCharArray[newCharArray.size-1-i] = arrayStr[i]
    }
    return newCharArray.joinToString(separator = "")
}