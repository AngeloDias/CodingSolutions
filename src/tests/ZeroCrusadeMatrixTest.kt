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
    }
}