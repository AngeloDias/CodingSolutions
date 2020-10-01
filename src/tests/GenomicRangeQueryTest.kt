package tests

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.TestInstance
import sideImplementations.GenomicRangeQuery

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class GenomicRangeQueryTest {

    @Test
    fun solutionTest() {
        var p = intArrayOf(2, 5, 0)
        var q = intArrayOf(4, 5, 6)
        var dnaSequence = "CAGCCTA"

        Assertions.assertArrayEquals(
            intArrayOf(2, 4, 1),
            GenomicRangeQuery.solution(dnaSequence, p, q))
    }

}
