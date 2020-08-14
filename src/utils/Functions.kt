package utils

class Functions {

    companion object {

        fun generateMatrixOfInt(n: Int, m: Int): Array<Array<Int>> {
            var matrix = arrayOf<Array<Int>>()

            for (i in 0 until n) {
                var column = arrayOf<Int>()

                for (j in 0 until m) {
                    column += (-100 until 1000).random()
                }

                matrix += column
            }

            return matrix
        }

        fun sumOfNTermsInArithmeticSequence(first: Int, last: Int): Int {
            var n = 0

            first.rangeTo(last).forEach { _ ->
                n += 1
            }

            return (n * (first + last)) / 2
        }

    }

}
