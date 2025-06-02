package com.rakib.string.reverseString

/**
 *Remove empty space
 * Input:  " I love to do kotlin "
 * Output: "Ilovetodokotlin"
 */
fun removeEmptySpace(str: String): String {
    return str.filter { it.isLetterOrDigit()}
}