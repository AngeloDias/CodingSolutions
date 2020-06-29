package sideImplementations

class OddOccurrencesInArray {
    var unpairedValue = -1

    fun bitwiseSolution(A: IntArray): Int {
        var retBitNum = 0

        A.forEach {
            retBitNum = retBitNum xor it
        }

        return retBitNum
    }

    fun bitwiseSolutionUsingMyXor(A: IntArray): Int {
        var retBitNum = 0

        A.forEach {
            retBitNum = myBitwiseXorFrom(retBitNum, it)
        }

        return retBitNum
    }

    private fun myBitwiseXorFrom(numberA: Int, withNumberB: Int): Int {
        val firstOperand = numberA and withNumberB.inv()
        val secondOperand = numberA.inv() and withNumberB

        return firstOperand or secondOperand
    }

    fun solution(A: IntArray): Int {
        val freqNumbers = HashMap<Int, Int>()

        for(i in A.indices) {
            if(!freqNumbers.contains(A[i])) {
                freqNumbers[A[i]] = 1
            } else {
                freqNumbers[A[i]] = freqNumbers[A[i]]!!.plus(1)
            }
        }

        var key = -1

        freqNumbers.mapKeys { if(it.value == 1) key = it.key }

        return key
    }

    fun generateArrayInput(size: Int): IntArray {
        var result = intArrayOf()

        for(i in 0 until size/4) {
            var randNum = (0..10000).random()

            for(j in 0 until (size/4)) {
                result += randNum
            }

            if(i == (size/4)/2) {
                unpairedValue = (10001..100000).random()
                result += unpairedValue
            }

            randNum = (100001..1000000).random()

            for(k in 0 until (size/4)) {
                result += randNum
            }

            randNum = (1000001..1000000000).random()

            for(k in 0 until (size/4)) {
                result += randNum
            }
        }

        return result
    }

}
