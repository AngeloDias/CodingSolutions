package tests

import org.junit.jupiter.api.Test
import org.junit.jupiter.api.TestInstance
import sideImplementations.FindMissingElemInPerm
import kotlin.test.assertEquals

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class FindMissingElemInPermTest {

    @Test
    fun solutionTest() {
        var array = intArrayOf(2, 3, 1, 5)

        assertEquals(4, FindMissingElemInPerm.solution(array))

        array = intArrayOf(2, 3, 1, 5, 4)

        assertEquals(6, FindMissingElemInPerm.solution(array))
    }

}