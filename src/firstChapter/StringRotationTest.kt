package firstChapter

import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.TestInstance
import kotlin.test.assertFalse
import kotlin.test.assertTrue

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
internal class StringRotationTest {
    private lateinit var stringRotation: StringRotation

    @BeforeAll
    fun setup() {
        stringRotation = StringRotation()
    }

    @Test
    fun checkIfStringIs() {
        var strA = "erbottlewat"
        var strRotation = "waterbottle"

        assertTrue(stringRotation.checkIfStringIs(strRotation, strA))

        strA = "erbottlewat"
        strRotation = "waterottlea"

        assertFalse(stringRotation.checkIfStringIs(strRotation, strA))
    }

}
