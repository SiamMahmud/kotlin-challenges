package com.rakib.string

/**
 *Check if a String Ends With Another String Without Using Built-ins
 * Input: "HelloWorld", "World" → Output: true
 */

fun checkStringEndWithAnotherString(str: String, lastStr: String): Boolean {
    for(i in lastStr.indices){
        if(lastStr[lastStr.length-1-i] != str[str.length-1-i]){
            return false
        }
    }
    return true
}