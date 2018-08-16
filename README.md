# Functional Kubs - A Taste Of Kotlin

This is the exercise for our [Taste Of Kotlin](https://www.meetup.com/FunctionalKubs/events/253528499/) meetup.

Corresponding slides: [kotlin-functional-kubs](https://slides.com/raphait/k)

## Setting up

Start by cloning this repository:
```
$ git clone https://github.com/raphait/kotlin-functional-kubs.git
```

We recommend installing [IntelliJ IDEA](https://kotlinlang.org/docs/tutorials/getting-started.html) to modify the code. You should be able to open the project in IntelliJ and build and run the tests. If you want to use another editor, that's totally fine too. It's possible to build and test the project using gradle on the command line.

Once you have the repo cloned, cd to the project directory and run:
```
./gradlew test
```

You should see some tests failing. If you do, all good! Up to you to fix them by following the instructions below.

## The Task

We'll be solving [Problem 1 of Advent Of Code 2017](https://adventofcode.com/2017/day/1)

There are 2 parts to the problem. Start with part 1 and continue with part 2 once you're happy with your solution.

### Part 1

You're standing in a room with "digitization quarantine" written in LEDs along one wall. The only door is locked, but it includes a small interface. "Restricted Area - Strictly No Digitized Users Allowed."

It goes on to explain that you may only leave by solving a captcha to prove you're not a human. Apparently, you only get one millisecond to solve the captcha: too fast for a normal human, but it feels like hours to you.

The captcha requires you to review a sequence of digits (your puzzle input) and find the sum of all digits that match the next digit in the list. The list is circular, so the digit after the last digit is the first digit in the list.

For example:

* 1122 produces a sum of 3 (1 + 2) because the first digit (1) matches the second digit and the third digit (2) matches the fourth digit.
* 1111 produces 4 because each digit (all 1) matches the next.
* 1234 produces 0 because no digit matches the next.
* 91212129 produces 9 because the only digit that matches the next one is the last digit, 9.

**Open `src/main/kotlin/functionalkubs/Part1.kt` and implement the captcha() method to make the tests pass.**

Protip: you can run the test suite for part 1 only with:

```
./gradlew test --tests functionalkubs.Part1Test
```

### Part 2

You notice a progress bar that jumps to 50% completion. Apparently, the door isn't yet satisfied, but it did emit a star as encouragement. The instructions change:

Now, instead of considering the next digit, it wants you to consider the digit halfway around the circular list. That is, if your list contains 10 items, only include a digit in your sum if the digit 10/2 = 5 steps forward matches it. Fortunately, your list has an even number of elements.

For example:

* 1212 produces 6: the list contains 4 items, and all four digits match the digit 2 items ahead.
* 1221 produces 0, because every comparison is between a 1 and a 2.
* 123425 produces 4, because both 2s match each other, but no other digit has a match.
* 123123 produces 12.
* 12131415 produces 4.

**Open `src/main/kotlin/functionalkubs/Part2.kt` and implement the captcha() method to make the tests pass.**

Protip: you can run the test suite for part 1 only with:

```
./gradlew test --tests functionalkubs.Part2Test
```

# References

1. [Kotlin docs](https://kotlinlang.org/docs/reference/)
2. [Kotlin-cheat-sheet](https://blog.kotlin-academy.com/kotlin-cheat-sheet-1137588c75a)
