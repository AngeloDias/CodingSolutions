package sideImplementations

class AlternateCountersValues {

    companion object {
        // avoid to use inner for
        fun solution(n: Int, a: IntArray): IntArray {
            val localCounters = counting(a, n)
            var maxCounter = 0
            val theCounters = IntArray(n)

            // this case can happen when the elements in 'a' are just to update the counters values
            if(localCounters[localCounters.size - 1] > 0) {

                for (i in a.indices) {
                    val position = a[i] - 1

                    if (localCounters[position] > maxCounter) {
                        maxCounter = localCounters[position]
                    }

                    if (a[i] == n + 1) {
                    }
                }

            }

            return theCounters
        }

        private fun counting(elements: IntArray, withMaximumValue: Int): IntArray {
            val countElements = IntArray(withMaximumValue + 2)

            for(i in 0 until countElements.size - 1) {
                countElements[elements[i]]++

                // using the last position to save the sum of the values of the array
                countElements[countElements.size - 1] += countElements[elements[i]]
            }

            return countElements
        }
    }
}
