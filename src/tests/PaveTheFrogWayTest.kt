package tests

import org.junit.jupiter.api.Test
import org.junit.jupiter.api.TestInstance
import sideImplementations.PaveTheFrogWay
import kotlin.test.assertEquals

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class PaveTheFrogWayTest {

    @Test
    fun solutionTest() {
        var array = intArrayOf(1, 3, 1, 4, 2, 3, 5, 4)

        assertEquals(6, PaveTheFrogWay.solution(5, array))

        array = intArrayOf(2, 2, 2, 2)

        assertEquals(-1, PaveTheFrogWay.solution(2, array))

        array = intArrayOf(1, 3, 1, 4, 3, 3, 5, 4, 3, 1, 1, 2, 5)

        assertEquals(11, PaveTheFrogWay.solution(5, array))

        array = intArrayOf(1, 3, 1, 3, 2, 1, 3)

        assertEquals(4, PaveTheFrogWay.solution(3, array))
    }

}
