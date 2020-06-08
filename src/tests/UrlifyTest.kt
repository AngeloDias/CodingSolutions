package tests

import firstChapter.URLify
import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.TestInstance
import kotlin.test.assertEquals
import kotlin.test.assertNotEquals

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class UrlifyTest {
    private lateinit var urlify: URLify
    private lateinit var strToUrl: String
    private lateinit var finalUrl: String
    private var stLength: Int = 0
    private val placeholder: String = "%20"

    @BeforeAll
    fun setup() {
        strToUrl = "String with simple spaces"
        finalUrl = "String${placeholder}with${placeholder}simple${placeholder}spaces"
        stLength = strToUrl.length
        urlify = URLify()
    }

    @Test
    fun changeBlankSpacesToSymbolsTest() {
        var url = urlify.changeBlankSpacesToSymbols(strToUrl, stLength)

        assertEquals(url, finalUrl)

        url = "${url}l"

        assertNotEquals(url, finalUrl)

        strToUrl = ""

        url = urlify.changeBlankSpacesToSymbols(strToUrl, 0)

        assertNotEquals(url, finalUrl)
    }

}
