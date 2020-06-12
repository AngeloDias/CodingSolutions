package tests

import firstChapter.PalindromePermutation
import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.TestInstance
import kotlin.test.*

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class PalindromePermutationTest {
    private lateinit var palindromePermutation: PalindromePermutation

    @BeforeAll
    fun setup() {
        palindromePermutation = PalindromePermutation()
    }

    @Test
    fun checkTest() {
        assertTrue(palindromePermutation.checkPalindromeAlreadyOrdered("a"))
        assertTrue(palindromePermutation.checkPalindromeAlreadyOrdered("aa"))
        assertTrue(palindromePermutation.checkPalindromeAlreadyOrdered("aba"))
        assertTrue(palindromePermutation.checkPalindromeAlreadyOrdered("aba "))
        assertTrue(palindromePermutation.checkPalindromeAlreadyOrdered(" aba"))
        assertTrue(palindromePermutation.checkPalindromeAlreadyOrdered(" aba "))
        assertTrue(palindromePermutation.checkPalindromeAlreadyOrdered("A aBa A"))
        assertTrue(palindromePermutation.checkPalindromeAlreadyOrdered("ababababababqqbabababababa"))

        assertFalse(palindromePermutation.checkPalindromeAlreadyOrdered("aab"))
        assertFalse(palindromePermutation.checkPalindromeAlreadyOrdered("abcdefghjiklmnopqrstuvwxyz"))
        assertFalse(palindromePermutation.checkPalindromeAlreadyOrdered(" "))
        assertFalse(palindromePermutation.checkPalindromeAlreadyOrdered(""))
    }

    @Test
    fun checkCharsInPhraseTest() {
        val expectedMap = HashMap<Char, Int>()

        expectedMap['a'] = 4
        expectedMap['b'] = 2
        expectedMap['r'] = 1

        assertEquals(expectedMap, palindromePermutation.checkCharsInPhrase("aaaarbb"))

        expectedMap['t'] = 1

        assertNotEquals(expectedMap, palindromePermutation.checkCharsInPhrase("aaaarbb"))
    }

    @Test
    fun countOddsTest() {
        val charAndInts = HashMap<Char, Int>()

        charAndInts['t'] = 4
        charAndInts['a'] = 2
        charAndInts['c'] = 2
        charAndInts['G'] = 1

        assertTrue(palindromePermutation.countOddsRepeatingLessThanTwice(charAndInts))

        charAndInts['e'] = 3

        assertFalse(palindromePermutation.countOddsRepeatingLessThanTwice(charAndInts))
    }

    @Test
    fun checkByCountingCharsTest() {
        assertTrue(palindromePermutation.checkPalindromePermutationByCountingChars("a"))
        assertTrue(palindromePermutation.checkPalindromePermutationByCountingChars("aa"))
        assertTrue(palindromePermutation.checkPalindromePermutationByCountingChars("aba"))
        assertTrue(palindromePermutation.checkPalindromePermutationByCountingChars("aba "))
        assertTrue(palindromePermutation.checkPalindromePermutationByCountingChars(" aba"))
        assertTrue(palindromePermutation.checkPalindromePermutationByCountingChars(" aba "))
        assertTrue(palindromePermutation.checkPalindromePermutationByCountingChars("A aBa A"))
        assertTrue(palindromePermutation.checkPalindromePermutationByCountingChars("ababababababbabababababaqq"))
        assertTrue(palindromePermutation.checkPalindromePermutationByCountingChars("aaaaaaaaaaaabbbbbbbbbbbbqq"))

        assertFalse(palindromePermutation.checkPalindromePermutationByCountingChars(" "))
        assertFalse(palindromePermutation.checkPalindromePermutationByCountingChars(""))
        assertFalse(palindromePermutation.checkPalindromePermutationByCountingChars(" jaaajj"))
        assertFalse(palindromePermutation.checkPalindromePermutationByCountingChars(" jaaajj "))
        assertFalse(palindromePermutation.checkPalindromePermutationByCountingChars("jaaajj"))
        assertFalse(palindromePermutation.checkPalindromePermutationByCountingChars("abcdefghjiklmnopqrstuvwxyz"))
    }

    @Test
    fun createBitVectorInIntFromPhraseTest() {
        assertEquals(1, palindromePermutation.createBitVectorInIntFromPhrase("abB"))
        assertEquals(3, palindromePermutation.createBitVectorInIntFromPhrase("ab"))
        assertEquals(3, palindromePermutation.createBitVectorInIntFromPhrase("abBb"))

        assertEquals(0, palindromePermutation.createBitVectorInIntFromPhrase("aa"))
        assertEquals(0, palindromePermutation.createBitVectorInIntFromPhrase(""))
    }

    @Test
    fun checkFinalNumberWasToggledEvenOrOddTimesTest() {
        var bitVector = palindromePermutation.createBitVectorInIntFromPhrase("abb")
        assertTrue(palindromePermutation.checkFinalNumberWasToggledEvenOrOddTimes(bitVector))

        bitVector = palindromePermutation.createBitVectorInIntFromPhrase("aabBb")
        assertTrue(palindromePermutation.checkFinalNumberWasToggledEvenOrOddTimes(bitVector))

        bitVector = palindromePermutation.createBitVectorInIntFromPhrase("ababababababbabababababaqq")
        assertTrue(palindromePermutation.checkFinalNumberWasToggledEvenOrOddTimes(bitVector))

        bitVector = palindromePermutation.createBitVectorInIntFromPhrase("abcdefghjiklmnopqrstuvwxyz")
        assertFalse(palindromePermutation.checkFinalNumberWasToggledEvenOrOddTimes(bitVector))

        bitVector = palindromePermutation.createBitVectorInIntFromPhrase("ab")
        assertFalse(palindromePermutation.checkFinalNumberWasToggledEvenOrOddTimes(bitVector))
    }

    @Test
    fun checkPalindromePermutationFromBitVectorTest() {
        assertTrue(palindromePermutation.checkPalindromePermutationFromBitVector("a"))
        assertTrue(palindromePermutation.checkPalindromePermutationFromBitVector("aa"))
        assertTrue(palindromePermutation.checkPalindromePermutationFromBitVector("aba"))
        assertTrue(palindromePermutation.checkPalindromePermutationFromBitVector("aba "))
        assertTrue(palindromePermutation.checkPalindromePermutationFromBitVector(" aba"))
        assertTrue(palindromePermutation.checkPalindromePermutationFromBitVector(" aba "))
        assertTrue(palindromePermutation.checkPalindromePermutationFromBitVector("A aBa A"))
        assertTrue(palindromePermutation.checkPalindromePermutationFromBitVector("ababababababbabababababaqq"))
        assertTrue(palindromePermutation.checkPalindromePermutationFromBitVector("aaaaaaaaaaaabbbbbbbbbbbbqq"))

        assertFalse(palindromePermutation.checkPalindromePermutationFromBitVector(" "))
        assertFalse(palindromePermutation.checkPalindromePermutationFromBitVector(""))
        assertFalse(palindromePermutation.checkPalindromePermutationFromBitVector(" jaaajj"))
        assertFalse(palindromePermutation.checkPalindromePermutationFromBitVector(" jaaajj "))
        assertFalse(palindromePermutation.checkPalindromePermutationFromBitVector("jaaajj"))
        assertFalse(palindromePermutation.checkPalindromePermutationFromBitVector("abcdefghjiklmnopqrstuvwxyz"))
    }

}
