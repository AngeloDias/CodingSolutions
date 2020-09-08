package sideImplementations

class FindMissingElemInPerm {

    companion object {

        fun solution(a: IntArray): Int {
            // counting the total sequence sum and subtracting from the array sum
            var actualSum = 0L

            a.forEach {
                actualSum += it
            }

            val result = (((a.size + 1).toLong() * (a.size + 2)) / 2) - actualSum

            return result.toInt()
        }

    }

}
