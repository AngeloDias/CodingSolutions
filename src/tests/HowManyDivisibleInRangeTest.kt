package tests

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.TestInstance
import sideImplementations.HowManyDivisibleInRange

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class HowManyDivisibleInRangeTest {

    @Test
    fun solution() {
        assertEquals(3, HowManyDivisibleInRange.solution(6, 11, 2))
        assertEquals(2000000001, HowManyDivisibleInRange.solution(0, 2000000000, 1))
    }

}
