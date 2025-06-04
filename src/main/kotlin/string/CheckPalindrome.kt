package com.rakib.string

/**
 *Check Palindrome
 * Input: "madam" Output: "Palindrome"
 * Input: "hello" Output: "Not a palindrome"
 */
fun  checkPalindrome(str: String): String {
    var newStr = ""
    for(i in str.length-1 downTo 0){
        newStr += str[i]
    }
    if(str==newStr){
        return "Palindrome"
    }else{
        return "Not a palindrome"
    }
}