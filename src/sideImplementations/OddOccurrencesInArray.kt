package sideImplementations

class OddOccurrencesInArray {

    fun solution(A: IntArray): Int {
        var unpairedVal = -1
        var numbers = arrayOf<Int>()

        for(i in A.indices) {
            if(!numbers.contains(A[i])) {
                numbers += A[i]
                unpairedVal = A[i]
            }
        }

        return unpairedVal
    }

}
