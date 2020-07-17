package tests

import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.TestInstance

import secondChapter.SumLists
import Utils.Companion.SinglyLinkedList
import org.junit.jupiter.api.Assertions

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
internal class SumListsTest {
    private lateinit var sumLists: SumLists

    @BeforeAll
    fun setup() {
        sumLists = SumLists()
    }

    @Test
    fun sumReversedTest() {
        val testedA = SinglyLinkedList<Int>(0)
        val testedB = SinglyLinkedList<Int>(0)
        val expected = SinglyLinkedList<Int>(0)

        testedA.add(7)
        testedA.add(1)
        testedA.add(6)

        testedB.add(5)
        testedB.add(9)
        testedB.add(2)

        expected.add(2)
        expected.add(1)
        expected.add(9)

        Assertions.assertArrayEquals(expected.toTypedArray(), sumLists.sumReversed(testedA, testedB).toTypedArray())
    }

}
