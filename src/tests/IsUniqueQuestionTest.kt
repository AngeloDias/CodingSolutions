package tests

import firstChapter.IsUniqueQuestion
import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.TestInstance
import kotlin.test.*

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class IsUniqueQuestionTest {
    private lateinit var isUniqueQuestion: IsUniqueQuestion
    private lateinit var uniqueStr: String
    private lateinit var notUniqueStr: String

    @BeforeAll
    fun setup() {
        uniqueStr = "1abcAuBC"
        isUniqueQuestion = IsUniqueQuestion(uniqueStr)
        notUniqueStr = "12asdjlnm,oiuqa"
    }

    @BeforeEach
    fun defineUniqueStr() {
        isUniqueQuestion.unique = uniqueStr
    }

    @Test
    fun getUniqueTest() {
        assertNotNull(isUniqueQuestion.unique)
        assertEquals(isUniqueQuestion.unique, uniqueStr)
    }

    @Test
    fun checkIsUniqueWithHashMapTest() {
        assertTrue(isUniqueQuestion.checkIsUniqueWithHashMap())

        isUniqueQuestion.unique = notUniqueStr

        assertFalse(isUniqueQuestion.checkIsUniqueWithHashMap())
    }

    @Test
    fun checkIsUniqueWithBooleanArrayTest() {
        assertTrue(isUniqueQuestion.checkIsUniqueWithBooleanArray())

        isUniqueQuestion.unique = notUniqueStr

        assertFalse(isUniqueQuestion.checkIsUniqueWithBooleanArray())
    }

    @Test
    fun checkIsUniqueWithBitTest() {
        isUniqueQuestion.unique = "absfeq"
        assertTrue(isUniqueQuestion.checkIsUniqueWithBits())

        isUniqueQuestion.unique = "banasqwi"

        assertFalse(isUniqueQuestion.checkIsUniqueWithBits())
    }

    @Test
    fun setUniqueTest() {
        val oldVal = isUniqueQuestion.unique
        isUniqueQuestion.unique = "${oldVal}74qaa"

        assertNotEquals(oldVal, isUniqueQuestion.unique)
    }

}
