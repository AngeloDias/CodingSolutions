package tests

import org.junit.jupiter.api.Test
import org.junit.jupiter.api.TestInstance
import utils.Functions
import kotlin.test.assertEquals

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class FunctionsTest {

    @Test
    fun iterativeFactorialTest() {
        assertEquals(120, Functions.iterativeFactorial(5))
        assertEquals(1, Functions.iterativeFactorial(-2))
        assertEquals(1, Functions.iterativeFactorial(0))
        assertEquals(1, Functions.iterativeFactorial(1))
        assertEquals(3628800, Functions.iterativeFactorial(10))
    }
}