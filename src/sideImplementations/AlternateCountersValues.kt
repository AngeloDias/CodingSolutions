package sideImplementations

class AlternateCountersValues {

    companion object {
        // avoid to use inner for
        fun solution(n: Int, a: IntArray): IntArray {
            val localCounters = counting(a, n)
            var maxCounter = 0
            val theCounters = IntArray(n)

            for(k in localCounters.indices) {
                val position = a[k] - 1
            }

            for(i in a.indices) {
                val position = a[i] - 1

                if(localCounters[position] > maxCounter) {
                    maxCounter = localCounters[position]
                }

                if(a[i] == n+1) {
                }
            }

            return localCounters
        }

        private fun counting(elements: IntArray, withMaximumValue: Int): IntArray {
            val countElements = IntArray(withMaximumValue + 1)

            for(i in countElements.indices) {
                countElements[elements[i]]++
            }

            return countElements
        }
    }
}
