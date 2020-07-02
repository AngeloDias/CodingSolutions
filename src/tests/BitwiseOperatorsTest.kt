package tests

import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.TestInstance
import sideImplementations.BitwiseOperators
import kotlin.test.assertEquals
import kotlin.test.assertFalse
import kotlin.test.assertNotEquals
import kotlin.test.assertTrue

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

}
