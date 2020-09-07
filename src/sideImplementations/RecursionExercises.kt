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

        fun isPalindromeThe(number: Int): Boolean {
            return number == findTheReverseNumber(number)
        }

        fun sumOfDigitsIn(number: Int): Int {
            var natural = number

            if(natural < 0) {
                natural *= -1
            }

            if (natural / 10 == 0) {
                return natural
            }

            return (natural % 10) + sumOfDigitsIn(natural / 10)
        }

        fun factorialOf(number: Int): Int {
            if(number <= 1) {
                return 1
            }

            return number * factorialOf(number - 1)
        }

        fun findFibonacciTermBy(number: Int): Int {
            if(number <= 2) {
                return 1
            }

            return findFibonacciTermBy(number - 1) + findFibonacciTermBy(number - 2)
        }

        fun findGreatestCommonDivisor(a: Int, b: Int): Int{
            val smallest: Int = if(a < b) {
                a
            } else {
                b
            }

            return gcd(a, b, smallest)
        }

        private fun gcd(a: Int, b: Int, factor: Int): Int {
            if(factor == 1) {
                return 1
            } else if(a % factor == 0 && b % factor == 0) {
                return factor
            }

            return gcd(a, b, factor - 1)
        }

        fun findLeastCommonMultiple(a: Int, b: Int): Int {
            return (a * b) / findGreatestCommonDivisor(a, b)
        }
    }

}
