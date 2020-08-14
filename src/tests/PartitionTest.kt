package tests

import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.TestInstance
import secondChapter.Partition
import utils.SinglyLinkedList

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
internal class PartitionTest {
    private lateinit var partition: Partition

    @BeforeAll
    fun setup(){
        partition = Partition()
    }

    @Test
    fun partitionTest() {
        val expected = SinglyLinkedList<Int>(0)
        val tested = SinglyLinkedList<Int>(0)

        tested.add(3)
        tested.add(5)
        tested.add(8)
        tested.add(5)
        tested.add(10)
        tested.add(2)
        tested.add(1)

        expected.add(3)
        expected.add(2)
        expected.add(1)
        expected.add(5)
        expected.add(8)
        expected.add(5)
        expected.add(10)

        Assertions
            .assertArrayEquals(
                expected.toTypedArray(),
                partition.partition(tested, 5).toTypedArray()
            )

        tested.clear()
        expected.clear()

        tested.add(3)
        tested.add(5)
        tested.add(8)
        tested.add(5)
        tested.add(10)
        tested.add(2)
        tested.add(1)

        expected.addAll(tested)

        Assertions
            .assertArrayEquals(
                expected.toTypedArray(),
                partition.partition(tested, 12).toTypedArray()
            )

        tested.clear()
        expected.clear()

        tested.add(12)

        expected.addAll(tested)

        Assertions
            .assertArrayEquals(
                expected.toTypedArray(),
                partition.partition(tested, 12).toTypedArray()
            )

        tested.clear()
        expected.clear()

        tested.add(2)

        expected.addAll(tested)

        Assertions
            .assertArrayEquals(
                expected.toTypedArray(),
                partition.partition(tested, 12).toTypedArray()
            )

        tested.clear()
        expected.clear()

        tested.add(3)
        tested.add(5)
        tested.add(8)
        tested.add(5)
        tested.add(10)
        tested.add(2)
        tested.add(4)

        expected.addAll(tested)

        Assertions
            .assertArrayEquals(
                expected.toTypedArray(),
                partition.partition(tested, 2).toTypedArray()
            )

        tested.clear()
        expected.clear()

        tested.add(5)
        tested.add(8)
        tested.add(5)
        tested.add(3)
        tested.add(10)
        tested.add(2)
        tested.add(1)

        expected.add(3)
        expected.add(2)
        expected.add(1)
        expected.add(5)
        expected.add(8)
        expected.add(5)
        expected.add(10)

        Assertions
            .assertArrayEquals(
                expected.toTypedArray(),
                partition.partition(tested, 5).toTypedArray()
            )

        tested.clear()
        expected.clear()

        Assertions
            .assertArrayEquals(
                expected.toTypedArray(),
                partition.partition(tested, 2).toTypedArray()
            )
    }

    @Test
    fun otherPartitionTest() {
        val expected = SinglyLinkedList<Int>(0)
        val tested = SinglyLinkedList<Int>(0)

        tested.add(3)
        tested.add(5)
        tested.add(8)
        tested.add(5)
        tested.add(10)
        tested.add(2)
        tested.add(1)

        expected.add(1)
        expected.add(2)
        expected.add(3)
        expected.add(5)
        expected.add(8)
        expected.add(5)
        expected.add(10)

        Assertions
            .assertArrayEquals(
                expected.toTypedArray(),
                partition.otherPartition(tested, 5).toTypedArray()
            )

        tested.clear()
        expected.clear()

        tested.add(3)
        tested.add(5)
        tested.add(8)
        tested.add(5)
        tested.add(10)
        tested.add(2)
        tested.add(1)

        expected.add(1)
        expected.add(2)
        expected.add(10)
        expected.add(5)
        expected.add(8)
        expected.add(5)
        expected.add(3)

        Assertions
            .assertArrayEquals(
                expected.toTypedArray(),
                partition.otherPartition(tested, 12).toTypedArray()
            )

        tested.clear()
        expected.clear()

        tested.add(12)

        expected.addAll(tested)

        Assertions
            .assertArrayEquals(
                expected.toTypedArray(),
                partition.otherPartition(tested, 12).toTypedArray()
            )

        tested.clear()
        expected.clear()

        tested.add(2)

        expected.addAll(tested)

        Assertions
            .assertArrayEquals(
                expected.toTypedArray(),
                partition.otherPartition(tested, 12).toTypedArray()
            )

        tested.clear()
        expected.clear()

        tested.add(3)
        tested.add(5)
        tested.add(8)
        tested.add(5)
        tested.add(10)
        tested.add(2)
        tested.add(4)

        expected.addAll(tested)

        Assertions
            .assertArrayEquals(
                expected.toTypedArray(),
                partition.otherPartition(tested, 2).toTypedArray()
            )

        tested.clear()
        expected.clear()

        tested.add(5)
        tested.add(8)
        tested.add(5)
        tested.add(3)
        tested.add(10)
        tested.add(2)
        tested.add(1)

        expected.add(1)
        expected.add(2)
        expected.add(3)
        expected.add(5)
        expected.add(8)
        expected.add(5)
        expected.add(10)

        Assertions
            .assertArrayEquals(
                expected.toTypedArray(),
                partition.otherPartition(tested, 5).toTypedArray()
            )

        tested.clear()
        expected.clear()

        Assertions
            .assertArrayEquals(
                expected.toTypedArray(),
                partition.otherPartition(tested, 2).toTypedArray()
            )
    }

}
