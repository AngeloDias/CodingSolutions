package tests

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.TestInstance
import sideImplementations.BitwiseOperators
import kotlin.test.*

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class BitwiseOperatorsTest {
    private lateinit var bitwiseOperators: BitwiseOperators

    @BeforeAll
    fun setup() {
        bitwiseOperators = BitwiseOperators()
    }

    @Test
    fun isTheLeastSignificantBitSetTest() {
        assertTrue(bitwiseOperators.isTheLeastSignificantBitSet(13))
        assertTrue(bitwiseOperators.isTheLeastSignificantBitSet(1))
        assertTrue(bitwiseOperators.isTheLeastSignificantBitSet(-1))

        assertFalse(bitwiseOperators.isTheLeastSignificantBitSet(2))
        assertFalse(bitwiseOperators.isTheLeastSignificantBitSet(1574214))
        assertFalse(bitwiseOperators.isTheLeastSignificantBitSet(-2))
        assertFalse(bitwiseOperators.isTheLeastSignificantBitSet(0))
    }

    @Test
    fun isTheMostSignificantBitSetTest() {
        assertTrue(bitwiseOperators.isTheMostSignificantBitSet(-13))
        assertTrue(bitwiseOperators.isTheMostSignificantBitSet(-185472))
        assertTrue(bitwiseOperators.isTheMostSignificantBitSet(-1))

        assertFalse(bitwiseOperators.isTheMostSignificantBitSet(2147483647))
        assertFalse(bitwiseOperators.isTheMostSignificantBitSet(2))
        assertFalse(bitwiseOperators.isTheMostSignificantBitSet(1574214))
        assertFalse(bitwiseOperators.isTheMostSignificantBitSet(0))
    }

    @Test
    fun isSetTheTest() {
        assertTrue(bitwiseOperators.isSetThe(5, -13))
        assertTrue(bitwiseOperators.isSetThe(1, 1))
        assertTrue(bitwiseOperators.isSetThe(26, 999999999))
        assertTrue(bitwiseOperators.isSetThe(31, 2147483647))

        assertFalse(bitwiseOperators.isSetThe(31, 1073555555))
        assertFalse(bitwiseOperators.isSetThe(1, 2))
        assertFalse(bitwiseOperators.isSetThe(5, 1574214))
        assertFalse(bitwiseOperators.isSetThe(1, 0))
    }

    @Test
    fun setTheTest() {
        assertEquals(13, bitwiseOperators.setToOneThe(0, 12))
        assertEquals(3, bitwiseOperators.setToOneThe(1, 1))
        assertEquals(1073741824, bitwiseOperators.setToOneThe(30, 0))
        assertEquals(-1, bitwiseOperators.setToOneThe(0, -2))

        assertNotEquals(0, bitwiseOperators.setToOneThe(0, 0))
        assertNotEquals(2147483647, bitwiseOperators.setToOneThe(32, 0))
        assertNotEquals(2147483647, bitwiseOperators.setToOneThe(-1, 0))
    }

    @Test
    fun getHighestOrderSetBitPositionTest() {
        assertEquals(-1, bitwiseOperators.getHighestOrderSetBitPositionFrom(0))
        assertEquals(0, bitwiseOperators.getHighestOrderSetBitPositionFrom(1))
        assertEquals(30, bitwiseOperators.getHighestOrderSetBitPositionFrom(2147483647))
        assertEquals(31, bitwiseOperators.getHighestOrderSetBitPositionFrom(-2))
        assertEquals(1, bitwiseOperators.getHighestOrderSetBitPositionFrom(2))
    }

    @Test
    fun getLowestOrderSetBitPositionTest() {
        assertEquals(-1, bitwiseOperators.getLowestOrderSetBitPositionFrom(0))
        assertEquals(0, bitwiseOperators.getLowestOrderSetBitPositionFrom(1))
        assertEquals(0, bitwiseOperators.getLowestOrderSetBitPositionFrom(2147483647))
        assertEquals(1, bitwiseOperators.getLowestOrderSetBitPositionFrom(-2))
        assertEquals(1, bitwiseOperators.getLowestOrderSetBitPositionFrom(2))
    }

    @Test
    fun countTrailingZerosFromTest() {
        assertEquals(0, bitwiseOperators.countTrailingZerosFrom(0))
        assertEquals(1, bitwiseOperators.countTrailingZerosFrom(1010))
        assertEquals(4, bitwiseOperators.countTrailingZerosFrom(80))
        assertEquals(0, bitwiseOperators.countTrailingZerosFrom(-1))
        assertEquals(1, bitwiseOperators.countTrailingZerosFrom(-2))
        assertEquals(0, bitwiseOperators.countTrailingZerosFrom(1))
    }

    @Test
    fun countLeadingZerosFromTest() {
        assertEquals(0, bitwiseOperators.countLeadingZerosFrom(0))
        assertEquals(22, bitwiseOperators.countLeadingZerosFrom(1010))
        assertEquals(25, bitwiseOperators.countLeadingZerosFrom(80))
        assertEquals(0, bitwiseOperators.countLeadingZerosFrom(-1))
        assertEquals(0, bitwiseOperators.countLeadingZerosFrom(-2))
        assertEquals(31, bitwiseOperators.countLeadingZerosFrom(1))
    }

    @Test
    fun flipBitsFromTest() {
        assertEquals(-1, bitwiseOperators.flipBitsFrom(0))
        assertEquals(-1011, bitwiseOperators.flipBitsFrom(1010))
        assertEquals(-81, bitwiseOperators.flipBitsFrom(80))
        assertEquals(0, bitwiseOperators.flipBitsFrom(-1))
        assertEquals(1, bitwiseOperators.flipBitsFrom(-2))
        assertEquals(-2, bitwiseOperators.flipBitsFrom(1))
    }

    @Test
    fun countZerosAndOnesFromTest() {
        val expectedZerosAndOnes = BitwiseOperators.ZerosAndOnes()
        var result = bitwiseOperators.countZerosAndOnesFrom(0)
        expectedZerosAndOnes.ones = 0
        expectedZerosAndOnes.zeros = 32

        assertEquals(expectedZerosAndOnes.zeros, result.zeros)
        assertEquals(expectedZerosAndOnes.ones, result.ones)

        expectedZerosAndOnes.ones = 7
        expectedZerosAndOnes.zeros = 25

        result = bitwiseOperators.countZerosAndOnesFrom(1010)

        assertEquals(expectedZerosAndOnes.zeros, result.zeros)
        assertEquals(expectedZerosAndOnes.ones, result.ones)

        expectedZerosAndOnes.ones = 2
        expectedZerosAndOnes.zeros = 30

        result = bitwiseOperators.countZerosAndOnesFrom(80)

        assertEquals(expectedZerosAndOnes.zeros, result.zeros)
        assertEquals(expectedZerosAndOnes.ones, result.ones)

        expectedZerosAndOnes.ones = 32
        expectedZerosAndOnes.zeros = 0

        result = bitwiseOperators.countZerosAndOnesFrom(-1)

        assertEquals(expectedZerosAndOnes.zeros, result.zeros)
        assertEquals(expectedZerosAndOnes.ones, result.ones)

        expectedZerosAndOnes.ones = 31
        expectedZerosAndOnes.zeros = 1

        result = bitwiseOperators.countZerosAndOnesFrom(-2)

        assertEquals(expectedZerosAndOnes.zeros, result.zeros)
        assertEquals(expectedZerosAndOnes.ones, result.ones)

        expectedZerosAndOnes.ones = 1
        expectedZerosAndOnes.zeros = 31

        result = bitwiseOperators.countZerosAndOnesFrom(1)

        assertEquals(expectedZerosAndOnes.zeros, result.zeros)
        assertEquals(expectedZerosAndOnes.ones, result.ones)
    }
    
    @Test
    fun bitwiseRotateTest() {
        val expectedRotatedNumber = BitwiseOperators.RotatedNumber()
        var rotationResult = bitwiseOperators.bitwiseRotate(-15, 2)
        expectedRotatedNumber.leftRotated = -57
        expectedRotatedNumber.rightRotated = 2147483644

        assertEquals(expectedRotatedNumber.leftRotated, rotationResult.leftRotated)
        assertEquals(expectedRotatedNumber.rightRotated, rotationResult.rightRotated)

        rotationResult = bitwiseOperators.bitwiseRotate(0, 2)
        expectedRotatedNumber.leftRotated = 0
        expectedRotatedNumber.rightRotated = 0

        assertEquals(expectedRotatedNumber.leftRotated, rotationResult.leftRotated)
        assertEquals(expectedRotatedNumber.rightRotated, rotationResult.rightRotated)

        rotationResult = bitwiseOperators.bitwiseRotate(100, 3)
        expectedRotatedNumber.leftRotated = 800
        expectedRotatedNumber.rightRotated = -2147483636

        assertEquals(expectedRotatedNumber.leftRotated, rotationResult.leftRotated)
        assertEquals(expectedRotatedNumber.rightRotated, rotationResult.rightRotated)
    }
    
    @Test
    fun convertDecimalToBinaryArrayFromTest() {
        var arrayNumber = bitwiseOperators.convertDecimalToBinaryArrayFrom(22)
        var expectedArray = arrayOf(0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 1, 1, 0)

        Assertions.assertArrayEquals(expectedArray, arrayNumber)

        arrayNumber = bitwiseOperators.convertDecimalToBinaryArrayFrom(290761468)
        expectedArray = arrayOf(0,0,0,1,0,0,0,1,0,1,0,1,0,1,0,0,1,0,1,0,1,0,1,0,1,1,1,1,1,1,0,0)

        Assertions.assertArrayEquals(expectedArray, arrayNumber)

        arrayNumber = bitwiseOperators.convertDecimalToBinaryArrayFrom(1434083083)
        expectedArray = arrayOf(0,1,0,1,0,1,0,1,0,1,1,1,1,0,1,0,0,1,0,1,1,1,1,1,0,0,0,0,1,0,1,1)

        Assertions.assertArrayEquals(expectedArray, arrayNumber)
    }

    @Test
    fun swapTest() {
        var pair = bitwiseOperators.swap(22, 65)

        assertEquals(65, pair.first)
        assertEquals(22, pair.second)

        pair = bitwiseOperators.swap(0, -1)

        assertEquals(-1, pair.first)
        assertEquals(0, pair.second)
    }

    @Test
    fun isEvenTheTest() {
        assertTrue(bitwiseOperators.isEvenThe(12))
        assertTrue(bitwiseOperators.isEvenThe(-12))
        assertTrue(bitwiseOperators.isEvenThe(0))

        assertFalse(bitwiseOperators.isEvenThe(11))
        assertFalse(bitwiseOperators.isEvenThe(-11))
        assertFalse(bitwiseOperators.isEvenThe(-1))
    }

}
