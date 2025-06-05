package com.rakib.string

/**
 *Remove All Non-Alphabetic Characters
 * Input: "Th1s !s a te3st." → Output: "Thssatest"
 */

fun removeNonAlphabeticCharacters(str: String): String {
    return str.filter{it.isLetter()}
}