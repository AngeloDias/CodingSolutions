package tests

import firstChapter.StringCompression
import org.hamcrest.MatcherAssert
import org.hamcrest.Matchers
import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.TestInstance
import kotlin.system.measureTimeMillis
import kotlin.test.*

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class StringCompressionTest {
    private lateinit var stringCompression: StringCompression

    @BeforeAll
    fun setup() {
        stringCompression = StringCompression()
    }

    @Test
    fun compressStringTest() {
        assertEquals("a2b1c5a3", stringCompression.compressString("aabcccccaaa"))
        assertEquals("a2b1c5a3q1", stringCompression.compressString("aabcccccaaaq"))
        assertEquals("a", stringCompression.compressString("a"))
        assertEquals("", stringCompression.compressString(""))
        assertEquals("a1B6t4T2t3a1", stringCompression.compressString("aBBBBBBttttTTttta"))
    }

    @Test
    fun compressStringUsingStringBuilderTest() {
        assertEquals("a2b1c5a3", stringCompression.compressStringUsingStringBuilder("aabcccccaaa"))
        assertEquals("a2b1c5a3q1", stringCompression.compressStringUsingStringBuilder("aabcccccaaaq"))
        assertEquals("a", stringCompression.compressStringUsingStringBuilder("a"))
        assertEquals("", stringCompression.compressStringUsingStringBuilder(""))
        assertEquals("v19a1B6t4T2t3a1q10i7p9",
            stringCompression.compressStringUsingStringBuilder("vvvvvvvvvvvvvvvvvvvaBBBBBBttttTTtttaqqqqqqqqqqiiiiiiippppppppp"))
    }

    @Test
    fun compareExecutionTime() {
        val str = "mmmmmmmmmmmmmvvvvvvvvvvvvvvvvvvvaaaaaaaaaaaaaaaaaBBBBBBttttTTtttaqqqqqqqqqqiiiiiiippppppppp"
        val millisCompressString = measureTimeMillis {
            stringCompression.compressString(str)
        }
        val millisStringBuilder = measureTimeMillis {
            stringCompression.compressStringUsingStringBuilder(str)
        }

        MatcherAssert.assertThat(millisCompressString, Matchers.greaterThan(millisStringBuilder))
    }

}
