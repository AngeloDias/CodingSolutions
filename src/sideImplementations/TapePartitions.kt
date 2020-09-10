package sideImplementations

import kotlin.math.abs

class TapePartitions {

    companion object {

        fun solution(a: IntArray): Int {
            var sumBefore = 0
            var minimalDiff = 100000

            for(i in a.indices) {
                if(i > 0) {
                    a[i-1] = sumBefore
                }

                sumBefore += a[i]
            }

            for(i in 0 until a.size - 1){
                val diff = abs(sumBefore - (2 * a[i]))

                if(diff < minimalDiff) {
                    minimalDiff = diff
                }
            }

            return minimalDiff
        }

    }

}
