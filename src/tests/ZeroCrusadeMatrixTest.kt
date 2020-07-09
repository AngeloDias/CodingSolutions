package tests

import firstChapter.ZeroCrusadeMatrix
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.TestInstance

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
internal class ZeroCrusadeMatrixTest {
    private lateinit var zeroMatrix: ZeroCrusadeMatrix

    @BeforeAll
    fun setup() {
        zeroMatrix = ZeroCrusadeMatrix()
    }

    @Test
    fun crusadeTest() {
        var matrix = arrayOf(arrayOf(0,2,3), arrayOf(4,5,6), arrayOf(7,8,9))
        var expected = arrayOf(arrayOf(0,0,0), arrayOf(0,5,6), arrayOf(0,8,9))

        Assertions.assertArrayEquals(expected, zeroMatrix.crusade(matrix))

        matrix = arrayOf(arrayOf(1,2,3), arrayOf(4,0,6), arrayOf(7,8,9))
        expected = arrayOf(arrayOf(1,0,3), arrayOf(0,0,0), arrayOf(7,0,9))

        Assertions.assertArrayEquals(expected, zeroMatrix.crusade(matrix))

        matrix = arrayOf(arrayOf(1,2,3,4), arrayOf(5,6,7,8), arrayOf(9,10,0,11), arrayOf(12,0,13,14))
        expected = arrayOf(arrayOf(1,0,0,4), arrayOf(5,0,0,8), arrayOf(0,0,0,0), arrayOf(0,0,0,0))

        Assertions.assertArrayEquals(expected, zeroMatrix.crusade(matrix))

        matrix = arrayOf(arrayOf(1,2,3,4), arrayOf(5,6,7,0), arrayOf(9,10,11,12), arrayOf(13,14,0,15))
        expected = arrayOf(arrayOf(1,2,0,0), arrayOf(0,0,0,0), arrayOf(9,10,0,0), arrayOf(0,0,0,0))

        Assertions.assertArrayEquals(expected, zeroMatrix.crusade(matrix))

        matrix = arrayOf(arrayOf(1,2,3,4), arrayOf(5,6,7,8), arrayOf(9,10,11,12), arrayOf(13,14,15,0))
        expected = arrayOf(arrayOf(1,2,3,0), arrayOf(5,6,7,0), arrayOf(9,10,11,0), arrayOf(0,0,0,0))

        Assertions.assertArrayEquals(expected, zeroMatrix.crusade(matrix))
    }
}
