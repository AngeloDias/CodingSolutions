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

}
