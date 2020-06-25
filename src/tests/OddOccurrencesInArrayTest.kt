package tests

import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.TestInstance
import sideImplementations.OddOccurrencesInArray
import kotlin.test.assertEquals

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class OddOccurrencesInArrayTest {
    private lateinit var oddOccurrencesInArray: OddOccurrencesInArray

    @BeforeAll
    fun setup() {
        oddOccurrencesInArray = OddOccurrencesInArray()
    }

    @Test
    fun solutionTest() {
        var array = intArrayOf(4, 5, 4, 4, 4, 5, 12, 5, 9, 5, 9)

        assertEquals(12, oddOccurrencesInArray.solution(array))

        array = oddOccurrencesInArray.generateArrayInput(201)

        assertEquals(oddOccurrencesInArray.unpairedValue, oddOccurrencesInArray.solution(array))

        array = oddOccurrencesInArray.generateArrayInput(601)

        assertEquals(oddOccurrencesInArray.unpairedValue, oddOccurrencesInArray.solution(array))

//        array = oddOccurrencesInArray.generateArrayInput(100003)
//
//        assertEquals(oddOccurrencesInArray.unpairedValue, oddOccurrencesInArray.solution(array))

//        array = oddOccurrencesInArray.generateArrayInput(999999)

//        assertEquals(oddOccurrencesInArray.unpairedValue, oddOccurrencesInArray.solution(array))

        array = intArrayOf(12, 1, 1)

        assertEquals(12, oddOccurrencesInArray.solution(array))

        array = intArrayOf(12)

        assertEquals(12, oddOccurrencesInArray.solution(array))
    }

    @Test
    fun bitwiseSolutionTest() {
        var array = intArrayOf(4, 5, 4, 4, 4, 5, 12, 5, 9, 5, 9)

        assertEquals(12, oddOccurrencesInArray.bitwiseSolution(array))

        array = oddOccurrencesInArray.generateArrayInput(201)

        assertEquals(oddOccurrencesInArray.unpairedValue, oddOccurrencesInArray.bitwiseSolution(array))

        array = oddOccurrencesInArray.generateArrayInput(601)

        assertEquals(oddOccurrencesInArray.unpairedValue, oddOccurrencesInArray.bitwiseSolution(array))

//        array = oddOccurrencesInArray.generateArrayInput(100003)
//
//        assertEquals(oddOccurrencesInArray.unpairedValue, oddOccurrencesInArray.bitwiseSolution(array))

//        array = oddOccurrencesInArray.generateArrayInput(999999)

//        assertEquals(oddOccurrencesInArray.unpairedValue, oddOccurrencesInArray.bitwiseSolution(array))

        array = intArrayOf(12, 1, 1)

        assertEquals(12, oddOccurrencesInArray.bitwiseSolution(array))

        array = intArrayOf(12)

        assertEquals(12, oddOccurrencesInArray.bitwiseSolution(array))
    }

}
