package sideImplementations

import utils.Functions

class CheckWhetherArrayIsPermutation {

    companion object {
        fun solution(a: IntArray): Int {
            var elementsSum = 0
            var smallestElement = 1000000001
            var biggestElement = 0
            val numbersFromInput = IntArray(100000)
            var bitwise = 0
            var mask: Int

            for(i in a.indices) {
                elementsSum += a[i]
                mask = 1 shl a[i]

                if((bitwise and mask) == 0) {
                    bitwise = bitwise or mask
                } else {
                    return 0
                }

//                if(numbersFromInput[a[i] - 1] == 0){
//                    numbersFromInput[a[i] - 1]++
//                } else {
//                    return 0
//                }

                if (a[i] < smallestElement) {
                    smallestElement = a[i]
                }

                if (a[i] > biggestElement) {
                    biggestElement = a[i]
                }
            }

            if((biggestElement == 1 && a.size == 1) || a.size > 1
                && elementsSum == Functions.calculateSequenceSum(smallestElement, biggestElement, a.size).toInt()) {
                return 1
            }

            return 0
        }
    }
}
