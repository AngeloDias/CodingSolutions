package sideImplementations

import kotlin.math.floor

class GenomicRangeQuery {

    companion object {
        fun solution(s: String, p: IntArray, q: IntArray): IntArray {
            val prefixSum = IntArray(s.length + 1)

            // calculate the prefix sum
            for(k in 1 until prefixSum.size) {
                prefixSum[k] = prefixSum[k - 1] + convertNucleotideTypeToImpactFactor(s[k-1])
            }

            for(k in q.indices) {
                print("k: $k; prefixSum[q[k] + 1]: ${prefixSum[q[k] + 1]}; p[k]: ${p[k]}; q[k]: ${q[k]}; q[k] - p[k] + 1: ${q[k] - p[k] + 1}; sumInSlice(prefixSum, p[k], q[k]): ${sumInSlice(prefixSum, p[k], q[k])}\n")
                p[k] = floor(sumInSlice(prefixSum, p[k], q[k]) / (q[k] - p[k] + 1).toDouble()).toInt()
            }

//            for(k in q.indices) {
//                var minimalFactor = 5
//
//                for(i in p[k] until q[k] + 1) {
//                    val factor = convertNucleotideTypeToImpactFactor(s[i])
//
//                    if(factor < minimalFactor) {
//                        minimalFactor = factor
//                    }
//                }
//
//                p[k] = minimalFactor
//            }

            return p
        }

        private fun convertNucleotideTypeToImpactFactor(type: Char): Int {

            return when (type) {
                'A' -> {
                    1
                }
                'C' -> {
                    2
                }
                'G' -> {
                    3
                }
                else -> {
                    4
                }
            }

        }

        private fun sumInSlice(prefixSum: IntArray, firstPositionInSlice: Int, lastPositionInSlice: Int): Int {
            var first = firstPositionInSlice

            if(first == 0) {
                first++
            }

            return prefixSum[lastPositionInSlice + 1] - prefixSum[first]
        }

    }

}
