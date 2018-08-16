package rapha.meetup.functional.kubs

import io.kotlintest.matchers.contain
import io.kotlintest.matchers.should
import io.kotlintest.matchers.shouldBe
import org.junit.Test

class ExamplesTest {

    @Test
    fun `my test` (){

        "hi".length shouldBe  2

        listOf("orange", "banana") should contain("orange")
    }
}