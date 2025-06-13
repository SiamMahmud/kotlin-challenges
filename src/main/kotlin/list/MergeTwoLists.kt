package com.rakib.list

/**
 *Merge Two Lists and Remove Duplicates using distinct()
 *Input: [1, 2, 3], [3, 4, 5]
 *Output: [1, 2, 3, 4, 5]
 */

fun margeRemoveDuplicates(listOne: List<Int>, listTwo: List<Int>): List<Int>{
    return (listOne + listTwo).distinct()
}
