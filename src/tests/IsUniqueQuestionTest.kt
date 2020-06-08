package tests

import firstChapter.IsUniqueQuestion
import org.junit.jupiter.api.BeforeAll
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
        uniqueStr = "1abcAuüBC"
        isUniqueQuestion = IsUniqueQuestion(uniqueStr)
        notUniqueStr = "12asdjlçnm,oiuqa"
    }

    @Test
    fun getUniqueTest() {
        assertNotNull(isUniqueQuestion.unique)
        assertEquals(isUniqueQuestion.unique, uniqueStr)
    }

    @Test
    fun checkIsUniqueTest() {
        assertEquals(uniqueStr, isUniqueQuestion.unique)
        assertTrue(isUniqueQuestion.checkIsUnique())

        isUniqueQuestion.unique = notUniqueStr

        assertFalse(isUniqueQuestion.checkIsUnique())
    }

    @Test
    fun setUniqueTest() {
        val oldVal = isUniqueQuestion.unique
        isUniqueQuestion.unique = "${oldVal}74qaa"

        assertNotEquals(oldVal, isUniqueQuestion.unique)
    }

}
