package sideImplementations

class PaveTheFrogWay {

    companion object {

        fun solution(x: Int, a: IntArray): Int {
            val arrayPositions = IntArray(x)
            var sumPositions = 0

            for (i in a.indices) {
                if(arrayPositions[a[i] - 1] == 0) {
                    arrayPositions[a[i] - 1]++
                    sumPositions++
                }

                if(sumPositions == x) {
                    return i
                }
            }

            return -1
        }

    }

}
