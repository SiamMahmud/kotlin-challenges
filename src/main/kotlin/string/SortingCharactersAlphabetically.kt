package com.rakib.string

/**
 *Sort Characters in a String Alphabetically
 * Input: "kotlin" → Output: "iklnot"
 */

fun sortingCharactersAlphabetically(str: String): String{
    return str.toList().sorted().joinToString("")
}