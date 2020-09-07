package utils

class Functions {

    companion object {

        fun iterativeFactorial(number: Int): Int {
            var factorial = 1

            for(i in number downTo 1) {
                factorial *= i
            }

            return factorial
        }

        fun iterativeFibonacci(nthTerm: Int): Int {
            val fibonacciList = arrayOf(0, 1)
            var i = 0
            var temp: Int

            while(i < (nthTerm - 1)) {
                temp = fibonacciList[1]
                fibonacciList[1] += fibonacciList[0]
                fibonacciList[0] = temp

                i++
            }


            return fibonacciList[1]
        }

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
