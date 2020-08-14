package tests

import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.TestInstance
import secondChapter.ReturnKthToLast
import utils.SinglyLinkedList
import kotlin.test.assertEquals

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class ReturnKthToLastTest {
    private lateinit var returnKthToLast: ReturnKthToLast

    @BeforeAll
    fun setup() {
        returnKthToLast = ReturnKthToLast()
    }

    @Test
    fun returnTheTest() {
        val tested = SinglyLinkedList<Int>(0)

        tested.add(7)
        tested.add(1)
        tested.add(3)
        tested.add(4)
        tested.add(71)
        tested.add(11)
        tested.add(22)
        tested.add(8)
        tested.add(84)
        tested.add(112)
        tested.add(1174)
        tested.add(11747)

        assertEquals(112, returnKthToLast.returnThe(3, tested))

        tested.clear()
        tested.add(7)
        tested.add(1)
        tested.add(3)

        assertEquals(1, returnKthToLast.returnThe(2, tested))
    }

    @Test
    fun recursivelyReturnTheTest() {
        val tested = SinglyLinkedList<Int>(0)

        tested.add(7)
        tested.add(1)
        tested.add(3)
        tested.add(4)
        tested.add(71)
        tested.add(11)
        tested.add(22)
        tested.add(8)
        tested.add(84)
        tested.add(112)
        tested.add(1174)
        tested.add(11747)

        assertEquals(112, returnKthToLast.recursivelyReturnThe(3, tested)!!.value)

        tested.add(520)
        tested.add(120)

        assertEquals(11747, returnKthToLast.recursivelyReturnThe(3, tested)!!.value)

        tested.clear()
        tested.add(7)
        tested.add(1)
        tested.add(3)

        assertEquals(1, returnKthToLast.recursivelyReturnThe(2, tested)!!.value)
    }

    @Test
    fun iterativelyReturnTheTest() {
        val tested = SinglyLinkedList<Int>(0)

        tested.add(7)
        tested.add(1)
        tested.add(3)
        tested.add(4)
        tested.add(71)
        tested.add(11)
        tested.add(22)
        tested.add(8)
        tested.add(84)
        tested.add(112)
        tested.add(1174)
        tested.add(11747)

        assertEquals(112, returnKthToLast.iterativelyReturnThe(3, tested))

        tested.clear()
        tested.add(7)
        tested.add(1)
        tested.add(3)

        assertEquals(1, returnKthToLast.iterativelyReturnThe(2, tested))
    }

}
