package sideImplementations

import kotlin.math.floor

class GenomicRangeQuery {

    companion object {
        fun solution(s: String, p: IntArray, q: IntArray): IntArray {
            val prefixSum = IntArray(s.length + 1)
            var smallest = 5

            if(s.length == 1) {
                p[0] = convertNucleotideTypeToImpactFactor(s[0])

                return p
            }

            // calculate the prefix sum
            for(k in 1 until prefixSum.size) {
                val factor = convertNucleotideTypeToImpactFactor(s[k-1])

                if (factor < smallest) {
                    smallest = factor
                }

                prefixSum[k] = prefixSum[k - 1] + factor
            }

            for(k in q.indices) {
                if (p[k] == 0 && q[k] == 0) {
                    p[k] = convertNucleotideTypeToImpactFactor(s[k])
                } else {
                    val floor = floor(sumInSlice(prefixSum, p[k], q[k]) / (q[k] - p[k] + (1/smallest)).toDouble()).toInt()

                    p[k] = if (floor == 0) {
                        1
                    } else {
                        floor
                    }

                }
            }

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
