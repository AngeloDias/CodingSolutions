package sideImplementations

import utils.Functions

class CheckWhetherArrayIsPermutation {

    companion object {
        fun solution(a: IntArray): Int {
            var elementsSum = 0
            var smallestElement = 1000000001
            var biggestElement = 0
            var retBitNum = 0UL
            var mask: ULong

            for(i in a.indices) {
                elementsSum += a[i]
                mask = 1UL shl (a[i] - 1) // saving number in binary representation

                // checking if the number was already evaluated in binary representation
                if((retBitNum and mask) == 0UL) {
                    retBitNum = retBitNum or mask // saving the new number to the bit vector
                    if(a.size == 100000) {
                        print("retBitNum attribution: $retBitNum\n")
                    }
                } else {
                    // means that a number is duplicated inside sequence
                    if(a.size == 100000){
                        print("Returned inside bitwise\n")
                        print("retBitNum: $retBitNum\n")
                        print("a[i]: ${a[i]}\n")
                        print("i: $i\n")
                    }

                    retBitNum = retBitNum and mask.inv()

                    if((retBitNum and (retBitNum - 1UL)) != 0UL) {
                        return 0
                    }
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
                && retBitNum and 1UL == 1UL) {
                return 1
            }

            return 0
        }
    }
}
