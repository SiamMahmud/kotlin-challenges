package com.rakib.string
/**
 *Count the Number of Words in a Sentence
 * Input: "Kotlin is a modern programming language"
 * Output: 6
 */
fun countWordInSentence(str: String): Int {
    val stringSplit= str.split(" ")
    var totalWord = stringSplit.size
    return totalWord
}