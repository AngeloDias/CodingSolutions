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
        var array = oddOccurrencesInArray.generateArrayInput(360)

        assertEquals(oddOccurrencesInArray.unpairedValue,
            oddOccurrencesInArray.solution(array))
    }

}
