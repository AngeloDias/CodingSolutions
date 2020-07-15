package tests

import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.TestInstance
import secondChapter.DeleteMiddleNode
import Utils.Companion.SinglyLinkedList
import org.junit.jupiter.api.Assertions

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
internal class DeleteMiddleNodeTest {
    private lateinit var deleteMiddleNode: DeleteMiddleNode

    @BeforeAll
    fun setup() {
        deleteMiddleNode = DeleteMiddleNode()
    }

    @Test
    fun knowingHeadDeleteMiddleTest() {
        val linkedList = SinglyLinkedList<Int>(0)
        val expected = SinglyLinkedList<Int>(0)

        linkedList.add(5)
        linkedList.add(7)
        linkedList.add(9)
        linkedList.add(10)
        linkedList.add(3)

        expected.addAll(linkedList)
        expected.removeFirstToMatch(9)

        deleteMiddleNode.knowingHeadDeleteMiddle(9, linkedList)
        Assertions.assertArrayEquals(expected.toIntArray(), linkedList.toIntArray())

        deleteMiddleNode.knowingHeadDeleteMiddle(3, linkedList)
        Assertions.assertArrayEquals(expected.toIntArray(), linkedList.toIntArray())

        expected.removeFirstToMatch(10)
        deleteMiddleNode.knowingHeadDeleteMiddle(10, linkedList)
        Assertions.assertArrayEquals(expected.toIntArray(), linkedList.toIntArray())

        expected.removeFirstToMatch(7)
        deleteMiddleNode.knowingHeadDeleteMiddle(7, linkedList)
        Assertions.assertArrayEquals(expected.toIntArray(), linkedList.toIntArray())
    }

    @Test
    fun deleteMiddleTest() {
        val linkedList = SinglyLinkedList<Int>(0)
        val expected = SinglyLinkedList<Int>(0)

        linkedList.add(5)
        linkedList.add(7)
        linkedList.add(9)
        linkedList.add(10)
        linkedList.add(3)

        expected.addAll(linkedList)
        expected.removeFirstToMatch(9)

        deleteMiddleNode.deleteMiddle(linkedList.theNodeAt(2), linkedList)
        Assertions.assertArrayEquals(expected.toIntArray(), linkedList.toIntArray())

        deleteMiddleNode.deleteMiddle(linkedList.theNodeAt(20), linkedList)
        Assertions.assertArrayEquals(expected.toIntArray(), linkedList.toIntArray())

        expected.removeFirstToMatch(10)
        deleteMiddleNode.deleteMiddle(linkedList.theNodeAt(2), linkedList)
        Assertions.assertArrayEquals(expected.toIntArray(), linkedList.toIntArray())

        expected.removeFirstToMatch(7)
        deleteMiddleNode.deleteMiddle(linkedList.theNodeAt(1), linkedList)
        Assertions.assertArrayEquals(expected.toIntArray(), linkedList.toIntArray())
    }

}
