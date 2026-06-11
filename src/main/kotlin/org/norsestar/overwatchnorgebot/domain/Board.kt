package org.norsestar.overwatchnorgebot.domain

class Board(
    words: List<String>
) {
    private val _words = words.toMutableList()

    val words: List<String>
        get() = _words
}