package com.rakib.string

/**
 *Check if a String Contains Only Digits
 * Input: "123456" Output: true
 * Input: "123a56" Output: false
 */

fun isStringContainDigit(str: String): Boolean {
    for(ch in str){
        if(!ch.isDigit()){
            return false
        }
    }
    return true
}