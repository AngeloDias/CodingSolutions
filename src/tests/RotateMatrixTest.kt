package tests

import firstChapter.RotateMatrix
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
        var matrix = Utils.generateMatrixOfInt(2, 2)
    }

}
