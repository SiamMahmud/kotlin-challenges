package com.rakib.array

fun findSecondLargest(numbers: Array<Int>): Int{
    var firstLargestNumber = Int.MIN_VALUE
    var secondLargestNumber = Int.MIN_VALUE

    for(i in numbers.indices){
        if(numbers[i]>firstLargestNumber){
            firstLargestNumber = numbers[i]
        }
    }
    for(i in numbers.indices){
        if( numbers[i]> secondLargestNumber && firstLargestNumber>numbers[i]){
            secondLargestNumber = numbers[i]
        }
    }
    return secondLargestNumber
}