package com.rakib.string

/**
 *Find All Duplicate Words in a Sentence
 * Input: "this is a test this is only a test"
 * Output: ["this", "is", "a", "test"]
 */

fun findDuplicateWords(str: String): String {

    val splitStr = str.split(" ")
    val wordCount = mutableMapOf<String, Int>()
    var newString = ""

    for(word in splitStr){
        wordCount[word] = wordCount.getOrDefault(word,0)+1
    }
    for((word, count) in wordCount){
        if(count>1){
            newString += word + " "
        }
    }
    return newString
}