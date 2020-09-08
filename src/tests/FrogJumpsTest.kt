package tests

import org.junit.jupiter.api.Test
import org.junit.jupiter.api.TestInstance
import sideImplementations.FrogJumps
import kotlin.test.assertEquals

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class FrogJumpsTest {

    @Test
    fun solutionTest() {
        assertEquals(3, FrogJumps.solution(10, 85, 30))
        assertEquals(0, FrogJumps.solution(10, 10, 30))
        assertEquals(1, FrogJumps.solution(10, 11, 1))
        assertEquals(2, FrogJumps.solution(10, 12, 1))
        assertEquals(3695652, FrogJumps.solution(10, 85000000, 23))
        assertEquals(1, FrogJumps.solution(10, 19, 10))
    }

    @Test
    fun iterativeSolutionTest() {
        assertEquals(3, FrogJumps.iterativeSolution(10, 85, 30))
        assertEquals(0, FrogJumps.iterativeSolution(10, 10, 30))
        assertEquals(1, FrogJumps.iterativeSolution(10, 11, 1))
        assertEquals(2, FrogJumps.iterativeSolution(10, 12, 1))
        assertEquals(3695652, FrogJumps.iterativeSolution(10, 85000000, 23))
        assertEquals(1, FrogJumps.iterativeSolution(10, 19, 10))
    }

}
