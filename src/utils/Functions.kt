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

        fun generateIntArrayBy(size: Int, skipNumber: Int): IntArray {
            val array = intArrayOf()

            for(i in 0 until size) {
                if(skipNumber != i+1)
                    array[i] = i+1
            }

            return array
        }

        fun calculateSequenceSum(a1: Int, a2: Int, n: Int): Double {
            return n * ((a1 + a2.toDouble()) / 2)
        }

    }

}
