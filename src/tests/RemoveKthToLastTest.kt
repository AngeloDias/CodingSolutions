package tests

import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.TestInstance
import secondChapter.RemoveKthToLast

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class RemoveKthToLastTest {
    private lateinit var removeKthToLast: RemoveKthToLast

    @BeforeAll
    fun setup() {
        removeKthToLast = RemoveKthToLast()
    }

    @Test
    fun remove() {
//        removeKthToLast.remove()
    }
}