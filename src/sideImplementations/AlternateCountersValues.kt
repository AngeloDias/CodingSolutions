package sideImplementations

class AlternateCountersValues {

    companion object {
        // avoid to use inner for
        fun solution(n: Int, a: IntArray): IntArray {
            val counters = IntArray(n)
            var maxCounter = 0
            var isNewMaxCounter = false
            var setMaxCounter = BooleanArray(n)
            var previousMaxCounter = maxCounter
            val countIncrements = IntArray(n)

            for(i in a.indices) {
                if(a[i] == n+1 && maxCounter > 0 && isNewMaxCounter) {
//                    setMaxCounter = BooleanArray(n)
                    isNewMaxCounter = false
                    previousMaxCounter = maxCounter
                }

                if(a[i] in 1..n) {
                    if(!setMaxCounter[a[i] - 1]) {
                        setMaxCounter[a[i] - 1] = true
                        counters[a[i] - 1] = previousMaxCounter
                    }

                    counters[a[i] - 1]++
                    countIncrements[a[i] - 1]++

                    if(counters[a[i] - 1] > maxCounter) {
                        isNewMaxCounter = true
                        maxCounter = counters[a[i] - 1]
                    }
                }
            }

            for(i in setMaxCounter.indices) {
                if(!setMaxCounter[i]) {
                    counters[i] = maxCounter
                }
            }

            return counters
        }
    }
}
