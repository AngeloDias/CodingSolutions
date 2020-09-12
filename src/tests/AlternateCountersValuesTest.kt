package tests

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.TestInstance
import sideImplementations.AlternateCountersValues

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class AlternateCountersValuesTest {

    @Test
    fun solutionTest() {
        var array = intArrayOf(3, 4, 4, 6, 1, 4, 4)
        var expectedArray = intArrayOf(3, 2, 2, 4, 2)

        Assertions.assertArrayEquals(expectedArray, AlternateCountersValues.solution(5, array))

        array = intArrayOf(3, 4, 4, 6, 1, 5, 4)
        expectedArray = intArrayOf(3, 2, 2, 3, 3)

        Assertions.assertArrayEquals(expectedArray, AlternateCountersValues.solution(5, array))

        array = intArrayOf(1, 2, 2, 2, 1, 2, 2)
        expectedArray = intArrayOf(2)

        Assertions.assertArrayEquals(expectedArray, AlternateCountersValues.solution(1, array))

        array = intArrayOf(2, 2, 2, 2, 2)
        expectedArray = intArrayOf(0)

        Assertions.assertArrayEquals(expectedArray, AlternateCountersValues.solution(1, array))

        array = intArrayOf(1)
        expectedArray = intArrayOf(1)

        Assertions.assertArrayEquals(expectedArray, AlternateCountersValues.solution(1, array))

        array = intArrayOf(2)
        expectedArray = intArrayOf(0)

        Assertions.assertArrayEquals(expectedArray, AlternateCountersValues.solution(1, array))

        array = intArrayOf(2, 1)
        expectedArray = intArrayOf(1)

        Assertions.assertArrayEquals(expectedArray, AlternateCountersValues.solution(1, array))

        array = intArrayOf(1, 2)
        expectedArray = intArrayOf(1)

        Assertions.assertArrayEquals(expectedArray, AlternateCountersValues.solution(1, array))

        array = intArrayOf(1, 2)
        expectedArray = intArrayOf(1, 1, 0, 0, 0, 0, 0)

        Assertions.assertArrayEquals(expectedArray, AlternateCountersValues.solution(7, array))

        array = intArrayOf(8)
        expectedArray = intArrayOf(0, 0, 0, 0, 0, 0, 0)

        Assertions.assertArrayEquals(expectedArray, AlternateCountersValues.solution(7, array))

        array = intArrayOf(3, 4, 4, 6, 1, 5, 4, 1, 1, 6, 4, 3, 3)
        expectedArray = intArrayOf(5, 5, 7, 6, 5)

        Assertions.assertArrayEquals(expectedArray, AlternateCountersValues.solution(5, array))
    }

}
