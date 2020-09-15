package sideImplementations

import utils.Functions

class CheckWhetherArrayIsPermutation {

    companion object {
        fun solution(a: IntArray): Int {
            var elementsSum = 0
            var smallestElement = 1000000001
            var biggestElement = 0
            //change it for bitwise operations
            val numbersFromInput = IntArray(100000)

            for(i in a.indices) {
                elementsSum += a[i]

                if(numbersFromInput[a[i] - 1] == 0){
                    numbersFromInput[a[i] - 1]++
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
                && elementsSum == Functions.calculateSequenceSum(smallestElement, a.size).toInt()
                && numbersFromInput[0] > 0) {
                return 1
            }

            return 0
        }
    }
}
