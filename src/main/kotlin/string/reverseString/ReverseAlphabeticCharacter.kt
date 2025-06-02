package com.rakib.string.reverseString

/**
 *Reverse Only Alphabetic Character
 * Input: "a-bC-dEf-ghIj"
 * Output: "j-Ih-gfE-dCba"
 */
fun ReverseAlphabeticCharacter(str: String): String{
    val digitStr = str.filter{it.isLetterOrDigit()}.reversed()
    var newString = ""
    var index = 0
    for(i in str.indices){
        if(!str[i].isLetter()){
            newString += str[i]
        }else{
            newString += digitStr[index]
            index++
        }
    }
    return newString
}