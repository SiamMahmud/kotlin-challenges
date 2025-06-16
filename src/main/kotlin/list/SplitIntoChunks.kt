package com.rakib.list

/**
 *Split a List into Chunks of N Elements
 *Input: [1, 2, 3, 4, 5, 6], Chunk Size: 2 → Output: [[1, 2], [3, 4], [5, 6]]
 */

fun splitIntoChunks(numberList: List<Int>, n : Int): List<List<Int>>{
    return numberList.chunked(n)
}