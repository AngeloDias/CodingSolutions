package tests

import firstChapter.RotateMatrix
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.TestInstance

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class RotateMatrixTest {
    private lateinit var rotateMatrix: RotateMatrix

    @BeforeAll
    fun setup() {
        rotateMatrix = RotateMatrix()
    }

    @Test
    fun rotateMatrix90DegreesTest() {
        var matrix = arrayOf(arrayOf(1, 2, 3), arrayOf(4, 5, 6), arrayOf(7, 8, 9))
        var expected = arrayOf(arrayOf(7,4,1), arrayOf(8,5,2), arrayOf(9,6,3))

        Assertions.assertArrayEquals(expected, rotateMatrix.rotateMatrix90Degrees(matrix))

        matrix = arrayOf(arrayOf(1, 2, 3, 100), arrayOf(4, 5, 6, 200), arrayOf(7, 8, 9, 300), arrayOf(10, 11, 12, 400))
        expected = arrayOf(arrayOf(10,7,4,1), arrayOf(11,8,5,2), arrayOf(12,9,6,3), arrayOf(400,300,200,100))

        Assertions.assertArrayEquals(expected, rotateMatrix.rotateMatrix90Degrees(matrix))
    }

}
