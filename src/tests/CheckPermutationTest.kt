package tests

import firstChapter.CheckPermutation
import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.TestInstance
import kotlin.test.assertEquals
import kotlin.test.assertFalse
import kotlin.test.assertNotNull
import kotlin.test.assertTrue

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
internal class CheckPermutationTest {
    private lateinit var checkPermutation: CheckPermutation
    private lateinit var stringA: String
    private lateinit var stringB: String

    @BeforeAll
    fun setup() {
        stringA = "thread"
        stringB = "deathr"
        checkPermutation = CheckPermutation(stringA, stringB)
    }

    @Test
    fun getStringA() {
        assertNotNull(checkPermutation.stringA)
        assertEquals(checkPermutation.stringA, stringA)
    }

    @Test
    fun getStringB() {
        assertNotNull(checkPermutation.stringB)
        assertEquals(checkPermutation.stringB, stringB)
    }

    @Test
    fun stringsArePermutations() {
        assertTrue(checkPermutation.stringsArePermutations())
    }

    @Test
    fun stringsAreNotPermutations() {
        checkPermutation = CheckPermutation("${stringA}8711", stringB)

        assertFalse(checkPermutation.stringsArePermutations())
    }
}