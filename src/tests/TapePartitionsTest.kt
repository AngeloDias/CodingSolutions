package tests

import org.junit.jupiter.api.Test
import org.junit.jupiter.api.TestInstance
import sideImplementations.TapePartitions
import kotlin.test.assertEquals

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class TapePartitionsTest {

    @Test
    fun solutionTest() {
        assertEquals(1, TapePartitions.solution(intArrayOf(3, 1, 2, 4, 3)))
        assertEquals(2000, TapePartitions.solution(intArrayOf(-1000, 1000)))
    }

}
