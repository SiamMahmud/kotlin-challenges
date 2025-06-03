package com.rakib.string

/**
 * Reverses each word in a given string while preserving their original order.
 * Example:
 * Input: "Hello Kotlin World"
 * Output: "olleH niltoK dlroW"
 */
fun reverseStringWord(str: String): String{

    var rString = str.split(" ").joinToString (" ") { it.reversed() }

    return rString
}