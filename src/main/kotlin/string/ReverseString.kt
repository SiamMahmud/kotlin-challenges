package com.rakib.string

/**
 *reverse string without build-in function
 */
fun reverseString(str: String): String{
    var rString = ""
    for(i in str.length-1 downTo 0){
        rString += str[i]
    }
    return rString
}