package sideImplementations

class SmallestNumberNotInSequence {

    companion object {

        fun solution(a: IntArray): Int {
            val numbersMemory = IntArray(1000001)
            var biggestInArray = -1000000

            for(i in a.indices) {
                if(a[i] > 0 && numbersMemory[a[i]] == 0) {
                    numbersMemory[a[i]]++
                }

                if(a[i] > biggestInArray) {
                    biggestInArray = a[i]
                }
            }

            for(i in numbersMemory.indices) {
                if(i > 0 && numbersMemory[i] == 0) {
                    return i
                }

                if(i+1 == numbersMemory.size) {
                    return biggestInArray + 1
                }
            }

            return 1
        }

    }
}
