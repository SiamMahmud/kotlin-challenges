package com.rakib.string

/**
 *Check if Two Strings Are Anagrams
 * Input: "listen", "silent" → Output: true
 */

fun checkAnagrams(str1: String, str2: String): Boolean {
    if (str1.length != str2.length) return false
    return str1.toCharArray().sorted() == str2.toCharArray().sorted()
}