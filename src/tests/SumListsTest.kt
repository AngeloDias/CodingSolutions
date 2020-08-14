package tests

import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.TestInstance

import secondChapter.SumLists
import org.junit.jupiter.api.Assertions
import utils.SinglyLinkedList

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
internal class SumListsTest {
    private lateinit var sumLists: SumLists

    @BeforeAll
    fun setup() {
        sumLists = SumLists()
    }

    @Test
    fun fromTest() {
        val expected = SinglyLinkedList<Int>(0)

        expected.add(2)
        expected.add(8)
        expected.add(8)

        Assertions
            .assertArrayEquals(
                expected.toIntArray(),
                sumLists.from(882, 2).toIntArray()
            )

        expected.clear()
        expected.add(5)

        Assertions
            .assertArrayEquals(
                expected.toIntArray(),
                sumLists.from(5, 0).toIntArray()
            )

        expected.clear()
        expected.add(0)

        Assertions
            .assertArrayEquals(
                expected.toIntArray(),
                sumLists.from(0, 0).toIntArray()
            )
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

        testedA.clear()
        testedB.clear()
        expected.clear()

        testedA.add(7)
        testedA.add(1)
        testedA.add(9)

        testedB.add(5)
        testedB.add(9)
        testedB.add(2)

        expected.add(2)
        expected.add(1)
        expected.add(2)
        expected.add(1)

        Assertions.assertArrayEquals(expected.toTypedArray(), sumLists.sumReversed(testedA, testedB).toTypedArray())

        testedA.clear()
        testedB.clear()
        expected.clear()

        testedA.add(0)
        testedA.add(5)

        testedB.add(0)
        testedB.add(5)

        expected.add(0)
        expected.add(0)
        expected.add(1)

        Assertions.assertArrayEquals(expected.toTypedArray(), sumLists.sumReversed(testedA, testedB).toTypedArray())

        testedA.clear()
        testedB.clear()
        expected.clear()

        testedA.add(5)

        testedB.add(5)

        expected.add(0)
        expected.add(1)

        Assertions.assertArrayEquals(expected.toTypedArray(), sumLists.sumReversed(testedA, testedB).toTypedArray())

        testedA.clear()
        testedB.clear()
        expected.clear()

        testedA.add(5)
        testedA.add(9)
        testedA.add(2)
        testedA.add(1)

        testedB.add(5)

        expected.add(0)
        expected.add(0)
        expected.add(3)
        expected.add(1)

        Assertions.assertArrayEquals(expected.toTypedArray(), sumLists.sumReversed(testedA, testedB).toTypedArray())
    }

    @Test
    fun sumReversedSameSizeForBothTest() {
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

        Assertions
            .assertArrayEquals(
                expected.toTypedArray(),
                sumLists.sumReversedSameSizeForBoth(testedA, testedB).toTypedArray()
            )

        testedA.clear()
        testedB.clear()
        expected.clear()

        testedA.add(7)
        testedA.add(1)
        testedA.add(9)

        testedB.add(5)
        testedB.add(9)
        testedB.add(2)

        expected.add(2)
        expected.add(1)
        expected.add(2)
        expected.add(1)

        Assertions
            .assertArrayEquals(
                expected.toTypedArray(),
                sumLists.sumReversedSameSizeForBoth(testedA, testedB).toTypedArray()
            )

        testedA.clear()
        testedB.clear()
        expected.clear()

        testedA.add(0)
        testedA.add(5)

        testedB.add(0)
        testedB.add(5)

        expected.add(0)
        expected.add(0)
        expected.add(1)

        Assertions
            .assertArrayEquals(
                expected.toTypedArray(),
                sumLists.sumReversedSameSizeForBoth(testedA, testedB).toTypedArray()
            )

        testedA.clear()
        testedB.clear()
        expected.clear()

        testedA.add(5)

        testedB.add(5)

        expected.add(0)
        expected.add(1)

        Assertions
            .assertArrayEquals(
                expected.toTypedArray(),
                sumLists.sumReversedSameSizeForBoth(testedA, testedB).toTypedArray()
            )
    }

}
