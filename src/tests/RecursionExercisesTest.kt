package tests

import org.junit.jupiter.api.Test
import org.junit.jupiter.api.TestInstance
import sideImplementations.RecursionExercises
import sideImplementations.RecursionExercises.Companion.findPowerOf
import sideImplementations.RecursionExercises.Companion.printAllEvenOrOddNaturalBetween
import sideImplementations.RecursionExercises.Companion.printAllNaturalBetween
import sideImplementations.RecursionExercises.Companion.theSumOfNumbersFrom
import utils.Functions
import kotlin.test.assertEquals
import kotlin.test.assertFalse
import kotlin.test.assertTrue

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class RecursionExercisesTest {

    @Test
    fun findPowerOfTest() {
        assertEquals(25, findPowerOf(5, 2))
        assertEquals(1/25, findPowerOf(5, -2))
        assertEquals(1, findPowerOf(5, 0))
    }

    @Test
    fun printAllNaturalBetweenOneAndTest() {
        printAllNaturalBetween(-0, 7)

        print("\n")
        printAllNaturalBetween(-500, 7)

        print("\n")
        printAllNaturalBetween(-500, -777)

        print("\n")
        printAllNaturalBetween(3, 3)
    }

    @Test
    fun printAllEvenOrOddNaturalBetweenTest() {
        printAllEvenOrOddNaturalBetween(0, 7)

        print("\n")
        printAllEvenOrOddNaturalBetween(-50, 3)

        print("\n")
        printAllEvenOrOddNaturalBetween(-51, -777)

        print("\n")
        printAllEvenOrOddNaturalBetween(-51, -8)

        print("\n")
        printAllEvenOrOddNaturalBetween(3, 3)

        print("\n")
        printAllEvenOrOddNaturalBetween(2, 3)
    }

    @Test
    fun printSumOfNumbersFromTest() {
        var first = 1
        var last = 10
        var expected = Functions.sumOfNTermsInArithmeticSequence(first, last)

        assertEquals(expected, theSumOfNumbersFrom(first, last))

        first = -9
        last = 30
        expected = Functions.sumOfNTermsInArithmeticSequence(first, last)

        assertEquals(expected, theSumOfNumbersFrom(first, last))

        first = -9
        last = -30
        expected = Functions.sumOfNTermsInArithmeticSequence(first, last)

        assertEquals(expected, theSumOfNumbersFrom(first, last))
    }

    @Test
    fun findTheReverseNumberTest() {
        var number = "12345"

        assertEquals(number.reversed().toInt(), RecursionExercises.findTheReverseNumber(number.toInt()))

        number = "78451221"

        assertEquals(number.reversed().toInt(), RecursionExercises.findTheReverseNumber(number.toInt()))

        number = "1"

        assertEquals(number.reversed().toInt(), RecursionExercises.findTheReverseNumber(number.toInt()))

        number = "10001"

        assertEquals(number.reversed().toInt(), RecursionExercises.findTheReverseNumber(number.toInt()))

        number = "1001"

        assertEquals(number.reversed().toInt(), RecursionExercises.findTheReverseNumber(number.toInt()))
    }

    @Test
    fun isPalindromeTheTest() {
        assertTrue(RecursionExercises.isPalindromeThe(121))
        assertTrue(RecursionExercises.isPalindromeThe(11))
        assertTrue(RecursionExercises.isPalindromeThe(1))
        assertTrue(RecursionExercises.isPalindromeThe(102201))
        assertTrue(RecursionExercises.isPalindromeThe(-1))
        assertTrue(RecursionExercises.isPalindromeThe(-11))

        assertFalse(RecursionExercises.isPalindromeThe(12))
        assertFalse(RecursionExercises.isPalindromeThe(125621))
        assertFalse(RecursionExercises.isPalindromeThe(1256721))
    }

    @Test
    fun sumOfDigitsInTest() {
        assertEquals(10, RecursionExercises.sumOfDigitsIn(1234))
        assertEquals(5, RecursionExercises.sumOfDigitsIn(5))
        assertEquals(5, RecursionExercises.sumOfDigitsIn(-5))
        assertEquals(16, RecursionExercises.sumOfDigitsIn(-3715))
        assertEquals(0, RecursionExercises.sumOfDigitsIn(0))
    }

    @Test
    fun factorialOfTest() {
        var number = 56

        assertEquals(Functions.iterativeFactorial(number), RecursionExercises.factorialOf(number))

        number = 5

        assertEquals(Functions.iterativeFactorial(number), RecursionExercises.factorialOf(number))

        number = 10

        assertEquals(Functions.iterativeFactorial(number), RecursionExercises.factorialOf(number))

        number = 15

        assertEquals(Functions.iterativeFactorial(number), RecursionExercises.factorialOf(number))

        number = -5

        assertEquals(Functions.iterativeFactorial(number), RecursionExercises.factorialOf(number))
    }

}
