package oop_00000125138_Gilbert.week11

fun String.addGreeting(): String {
    return "Hello, $this"
}

fun String.repeatTimes(n: Int): String {
    return this.repeat(n)
}