package com.rakib.string

/**
 *Determine if a String Has All Unique Characters
 * Input: "abcdef" → Output: true
 */

fun checkStringUniqueCharacters(str: String): Boolean {

    val stringSorted = str.toSet().joinToString("")

    return str.length == stringSorted.length
}