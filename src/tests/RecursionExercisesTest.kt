package tests

import org.junit.jupiter.api.Test
import org.junit.jupiter.api.TestInstance
import sideImplementations.RecursionExercises.Companion.findPowerOf
import sideImplementations.RecursionExercises.Companion.printAllEvenOrOddNaturalBetween
import sideImplementations.RecursionExercises.Companion.printAllNaturalBetween
import sideImplementations.RecursionExercises.Companion.theSumOfNumbersFrom
import utils.Functions
import kotlin.test.assertEquals

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

}
