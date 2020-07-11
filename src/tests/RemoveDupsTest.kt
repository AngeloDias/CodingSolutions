package tests

import Utils.Companion.SinglyLinkedList
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.TestInstance
import secondChapter.RemoveDups
import java.util.*

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
        expected.add(11)
        expected.add(22)
        expected.add(8)
        expected.add(84)
        expected.add(112)
        expected.add(1174)

        tested.addAll(expected)
        tested.add(11)
        tested.add(4)
        tested.add(4)
        tested.add(112)
        tested.add(11)
        tested.add(3)

        assertEquals(expected, removeDups.removeDupsUsingHashTable(tested))

        expected.clear()
        tested.clear()

        expected.add(11)

        tested.addAll(expected)
        tested.add(11)

        assertEquals(expected, removeDups.removeDupsUsingHashTable(tested))

        expected.clear()
        tested.clear()

        expected.add(11)
        expected.add(111)
        expected.add(177)

        tested.addAll(expected)

        assertEquals(expected, removeDups.removeDupsUsingHashTable(tested))
    }

    @Test
    fun removeDupsUsingPointersTest() {
        val expected = SinglyLinkedList<Int>(0)
        val tested = SinglyLinkedList<Int>(0)

        expected.add(7)
        expected.add(1)
        expected.add(3)
        expected.add(4)
        expected.add(71)
        expected.add(11)
        expected.add(22)
        expected.add(8)
        expected.add(84)
        expected.add(112)
        expected.add(1174)
        expected.add(11747)

        tested.addAll(expected)
        tested.add(11)
        tested.add(4)
        tested.add(4)
        tested.add(112)
        tested.add(11)
        tested.add(3)

        assertEquals(expected, removeDups.removeDupsUsingPointers(tested))

        expected.clear()
        tested.clear()

        expected.add(11)
        expected.add(11552)

        tested.addAll(expected)
        tested.add(11)
        tested.add(1188)

        assertEquals(expected, removeDups.removeDupsUsingPointers(tested))

        expected.clear()
        tested.clear()

        expected.add(11)
        expected.add(111)
        expected.add(177)
        expected.add(1133)

        tested.addAll(expected)

        assertEquals(expected, removeDups.removeDupsUsingPointers(tested))
    }

}
