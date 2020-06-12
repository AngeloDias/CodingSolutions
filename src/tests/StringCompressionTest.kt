package tests

import firstChapter.StringCompression
import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.TestInstance
import kotlin.test.assertEquals

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class StringCompressionTest {
    private lateinit var stringCompression: StringCompression

    @BeforeAll
    fun setup() {
        stringCompression = StringCompression()
    }

    @Test
    fun compressStringTest() {
        assertEquals("a2b1c5a2", stringCompression.compressString("aabcccccaaa"))
    }

}