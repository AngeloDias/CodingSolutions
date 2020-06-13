package tests

import firstChapter.OneAway
import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.TestInstance
import kotlin.test.assertFalse
import kotlin.test.assertTrue

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class OneAwayTest {
    private lateinit var oneAway: OneAway

    @BeforeAll
    fun setup() {
        oneAway = OneAway()
    }

    @Test
    fun zeroOrOneEditAwayTest() {
        assertTrue(oneAway.zeroOrOneEditAway("pale", "ple"))
        assertTrue(oneAway.zeroOrOneEditAway("pale", "pales"))
        assertTrue(oneAway.zeroOrOneEditAway("pales", "pales"))

        assertFalse(oneAway.zeroOrOneEditAway("pales", "bakes"))
        assertFalse(oneAway.zeroOrOneEditAway("pake", "bales"))
        assertFalse(oneAway.zeroOrOneEditAway("pak", "bales"))
        assertFalse(oneAway.zeroOrOneEditAway("paks", "bales"))
    }

    @Test
    fun compareCharsTest() {
        assertTrue(oneAway.compareCharsDiffLength("pale", "ple"))
        assertTrue(oneAway.compareCharsDiffLength("pales", "pale"))
        assertTrue(oneAway.compareCharsDiffLength("pales", "pales"))

        assertFalse(oneAway.compareCharsDiffLength("pales", "bakes"))
        assertFalse(oneAway.compareCharsDiffLength("pales", "pake"))
        assertFalse(oneAway.compareCharsDiffLength("pak", "bales"))
        assertFalse(oneAway.compareCharsDiffLength("paks", "bales"))
    }

    @Test
    fun checkStringWasEditedAtMostOneAwayTest() {
        assertTrue(oneAway.checkStringWasEditedAtMostOneAway("pales", "pales"))
        assertTrue(oneAway.checkStringWasEditedAtMostOneAway("pales", "paces"))
        assertTrue(oneAway.checkStringWasEditedAtMostOneAway("pales", "bales"))
        assertTrue(oneAway.checkStringWasEditedAtMostOneAway("p", "p"))
        assertTrue(oneAway.checkStringWasEditedAtMostOneAway("p", "a"))

        assertFalse(oneAway.checkStringWasEditedAtMostOneAway("pales", "bakes"))
        assertFalse(oneAway.checkStringWasEditedAtMostOneAway("palesp", "bpakes"))
        assertFalse(oneAway.checkStringWasEditedAtMostOneAway("ap", "pa"))
        assertFalse(oneAway.checkStringWasEditedAtMostOneAway("pak", "bales"))
        assertFalse(oneAway.checkStringWasEditedAtMostOneAway("paks", "bales"))
    }

}
