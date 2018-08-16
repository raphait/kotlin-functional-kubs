package functionalkubs

import functionalkubs.Part2.captcha
import io.kotlintest.matchers.shouldBe
import org.junit.Test

class Part2Test {
    @Test
    fun `Part 2`() {
        captcha("1212") shouldBe 6
        captcha("1221") shouldBe 0
        captcha("123425") shouldBe 4
        captcha("123123") shouldBe 12
        captcha("12131415") shouldBe 4
    }
}