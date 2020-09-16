package tests

import org.junit.jupiter.api.Test
import org.junit.jupiter.api.TestInstance
import sideImplementations.CheckWhetherArrayIsPermutation
import kotlin.test.assertEquals

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class CheckWhetherArrayIsPermutationTest {

    @Test
    fun solutionTest() {
        var array = intArrayOf(4, 1, 3, 2)

        assertEquals(1, CheckWhetherArrayIsPermutation.solution(array))

        array = intArrayOf(4, 1, 3)

        assertEquals(0, CheckWhetherArrayIsPermutation.solution(array))

        array = intArrayOf(2, 2)

        assertEquals(0, CheckWhetherArrayIsPermutation.solution(array))

        array = intArrayOf(2)

        assertEquals(0, CheckWhetherArrayIsPermutation.solution(array))

        array = intArrayOf(1)

        assertEquals(1, CheckWhetherArrayIsPermutation.solution(array))

        array = intArrayOf(1, 3)

        assertEquals(0, CheckWhetherArrayIsPermutation.solution(array))

        array = intArrayOf(3, 1)

        assertEquals(0, CheckWhetherArrayIsPermutation.solution(array))

        array = intArrayOf(3, 2)

        assertEquals(0, CheckWhetherArrayIsPermutation.solution(array))

        array = intArrayOf(999999999)

        assertEquals(0, CheckWhetherArrayIsPermutation.solution(array))

        array = intArrayOf(9, 5, 7, 3, 2, 7, 3, 1, 10, 8)

        assertEquals(0, CheckWhetherArrayIsPermutation.solution(array))

        array = IntArray(100)

        for(i in array.indices) {
            array[i] = i+2
        }

        assertEquals(0, CheckWhetherArrayIsPermutation.solution(array))

        array = IntArray(100000)

        for(i in array.indices) {
            array[i] = i + 1
        }

        assertEquals(1, CheckWhetherArrayIsPermutation.solution(array))
    }
}
