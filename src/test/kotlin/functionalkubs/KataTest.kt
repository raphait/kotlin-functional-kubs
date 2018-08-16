package functionalkubs

import functionalkubs.myFunction
import io.kotlintest.matchers.shouldBe
import org.junit.Test

class KataTest{
    @Test
    fun `should produces`() {
        myFunction("1122") shouldBe 3
        myFunction("1111") shouldBe 4
        myFunction("1234") shouldBe 0
        myFunction("91212129") shouldBe 9
    }
}