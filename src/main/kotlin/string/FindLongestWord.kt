package com.rakib.string

fun findLongestWord(str: String): String {
    val splitString = str.split(" ")
    var longestWord = splitString[0]
    for(word in splitString){
        if(word.length>longestWord.length){
            longestWord = word
        }
    }
    return longestWord
}