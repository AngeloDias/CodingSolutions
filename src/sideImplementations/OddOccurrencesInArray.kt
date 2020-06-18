package sideImplementations

class OddOccurrencesInArray {
    var unpairedValue = -1

    fun solution(A: IntArray): Int {
        var unpairedVal = -1
        val numbers = ArrayList<Int>()

        for(i in A.indices) {
            if(!numbers.contains(A[i])) {
                numbers.add(A[i])
                unpairedVal = A[i]
            }
        }

        return unpairedVal
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
