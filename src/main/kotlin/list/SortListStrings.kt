package com.rakib.list

/**
 *Sort a List of Strings by Length
 *Input: ["apple", "pie", "banana", "kiwi"] → Output: ["pie", "kiwi", "apple", "banana"]
 */

fun sortListStringLength(stringList: List<String>): List<String>{
    val newStringList = stringList.toMutableList()

    for(i in newStringList.indices){
        for(j in i+1..newStringList.size-1){
            if(newStringList[i].length>newStringList[j].length){
                val temp = newStringList[i]
                newStringList[i] = newStringList[j]
                newStringList[j] = temp
                break
            }
        }

    }
    return newStringList
}