package tests

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.TestInstance
import secondChapter.RemoveDups
import java.util.*
import kotlin.test.assertNotEquals

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class RemoveDupsTest {
    private lateinit var removeDups: RemoveDups

    @BeforeAll
    fun setup(){
        removeDups = RemoveDups()
    }

    @Test
    fun removeDupsUsingHashTableTest() {
        val expected = LinkedList<Int>()
        val tested = LinkedList<Int>()

        expected.add(7)
        expected.add(1)
        expected.add(3)
        expected.add(4)
        expected.add(71)

        tested.addAll(expected)
        tested.add(7)

        assertEquals(expected, removeDups.removeDupsUsingHashTable(tested))

        expected.add(40)

        assertNotEquals(expected, removeDups.removeDupsUsingHashTable(tested))
    }

}
