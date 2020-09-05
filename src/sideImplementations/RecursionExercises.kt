package sideImplementations

class RecursionExercises {

    companion object {

        fun findPowerOf(baseNumber: Int, byExponent: Int): Int {
            if (byExponent > 0) {
                return findPowerOf(baseNumber, byExponent - 1) * baseNumber
            } else if (byExponent < 0) {
                return findPowerOf(baseNumber, byExponent + 1) * (1 / baseNumber)
            }

            return 1
        }

        fun printAllNaturalBetween(numberA: Int, andNumberB: Int): Int {
            return if (andNumberB < numberA || andNumberB == numberA) {
                print("$numberA ")

                numberA
            } else {
                val ret = printAllNaturalBetween(numberA, andNumberB-1) + 1

                print("$ret ")
                ret
            }
        }

        fun printAllEvenOrOddNaturalBetween(numberA: Int, andNumberB: Int) {

            if(numberA > andNumberB) {
                return
            }

            print("$numberA ")

            printAllEvenOrOddNaturalBetween(numberA + 2, andNumberB)
        }

        fun theSumOfNumbersFrom(numberA: Int, toNumberB: Int): Int {
            if(numberA > toNumberB) {
                return 0
            }

            return theSumOfNumbersFrom(numberA + 1, toNumberB) + numberA
        }

        fun findTheReverseNumber(number: Int): Int {
            return reverseTheNumber(number, 0)
        }

        private fun reverseTheNumber(number: Int, reverse: Int): Int {
            val result = (reverse * 10) + (number % 10)

            if(number / 10 == 0) {
                return result
            }

            return reverseTheNumber(number / 10, result)
        }

    }

}
