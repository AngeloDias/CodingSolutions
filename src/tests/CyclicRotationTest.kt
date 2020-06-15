package tests

import org.junit.jupiter.api.Assertions.assertArrayEquals
import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.TestInstance
import sideImplementations.CyclicRotation

//([3, 8, 9, 7, 6], 3)
//([3, 52, 74, 355, -100, 23, 11, 67, 8, 9, 7, 6], 1)
//([3, 8, 9, 7, 41, 85, 32, 53, 45, 65 , 7, 85, 85, 3], 15)
//([3, 9, 7, 6], 20)
//([3, 8, 9, 7, 6, 77], 1000)
//([3, 8, 100, 52, 81, 1000, 741, 301, 98, 7, 6], 7)
//([22, 97, 43, 57, 29, 9, 7, 6], 2)
//([], 3)
//([9], 30)
//([3, 8, 54, 81, 63, 27, 54, 36, 71, 95, 92, 73, 42, 6], 0)


@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class CyclicRotationTest {
    private lateinit var cyclicRotation: CyclicRotation

    @BeforeAll
    fun setup() {
        cyclicRotation = CyclicRotation()
    }

    @Test
    fun solutionTest() {
        val expected = intArrayOf(3, 8, 9, 7, 6)

        assertArrayEquals(expected, cyclicRotation.solution(intArrayOf(7, 6, 3, 8, 9), 3))
    }

}
