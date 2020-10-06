package sideImplementations

class AlternateCountersValues {

    companion object {
        // avoid to use inner for
        fun solution(n: Int, a: IntArray): IntArray {
            val counters = counting(a, n)
            var maxCounter = 0

            for(i in a.indices) {
                val position = a[i] - 1

                if(counters[position] > maxCounter) {
                    maxCounter = counters[position]
                }

                if(a[i] == n+1) {
                }
            }

            return counters
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
