package functionalkubs

import functionalkubs.Part1.captcha
import io.kotlintest.matchers.shouldBe
import org.junit.Test

class Part1Test {
    @Test
    fun `Part 1`() {
        captcha("1122") shouldBe 3
        captcha("1111") shouldBe 4
        captcha("1234") shouldBe 0
        captcha("91212129") shouldBe 9
    }
}