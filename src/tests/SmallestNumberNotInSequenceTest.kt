package tests

import org.junit.jupiter.api.Test
import org.junit.jupiter.api.TestInstance
import sideImplementations.SmallestNumberNotInSequence
import kotlin.test.assertEquals

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class SmallestNumberNotInSequenceTest {

    @Test
    fun solutionTest() {
        var array = intArrayOf(1, 3, 6, 4, 1, 2)

        assertEquals(5, SmallestNumberNotInSequence.solution(array))

        array = intArrayOf(1, 2, 3)

        assertEquals(4, SmallestNumberNotInSequence.solution(array))

        array = intArrayOf(-1, -2)

        assertEquals(1, SmallestNumberNotInSequence.solution(array))

        array = intArrayOf(15, 13, 26, 41, 81, 2)

        assertEquals(1, SmallestNumberNotInSequence.solution(array))

        val tempList = ArrayList<Int>()

        for(i in 0 until 100000) {
            tempList.add(i + 1)
        }

        assertEquals(100000 + 1, SmallestNumberNotInSequence.solution(tempList.toIntArray()))
    }
}
