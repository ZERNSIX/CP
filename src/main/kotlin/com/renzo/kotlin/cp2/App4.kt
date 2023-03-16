package com.renzo.kotlin.cp2

fun main() {
    while (true) {
        val line = readLine() ?: break
        val (n, m) = line.split(" ").map { it.toInt() }
        var current = n
        val sequence = mutableListOf(current)
        while (current > 1) {
            val next = current / m
            if (next * m != current || next >= current) {
                println("Boring!")
                break
            }
            sequence.add(next)
            current = next
        }
        if (current == 1) {
            println(sequence.joinToString(" "))
        }
    }
}