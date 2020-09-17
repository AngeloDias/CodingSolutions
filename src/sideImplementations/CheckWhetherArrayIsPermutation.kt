package sideImplementations

import utils.Functions

class CheckWhetherArrayIsPermutation {

    companion object {
        fun solution(a: IntArray): Int {
            var elementsSum = 0L
            var smallestElement = 1000000001
            var biggestElement = 0
            val numbersInSequenceMap = HashMap<Int, Int>()

            for(i in a.indices) {
                elementsSum += a[i]

                if(!numbersInSequenceMap.containsKey(a[i])) {
                    numbersInSequenceMap[a[i]] = 1
                } else {
                    return 0
                }

                if (a[i] < smallestElement) {
                    smallestElement = a[i]
                }

                if (a[i] > biggestElement) {
                    biggestElement = a[i]
                }
            }

            if((biggestElement == 1 && a.size == 1) || a.size > 1
                && elementsSum == Functions.calculateSequenceSum(smallestElement, a.size).toLong()
                && numbersInSequenceMap.containsKey(1)) {
                return 1
            }

            return 0
        }
    }
}
