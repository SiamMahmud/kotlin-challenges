package com.rakib.string

/**
 *Find the Smallest and Largest Word in a Sentence
 * Input: "Kotlin is awesome and concise"
 * Output: Smallest: "is", Largest: "concise"
 */

fun findSmallestLargestWord(str: String): Pair<String, String> {
    val splitString = str.split(" ")
    var smallerWord = splitString[0]
    var largestWord = splitString[0]

    for(i in 1..splitString.size-1){
        if(smallerWord.length>splitString[i].length){
            smallerWord = splitString[i]
        }
    }

    for(i in 1..splitString.size-1){
        if(largestWord.length<splitString[i].length){
            largestWord = splitString[i]
        }
    }

    return Pair(smallerWord, largestWord)
}