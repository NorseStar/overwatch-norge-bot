package org.norsestar.overwatchnorgebot.codenames.domain

data class Clue(
    val word: String,
    val count: Int,
    val guessesMade: Int = 0
)
