package tests

import Utils.Companion.SinglyLinkedList
import org.hamcrest.CoreMatchers
import org.hamcrest.CoreMatchers.not
import org.hamcrest.MatcherAssert
import org.hamcrest.collection.IsEmptyCollection
import org.junit.jupiter.api.*
import kotlin.test.assertEquals
import kotlin.test.assertFalse
import kotlin.test.assertTrue

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
internal class UtilsTest {
    private lateinit var singlyLinkedList: SinglyLinkedList<Int>

    @BeforeEach
    fun setup() {
        singlyLinkedList = SinglyLinkedList(0)
    }

    @Test
    fun isEmptyTest() {
        assertTrue(singlyLinkedList.isEmpty())

        singlyLinkedList.add(5)
        singlyLinkedList.add(7)
        assertFalse(singlyLinkedList.isEmpty())

        singlyLinkedList.clear()
        assertTrue(singlyLinkedList.isEmpty())
    }

    @Test
    fun addTest() {
        singlyLinkedList.add(5)
        singlyLinkedList.add(7)
        singlyLinkedList.add(8)

        MatcherAssert.assertThat(singlyLinkedList, CoreMatchers.hasItems(5))
        MatcherAssert.assertThat(singlyLinkedList, CoreMatchers.hasItems(7,5))
        MatcherAssert.assertThat(singlyLinkedList, CoreMatchers.hasItems(7,8,5))
    }

    @Test
    fun clearTest() {
        singlyLinkedList.add(0)
        MatcherAssert.assertThat(singlyLinkedList, not(IsEmptyCollection.empty()))

        singlyLinkedList.clear()
        MatcherAssert.assertThat(singlyLinkedList, IsEmptyCollection.empty())
    }

    @Test
    fun firstTest() {
        singlyLinkedList.add(30)

        Assertions.assertNotNull(singlyLinkedList.head)
        assertEquals(singlyLinkedList.head!!.value, singlyLinkedList.first())

        singlyLinkedList.add(31)
        singlyLinkedList.add(37)
        singlyLinkedList.add(33)
        assertEquals(singlyLinkedList.head!!.value, singlyLinkedList.first())
    }

    @Test
    fun lastTest() {
        singlyLinkedList.add(20)
        Assertions.assertNotNull(singlyLinkedList.last())
        assertEquals(20, singlyLinkedList.last())

        singlyLinkedList.add(90)
        singlyLinkedList.add(97)
        singlyLinkedList.add(19)
        assertEquals(19, singlyLinkedList.last())

        singlyLinkedList.removeLast()
        assertEquals(97, singlyLinkedList.last())
    }

}
