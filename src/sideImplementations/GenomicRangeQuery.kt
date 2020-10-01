package sideImplementations

class GenomicRangeQuery {

    companion object {
        fun solution(s: String, p: IntArray, q: IntArray): IntArray {
            val prefixSum = IntArray(s.length + 1)

            // calculate the prefix sum
            for(k in 1 until s.length + 1) {
                prefixSum[k] = prefixSum[k - 1] + convertNucleotideTypeToImpactFactor(s[k-1])
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

    }

}
