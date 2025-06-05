package com.rakib.string

/**
 *Find All Palindromic Words in a Sentence
 * Input: "madam went to racecar level noon"
 * Output: ["madam", "racecar", "level", "noon"]
 */

fun findPalindromicWords(str: String): String {
    val splitString = str.split(" ")
    var palindromicWords = ""

    for(word in splitString){
        if(word == word.reversed()){
            palindromicWords += word + " "
        }
    }
    return palindromicWords
}