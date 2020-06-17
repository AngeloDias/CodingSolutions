package tests

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.TestInstance
import sideImplementations.MatrixOperations
import kotlin.test.assertEquals
import kotlin.test.assertFalse
import kotlin.test.assertNotEquals
import kotlin.test.assertTrue

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

    @Test
    fun matricesAreEqualsTest() {
        var a = arrayOf(arrayOf(20, 78), arrayOf(-30, -50))
        var b = arrayOf(arrayOf(-30, -50), arrayOf(35, 5))

        assertFalse(matrixOperations.matricesAreEquals(a, b))
        assertFalse(matrixOperations.matricesAreEquals(a, arrayOf()))
        assertFalse(matrixOperations.matricesAreEquals(arrayOf(), b))

        a = arrayOf(arrayOf(2, -50), arrayOf(3, 5))
        b = arrayOf(arrayOf(2, -50), arrayOf(3, 5))

        assertTrue(matrixOperations.matricesAreEquals(a, b))

        a = arrayOf(arrayOf(3))
        b = arrayOf(arrayOf(3))
        assertTrue(matrixOperations.matricesAreEquals(a, b))
    }

    @Test
    fun mainDiagonalSumTest() {
        var a = arrayOf(arrayOf(-30, -50), arrayOf(35, 5))

        assertEquals(-25, matrixOperations.diagonalSum(a, true))
        assertEquals(3, matrixOperations.diagonalSum(arrayOf(arrayOf(3)), true))
        assertEquals(0, matrixOperations.diagonalSum(arrayOf(), true))
        assertEquals(-15, matrixOperations.diagonalSum(a, false))

        a = arrayOf(arrayOf(-30, -50, 7), arrayOf(35, 5, 2), arrayOf(3, -1, 5))

        assertEquals(-20, matrixOperations.diagonalSum(a, true))
        assertEquals(15, matrixOperations.diagonalSum(a, false))

        assertNotEquals(15, matrixOperations.diagonalSum(a, true))
        assertNotEquals(7, matrixOperations.diagonalSum(a, true))
        assertNotEquals(-20, matrixOperations.diagonalSum(a, false))
    }

    @Test
    fun sumRowsAndColumnsValuesTest() {
        var matrix = arrayOf(arrayOf(-30, -50), arrayOf(35, 5))
        var sum = matrixOperations.sumRowsAndColumnsValues(matrix)
        var row = sum["rowsSum"]
        var column = sum["columnsSum"]
        var expectedRow = arrayOf(-80, 40)
        var expectedColumn = arrayOf(5, -45)

        Assertions.assertArrayEquals(expectedRow, row)
        Assertions.assertArrayEquals(expectedColumn, column)

        matrix = arrayOf(arrayOf(1, 2, 3), arrayOf(4, 5, 6), arrayOf(7, 8, 9))
        sum = matrixOperations.sumRowsAndColumnsValues(matrix)
        row = sum["rowsSum"]
        column = sum["columnsSum"]
        expectedRow = arrayOf(6, 15, 24)
        expectedColumn = arrayOf(12, 15, 18)

        Assertions.assertArrayEquals(expectedRow, row)
        Assertions.assertArrayEquals(expectedColumn, column)
    }

}
