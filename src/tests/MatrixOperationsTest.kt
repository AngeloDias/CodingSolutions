package tests

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.TestInstance
import sideImplementations.MatrixOperations

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class MatrixOperationsTest {
    private lateinit var matrixOperations: MatrixOperations

    @BeforeAll
    fun setup() {
        matrixOperations = MatrixOperations()
    }

    @Test
    fun multiplyMatricesTest() {
        val expectedMultiplication = arrayOf(arrayOf(-6, 25), arrayOf(-14, 75))
        val a = arrayOf(arrayOf(3, 1), arrayOf(7, 4))
        val b = arrayOf(arrayOf(-2, 5), arrayOf(0, 10))

        Assertions
            .assertArrayEquals(expectedMultiplication, matrixOperations.multiplyMatrices(a, b))
    }

    @Test
    fun addOrSubtractTwoMatricesTest() {
        val expectedSum = arrayOf(arrayOf(-10, 28), arrayOf(5, -45))
        val expectedSubtract = arrayOf(arrayOf(50, 128), arrayOf(-65, -55))
        val a = arrayOf(arrayOf(20, 78), arrayOf(-30, -50))
        val b = arrayOf(arrayOf(-30, -50), arrayOf(35, 5))

        Assertions
            .assertArrayEquals(expectedSum, matrixOperations.addOrSubtractTwoMatrices(a, b, false))
        Assertions
            .assertArrayEquals(expectedSubtract, matrixOperations.addOrSubtractTwoMatrices(a, b, true))
    }

    @Test
    fun scalarMultiplicationTest() {
        val expected = arrayOf(arrayOf(60, 21), arrayOf(-90, -15))
        val a = arrayOf(arrayOf(20, 7), arrayOf(-30, -5))

        Assertions
            .assertArrayEquals(expected, matrixOperations.scalarMultiplication(a, 3))
    }

}
